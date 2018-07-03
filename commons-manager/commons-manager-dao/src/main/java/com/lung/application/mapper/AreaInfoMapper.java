package com.lung.application.mapper;

import com.lung.application.pojo.AreaInfo;
import com.lung.application.pojo.AreaInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AreaInfoMapper {
    int countByExample(AreaInfoExample example);

    int deleteByExample(AreaInfoExample example);

    int deleteByPrimaryKey(Long area_id);

    int insert(AreaInfo record);

    int insertSelective(AreaInfo record);

    List<AreaInfo> selectByExample(AreaInfoExample example);

    AreaInfo selectByPrimaryKey(Long area_id);

    int updateByExampleSelective(@Param("record") AreaInfo record, @Param("example") AreaInfoExample example);

    int updateByExample(@Param("record") AreaInfo record, @Param("example") AreaInfoExample example);

    int updateByPrimaryKeySelective(AreaInfo record);

    int updateByPrimaryKey(AreaInfo record);
}