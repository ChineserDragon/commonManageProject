package com.lung.common.utils;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;
import java.net.URLEncoder;
import java.util.Map;

/**
 * @Title: WebUtil
 * @Author: long-zp
 * @Date: 2018/7/4 12:36
 * @version: V1.0
 * @Description: Created with IntelliJ IDEA.
 **/
public class WebUtil {

    /**
     * 判断是否是ajax请求
     *
     * @param request
     * @return
     */
    public static boolean isAjax(HttpServletRequest request) {
        if (!StringUtils.isEmpty(request.getHeader("x-requested-with")) && StringUtils.equalsIgnoreCase("XMLHttpRequest", request.getHeader("x-requested-with"))) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 获取访问用户的真实IP地址
     *
     * @param request
     * @return
     */
    public static String getIpAddr(HttpServletRequest request) {
        String addr = request.getHeader("x-forwarded-for");
        if (addr == null || addr.length() == 0 || StringUtils.equalsIgnoreCase("unknown", addr)) {
            addr = request.getHeader("Proxy-Client-IP");
        }
        if (addr == null || addr.length() == 0 || StringUtils.equalsIgnoreCase("unknown", addr)) {
            addr = request.getHeader("WL-Proxy-Client-IP");
        }
        if (addr == null || addr.length() == 0 || StringUtils.equalsIgnoreCase("unknown", addr)) {
            addr = request.getRemoteAddr();
        }
        return addr;
    }

    /**
     * 获取访问Url的域名
     *
     * @param request
     * @return
     */
    public static String getDomainName(HttpServletRequest request) {
        StringBuffer url = request.getRequestURL();
        String contextUrl = url.delete(url.length() - request.getRequestURI().length(), url.length()).toString();
        if (contextUrl.lastIndexOf(":") != -1) {
            return contextUrl.substring(0, contextUrl.lastIndexOf(":"));
        }
        return contextUrl;
    }

    /**
     * 获取cookie值
     *
     * @param request
     * @param name
     * @return
     */
    public static String getCookieValue(HttpServletRequest request, String name) {
        Cookie[] cookies = request.getCookies();
        String value = "";
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                String cookieIdentity = cookie.getName();
                if (cookieIdentity.equals(name)) {
                    value = cookie.getValue();
                }
            }
        }
        return value;
    }

    /**
     * 设置cookie
     *
     * @param response
     * @param map
     * @param maxAge   设置cookie
     * @throws Exception
     */
    public static void addCookie(HttpServletResponse response, Map<String, Object> map, int maxAge) throws Exception {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String name = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                URLEncoder.encode(value.toString(), "utf-8");
                Cookie cookie = new Cookie(name, value.toString());
                cookie.setPath("/");
                if (maxAge > 0)
                    cookie.setMaxAge(maxAge);
                response.addCookie(cookie);
            }
        }
    }

    /**
     * 写出数据
     *
     * @param res
     * @param response 输出的字符串
     */
    public static void write(String res, HttpServletResponse response) {
        Writer writer = null;
        try {
            res = (null == res ? "" : res);
            response.setCharacterEncoding("UTF-8");
            response.setHeader("Content-type", "text/html;charset=UTF-8");
            writer = response.getWriter();
            writer.write(res);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            IOUtils.closeQuietly(writer);
        }
    }

    /**
     * 根据key清空cookie
     *
     * @param response
     * @param key
     * @throws Exception
     */
    public static void clearCookieByKey(HttpServletResponse response, String key) throws Exception {
        if (!StringUtils.isEmpty(key)) {
            Cookie cookie = new Cookie(key, null);
            cookie.setPath("/");
            cookie.setMaxAge(0);
            response.addCookie(cookie);
        }
    }
}
