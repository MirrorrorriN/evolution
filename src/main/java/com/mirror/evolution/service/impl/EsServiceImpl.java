package com.mirror.evolution.service.impl;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mirror.evolution.domain.DTO.RiddleDTO;
import com.mirror.evolution.service.EsService;
import io.searchbox.client.JestClient;
import io.searchbox.client.JestResult;
import io.searchbox.core.Search;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by mirrordingjing
 *
 * @Date 2019/5/8
 */
@Service("esService")
public class EsServiceImpl implements EsService {
    private final Logger logger = LoggerFactory.getLogger(EsServiceImpl.class);

    @Value("${es.index}")
    private String indexName;

    @Value("${es.type}")
    private String typeName;

    @Autowired
    private JestClient jestClient;

    @Override
    //TODO 分页
    public List<RiddleDTO> searchRiddle(String keyword) throws Exception{
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
        searchSourceBuilder.query(QueryBuilders.matchQuery("_all", keyword));
        Search search = new Search.Builder(searchSourceBuilder.toString()).addIndex(indexName).addType(typeName).build();
        try {
            JestResult jestResult = jestClient.execute(search);
            logger.info("获取ES信息成功！");
            return this.transferRiddleInfo(jestResult.getJsonObject());
        } catch (IOException e) {
            logger.error("获取ES信息读写异常：" + e.getMessage());
            throw e;
        } catch (Exception e) {
            logger.error("获取ES信息异常：" + e.getMessage());
            e.printStackTrace();
            throw e;
        }
    }

    private List<RiddleDTO> transferRiddleInfo(JsonObject jsonObject) {
        JsonArray jsonArray = jsonObject.getAsJsonObject("hits").getAsJsonArray("hits");
        List<RiddleDTO> riddleDTOList = new ArrayList<>();
        try {
            Iterator it = jsonArray.iterator();
            while (it.hasNext()) {
                JsonObject riddleData = ((JsonObject) it.next()).getAsJsonObject("_source");
                RiddleDTO riddleDTO = new RiddleDTO();
                riddleDTO.setId(Long.valueOf(riddleData.getAsJsonPrimitive("id").toString().replace("\"", "")));
                riddleDTO.setQuestion(riddleData.getAsJsonPrimitive("riddle_question").toString().replace("\"", ""));
                riddleDTO.setAnswer(riddleData.getAsJsonPrimitive("riddle_answer").toString().replace("\"", ""));
                riddleDTO.setExplanation(riddleData.getAsJsonPrimitive("riddle_explanation").toString().replace("\"", ""));
                riddleDTO.setHint(riddleData.getAsJsonPrimitive("riddle_hint").toString().replace("\"", ""));
                riddleDTOList.add(riddleDTO);
            }
        } catch (ClassCastException e) {
            logger.error("类型转化错误" + e.getMessage());
            throw e;
        }
        return riddleDTOList;
    }
}
