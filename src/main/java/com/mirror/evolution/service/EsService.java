package com.mirror.evolution.service;

import com.google.gson.JsonObject;

/**
 * Created by mirrordingjing
 *
 * @Date 2019/5/8
 */
public interface EsService {
    JsonObject searchRiddle(String keyword);
}
