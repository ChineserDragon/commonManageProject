package com.lung.common.redis.impl;

import com.lung.common.redis.BaseRedisDao;
import com.lung.common.redis.SuperRedisDao;
import com.lung.common.utils.BeanUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.ValueOperations;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @Title: BaseRedisDaoImpl
 * @Author: long-zp
 * @Date: 2018/7/4 9:29
 * @version: V1.0
 * @Description: Created with IntelliJ IDEA.
 **/
public class BaseRedisDaoImpl extends SuperRedisDao<String, String> implements BaseRedisDao {

    @Override
    public boolean hSet(String key, Map<String, String> map) throws Exception {
        try {
            if (StringUtils.isEmpty(key)) {
                throw new RuntimeException("key 为空");
            }
            HashOperations<String, Object, Object> stringObjectObjectHashOperations = redisTemplate.opsForHash();
            stringObjectObjectHashOperations.putAll(key, map);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean hSet(String key, Map<String, String> map, long time, TimeUnit unit) throws Exception {
        if (StringUtils.isEmpty(key)) {
            throw new RuntimeException(" key为空 ");
        }
        if (null == unit) {
            throw new RuntimeException("时间单位为空");
        }
        if (time <= 0) {
            throw new RuntimeException("时间小于0");
        }
        HashOperations<String, String, String> op = redisTemplate.opsForHash();
        op.putAll(key, map);
        redisTemplate.expire(key, time, unit);
        return true;
    }

    @Override
    public <T> boolean hSet(String key, T obj) {
        Map<String, String> map = BeanUtils.toStringMap(obj);
        try {
            this.hSet(key, map);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public <T> boolean hSet(String key, T obj, long time, TimeUnit unit) {
        Map<String, String> map = BeanUtils.toStringMap(obj);
        try {
            this.hSet(key, map, time, unit);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean set(String key, String value) throws Exception {
        if (StringUtils.isEmpty(key)) {
            throw new RuntimeException(" key为空 ");
        }
        ValueOperations<String, String> op = redisTemplate.opsForValue();
        op.set(key, value);
        return true;
    }

    @Override
    public boolean set(String key, String value, long timeout, TimeUnit unit) throws Exception {
        try {
            ValueOperations<String, String> op = redisTemplate.opsForValue();
            if (null == unit) {
                throw new RuntimeException("时间单位为空");
            }
            if (StringUtils.isEmpty(key)) {
                throw new RuntimeException("时间单位为空");
            }
            if (timeout <= 0) {
                throw new RuntimeException("时间小于0");
            }
            op.set(key, value, timeout, unit);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public String get(String key) throws Exception {
        if (StringUtils.isEmpty(key)) {
            throw new RuntimeException(" key为空 ");
        }
        try {
            ValueOperations<String, String> op = redisTemplate.opsForValue();
            String value = op.get(key);
            return value;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    @Override
    public String hget(String key, String field) throws Exception {
        if (StringUtils.isEmpty(key)) {
            throw new RuntimeException(" key为空 ");
        }
        try {
            HashOperations<String, String, String> op = redisTemplate.opsForHash();
            return op.get(key, field);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    @Override
    public <T> T hgetObject(String key, Class<T> beanClass) throws Exception {
        return null;
    }

    @Override
    public Long increment(String key, String field, long val) {
        if (StringUtils.isEmpty(key)) {
            throw new RuntimeException(" key为空 ");
        }
        HashOperations<String, String, String> op = redisTemplate.opsForHash();
        return op.increment(key, field, val);
    }

    @Override
    public Double increment(String key, String field, double val) {
        if (StringUtils.isEmpty(key)) {
            throw new RuntimeException(" key为空");
        }
        HashOperations<String, String, String> op = redisTemplate.opsForHash();
        return op.increment(key, field, val);
    }

    @Override
    public Map<String, String> hgetAll(String key) throws Exception {
        if (StringUtils.isEmpty(key)) {
            throw new RuntimeException(" key为空 ");
        }
        Map<String, String> map = new HashMap<String, String>();
        if (!StringUtils.isEmpty(key)) {
            try {
                HashOperations<String, String, String> op = redisTemplate.opsForHash();
                map = op.entries(key);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return map;
    }

    @Override
    public void delByKey(String key) {
        if (StringUtils.isEmpty(key)) {
            throw new RuntimeException(" key为空 ");
        }
        redisTemplate.delete(key);

    }

    @Override
    public boolean expire(String key, long time, TimeUnit unit) throws Exception {
        return redisTemplate.expire(key, time, unit);
    }
}
