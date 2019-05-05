package com.mirror.evolution.controller;

import com.mirror.evolution.domain.DTO.RiddleDTO;
import com.mirror.evolution.domain.RiddleBaseInfo;
import com.mirror.evolution.service.RiddleService;
import com.mirror.evolution.utils.ResponseBuilder;
import org.springframework.ext.module.response.Response;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by mirrordingjing
 *
 * @Date 2019/5/5
 */
@RestController
@RequestMapping(value = "/riddle")
public class RiddleController {

    @Resource
    RiddleService riddleService;

    @RequestMapping(method = RequestMethod.GET, value = "/single")
    public Response<RiddleDTO> singleRiddle() throws Exception {
        RiddleBaseInfo riddleBaseInfo = riddleService.getSingleRiddle();
        RiddleDTO riddleDTO = new RiddleDTO();
        riddleDTO.setId(riddleBaseInfo.getId());
        riddleDTO.setQuestion(riddleBaseInfo.getRiddleQuestion());
        riddleDTO.setAnswer(riddleBaseInfo.getRiddleAnswer());
        riddleDTO.setHint(riddleBaseInfo.getRiddleHint());
        riddleDTO.setExplanation(riddleBaseInfo.getRiddleExplanation());
        return ResponseBuilder.ok(riddleDTO);
    }
}
