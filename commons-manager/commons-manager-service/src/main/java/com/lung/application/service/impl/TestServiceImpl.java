package com.lung.application.service.impl;

import com.lung.application.service.TestService;
import org.springframework.stereotype.Service;

/**
 * @Title: TestServiceImpl
 * @Author: long-zp
 * @Date: 2018/7/3 13:08
 * @version: V1.0
 * @Description: Created with IntelliJ IDEA.
 **/
@Service
public class TestServiceImpl implements TestService {
    @Override
    public Integer getResult() {
        System.out.println("this is service .......");
        return 10;
    }
}
