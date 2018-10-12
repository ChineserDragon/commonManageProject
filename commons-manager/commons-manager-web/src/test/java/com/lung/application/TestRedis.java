package com.lung.application;

import com.lung.common.redis.BaseRedisDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/spring/spring-introduce.xml",
        "classpath*:/spring/springmvc.xml"})
public class TestRedis {

    @Autowired
    BaseRedisDao baseRedisDao;

    @Test
    public void TestRedis() {
        try {
            boolean set = baseRedisDao.set("baseRedisKey", "baseRedisvalue");
            System.out.println(set);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
