package com.lung.common.redis;

import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @Title: BaseRedisDao
 * @Author: long-zp
 * @Date: 2018/7/4 9:11
 * @version: V1.0
 * @Description: Created with IntelliJ IDEA.
 **/
public interface BaseRedisDao {

    /**
     * 保存map对象 redis类型hash
     *
     * @param key
     * @param map
     * @return
     * @throws Exception
     */
    boolean hSet(String key, Map<String, String> map) throws Exception;

    /**
     * 保存map对象 redis类型hash
     *
     * @param key
     * @param map
     * @param time key存活时间
     * @param unit 时间的单位 TimeUnit 时间单位枚举枚举
     * @return
     * @throws Exception
     */
    boolean hSet(String key, Map<String, String> map, long time, TimeUnit unit) throws Exception;

    /**
     * redis保存实体对象
     *
     * @param key redis key
     * @param obj 实体对象
     * @param <T>
     * @return
     */
    <T> boolean hSet(String key, T obj);

    /**
     * redis保存实体对象 并且设置有效时间
     *
     * @param key  redis key
     * @param obj  实体对象
     * @param time 时间
     * @param unit 时间单位
     * @param <T>
     * @return
     */
    <T> boolean hSet(String key, T obj, long time, TimeUnit unit);

    /**
     * 保存String 类型
     *
     * @param key
     * @param value
     * @return
     * @throws Exception
     */
    boolean set(String key, String value) throws Exception;

    /**
     * 保存String类型 并且设定有效时间
     *
     * @param key
     * @param value
     * @param timeout
     * @param unit
     * @return
     * @throws Exception
     */
    boolean set(String key, String value, long timeout, TimeUnit unit) throws Exception;

    /**
     * 获取 String类型值
     *
     * @param key
     * @return
     * @throws Exception
     */
    String get(String key) throws Exception;

    /**
     * 获取hash属性值
     *
     * @param key
     * @param field
     * @return
     * @throws Exception
     */
    String hget(String key, String field) throws Exception;

    /**
     * 获取hash属性值
     *
     * @param key
     * @param beanClass
     * @param <T>
     * @return
     * @throws Exception
     */
    <T> T hgetObject(String key, Class<T> beanClass) throws Exception;

    /**
     * hash 属性值递增
     *
     * @param key
     * @param field
     * @param val
     * @return
     */
    Long increment(String key, String field, long val);

    /**
     * hash 属性值递增
     *
     * @param key
     * @param field
     * @param val
     * @return
     */
    Double increment(String key, String field, double val);

    /**
     * 获取hash所有属性值
     *
     * @param key
     * @return
     * @throws Exception
     */
    Map<String, String> hgetAll(String key) throws Exception;

    /**
     * 从reids删除指定key记录
     *
     * @param key
     */
    void delByKey(String key);

    /**
     * 设置key有效时间
     *
     * @param key
     * @param time
     * @param unit
     * @return
     * @throws Exception
     */
    boolean expire(String key, long time, TimeUnit unit) throws Exception;
}
