package com.lung.common.utils;

//import com.commons.utils.modules.core.util.SecurityUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.*;


public final class PropertyPlaceholder extends PropertyPlaceholderConfigurer {
    private static final byte[] KEY = {9, -1, 0, 5, 39, 8, 6, 19};
    private static Map<String, String> ctxPropertiesMap;
    private List<String> decryptProperties;

    @Override
    protected void loadProperties(Properties props) throws IOException {
        super.loadProperties(props);
        ctxPropertiesMap = new HashMap<String, String>();
        for (Object key : props.keySet()) {
            String keyStr = key.toString();
            String value = props.getProperty(keyStr);
//            if (decryptProperties != null && decryptProperties.contains(keyStr)) {
//                value = SecurityUtil.decryptDes(value, KEY);
//                props.setProperty(keyStr, value);
//            }
            ctxPropertiesMap.put(keyStr, value);
        }
    }

    /**
//     * @param decryptPropertiesMap the decryptPropertiesMap to set
     */
    public void setDecryptProperties(List<String> decryptProperties) {
        this.decryptProperties = decryptProperties;
    }

    /**
     * Get a value based on key , if key does not exist , null is returned
     * 
     * @param key
     * @return
     */
    public static String getString(String key) {
        try {
            return ctxPropertiesMap.get(key);
        } catch (MissingResourceException e) {
            return null;
        }
    }

    /**
     * 根据key获取值
     * 
     * @param key
     * @return
     */
    public static int getInt(String key) {
        return Integer.parseInt(ctxPropertiesMap.get(key));
    }

    /**
     * 根据key获取值
     * 
     * @param key
     * @param defaultValue
     * @return
     */
    public static int getInt(String key, int defaultValue) {
        String value = ctxPropertiesMap.get(key);
        if (StringUtils.isBlank(value)) {
            return defaultValue;
        }
        return Integer.parseInt(value);
    }

    /**
     * 根据key获取值
     * @param key
     * @param defaultValue
     * @return
     */
    public static boolean getBoolean(String key, boolean defaultValue) {
        String value = ctxPropertiesMap.get(key);
        if (StringUtils.isBlank(value)) {
            return defaultValue;
        }
        return new Boolean(value);
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        String key="15f5b4adbd82c245a5a01763";
        String data="Pek7d5FLdYmqBIrpk7yBpA2bZVSfWNQ2uUXU0K5aCQilG1zFn00agPN7JG5dT03p";
        byte[] bytes = key.getBytes("UTF-8");
//        System.out.println(SecurityUtil.decryptDes(key,data.getBytes("UTF-8")));
    }
}
