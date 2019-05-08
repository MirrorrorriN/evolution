package com.mirror.evolution.service;

import com.google.gson.JsonObject;
import com.mirror.evolution.domain.DTO.RiddleDTO;

import java.util.List;

/**
 * Created by mirrordingjing
 *
 * @Date 2019/5/8
 */
public interface EsService {
    List<RiddleDTO> searchRiddle(String keyword) throws Exception;
}
