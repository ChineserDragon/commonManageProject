package com.lung.application.service;

import com.lung.application.inter.TestService;
import com.lung.application.mapper.AreaInfoMapper;
import com.lung.application.pojo.AreaInfo;
import com.lung.application.pojo.AreaInfoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Title: TestServiceImpl
 * @Author: long-zp
 * @Date: 2018/7/3 13:08
 * @version: V1.0
 * 
 * @Description: Created with IntelliJ IDEA.
 **/
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    AreaInfoMapper areaInfoMapper;

    @Override
    public Integer getResult() {
        System.out.println("this is service .......");
        return 10;
    }

    @Override
    public AreaInfo queryAreaInfo(Long areaCode) {
        AreaInfoExample example=new AreaInfoExample();
        AreaInfoExample.Criteria criteria = example.createCriteria();
        criteria.andArea_codeEqualTo(areaCode);
        List<AreaInfo> areaInfos = areaInfoMapper.selectByExample(example);
        return areaInfos.get(0);
    }
}
