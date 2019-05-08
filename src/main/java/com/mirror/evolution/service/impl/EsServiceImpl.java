package com.mirror.evolution.service.impl;

import com.google.gson.JsonObject;
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
    public JsonObject searchRiddle(String keyword) {
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
        searchSourceBuilder.query(QueryBuilders.matchQuery("_all",keyword));
        Search search = new Search.Builder(searchSourceBuilder.toString()).addIndex(indexName).addType(typeName).build();
        try{
            JestResult jestResult = jestClient.execute(search);
            logger.info("获取ES信息成功！");
            return  jestResult.getJsonObject();
        }catch (IOException e){
            logger.error("获取ES信息异常：" + e.getMessage());
            return null;
        } catch (Exception e){
            logger.error("获取ES信息异常：" + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}
