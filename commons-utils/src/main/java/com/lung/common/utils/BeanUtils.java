package com.lung.common.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

/**
 * 对象工具类
 *
 * @Title: BeanUtils
 * @Author: long-zp
 * @Date: 2018/7/4 9:35
 * @version: V1.0
 * @Description: Created with IntelliJ IDEA.
 **/
public class BeanUtils {

    /**
     * Map转对象
     *
     * @param map
     * @param beanClz
     * @param <T>
     * @return
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    private static <T> T toObject(Map<String, Object> map, Class<T> beanClz) throws IllegalAccessException, InstantiationException {
        if (map == null) {
            return null;
        }
        T object = beanClz.newInstance();
        Field[] fields = object.getClass().getDeclaredFields();
        for (Field field : fields) {
            int mod = field.getModifiers();
            if (Modifier.isStatic(mod) || Modifier.isFinal(mod)) {
                continue;
            }
            field.setAccessible(true);
            field.set(object, map.get(field.getName()));
        }
        return object;
    }

    /**
     * 反射obj转换为map<String,String>
     *
     * @param obj
     * @param <T>
     * @return
     */
    public static <T> Map<String, String> toStringMap(T obj) {
        if (obj == null) {
            throw new NullPointerException(" 实体对象为空 ");
        }
        Map<String, String> map = new HashMap<String, String>();
        Class<? extends Object> c = obj.getClass();
        Field[] fs = c.getDeclaredFields();
        for (Field temp : fs) {
            try {
                temp.setAccessible(true);
                Object val = temp.get(obj);
                map.put(temp.getName(), val == null ? "" : val.toString());
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return map;
    }

    /**
     * @param obj
     * @return
     * @throws Exception
     */
    public static Map<String, Object> toMap(Object obj) throws Exception {
        if (obj == null) {
            return null;
        }
        Map<String, Object> map = new HashMap<String, Object>();

        Field[] declaredFields = obj.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);
            map.put(field.getName(), field.get(obj));
        }
        return map;
    }
}
