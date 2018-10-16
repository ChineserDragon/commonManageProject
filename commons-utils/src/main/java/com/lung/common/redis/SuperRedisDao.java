package com.lung.common.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @Title: SuperRedisDao
 * @Author: long-zp
 * @Date: 2018/7/4 9:09
 * @version: V1.0
 * @Description: Created with IntelliJ IDEA.
 **/
public abstract class SuperRedisDao<K, V> {
    @Autowired
    protected RedisTemplate<K,V> redisTemplate;

    public RedisTemplate<K, V> getTemplate() {
        return redisTemplate;
    }

    public void setTemplate(RedisTemplate<K, V> template) {
        this.redisTemplate = template;
    }
}
