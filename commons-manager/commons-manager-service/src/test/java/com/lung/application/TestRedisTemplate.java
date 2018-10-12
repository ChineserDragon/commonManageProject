package com.lung.application;

import com.lung.common.redis.BaseRedisDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/spring/spring-introduce.xml"})
public class TestRedisTemplate {

    @Autowired
    BaseRedisDao baseRedisDao;

    @Test
    public void testRedis() {
        try {
            boolean set = baseRedisDao.set("testKey", "testvalue");
            System.out.println(set);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
