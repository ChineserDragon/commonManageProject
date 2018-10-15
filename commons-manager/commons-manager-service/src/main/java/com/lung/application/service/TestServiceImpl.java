package com.lung.application.service;

import com.lung.application.inter.RoleService;
import com.lung.application.inter.TestService;
import com.lung.application.mapper.AreaInfoMapper;
import com.lung.application.mapper.RoleMapper;
import com.lung.application.mapper.UserMapper;
import com.lung.application.pojo.AreaInfo;
import com.lung.application.pojo.AreaInfoExample;
import com.lung.application.pojo.User;
import com.lung.application.pojo.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Title: TestServiceImpl
 * @Author: long-zp
 * @Date: 2018/7/3 13:08
 * @version: V1.0
 * @Description: Created with IntelliJ IDEA.
 **/
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    AreaInfoMapper areaInfoMapper;

    @Autowired
    RoleMapper roleMapper;

    @Autowired
    UserMapper userMapper;

    @Override

    public Integer getResult() {
        System.out.println("this is service .......");
        return 10;
    }

    @Override
    public AreaInfo queryAreaInfo(Long areaCode) {
        AreaInfoExample example = new AreaInfoExample();
        AreaInfoExample.Criteria criteria = example.createCriteria();
        criteria.andArea_codeEqualTo(areaCode);
        List<AreaInfo> areaInfos = areaInfoMapper.selectByExample(example);
        return areaInfos.get(0);
    }

    @Override
    public Boolean saveUser() {
        User user = new User();
        user.setLoginName("long");
        user.setUserName("lzp");
        user.setUserType(1);
        user.setIdcard("441203199211210934");
        user.setIsAvailable(1);
        user.setPhoneNum("17666598033");
        user.setPassword("123456");
        userMapper.insert(user);
        int i = 10 / 0;
        User user2 = new User();
        user2.setLoginName("long2");
        user2.setUserName("lzp2");
        user2.setUserType(1);
        user2.setIdcard("441203199211210944");
        user2.setIsAvailable(1);
        user2.setPhoneNum("17666598034");
        user2.setPassword("123456");
        userMapper.insert(user2);
        return true;
    }

}
