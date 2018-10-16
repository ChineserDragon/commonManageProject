package com.lung.application.test.service;

import com.lung.application.test.entity.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/spring-introduce.xml"})
public class IResourceServiceImplTest {

    @Autowired
    IResourceServiceImpl iResourceService;

    @Test
    public void TestMybitesPlusGenerator() {
        Resource resource = iResourceService.selectById(2);
        System.out.println(resource.toString());
    }

}