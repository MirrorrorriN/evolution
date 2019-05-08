package com.mirror.evolution.controller;

import com.google.gson.JsonObject;
import com.mirror.evolution.service.EsService;
import com.mirror.evolution.utils.ResponseBuilder;
import org.springframework.ext.module.response.Response;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by mirrordingjing
 *
 * @Date 2019/5/8
 */
@RestController
@RequestMapping(value = "/elasticsearch")
public class EsController {
    @Resource
    EsService esService;

    @RequestMapping(value = "riddle",method = RequestMethod.GET)
    Response<JsonObject> searchRiddle(@RequestParam String keyword){
        JsonObject data=esService.searchRiddle(keyword);
        //FIXME 返回数据格式化
        return ResponseBuilder.ok(data);
    }
}
