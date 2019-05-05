package com.mirror.evolution.service;

import com.mirror.evolution.domain.RiddleBaseInfo;
import com.mirror.evolution.domain.RiddleBaseInfoExample;
import com.mirror.evolution.repository.RiddleBaseInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by mirrordingjing
 *
 * @Date 2019/5/5
 */
@Service
public class RiddleService {

    @Autowired
    RiddleBaseInfoMapper riddleBaseInfoMapper;

    @Transactional
    public RiddleBaseInfo getSingleRiddle(){
        RiddleBaseInfoExample riddleBaseInfoExample=new RiddleBaseInfoExample();
        long total=riddleBaseInfoMapper.countByExample(riddleBaseInfoExample);
        long randomIndex=(long)(Math.random()*total);
        RiddleBaseInfo riddleBaseInfo=riddleBaseInfoMapper.selectByPrimaryKey(randomIndex);

        return riddleBaseInfo;
    }

}
