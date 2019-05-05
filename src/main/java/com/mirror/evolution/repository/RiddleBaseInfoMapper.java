package com.mirror.evolution.repository;

import com.mirror.evolution.domain.RiddleBaseInfo;
import com.mirror.evolution.domain.RiddleBaseInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface RiddleBaseInfoMapper {
    long countByExample(RiddleBaseInfoExample example);

    int deleteByExample(RiddleBaseInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RiddleBaseInfo record);

    int insertSelective(RiddleBaseInfo record);

    List<RiddleBaseInfo> selectByExampleWithRowbounds(RiddleBaseInfoExample example, RowBounds rowBounds);

    List<RiddleBaseInfo> selectByExample(RiddleBaseInfoExample example);

    RiddleBaseInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RiddleBaseInfo record, @Param("example") RiddleBaseInfoExample example);

    int updateByExample(@Param("record") RiddleBaseInfo record, @Param("example") RiddleBaseInfoExample example);

    int updateByPrimaryKeySelective(RiddleBaseInfo record);

    int updateByPrimaryKey(RiddleBaseInfo record);
}