package com.lung.application.inter;

import com.lung.application.pojo.AreaInfo;

/**
 * @Title: TestService
 * @Author: long-zp
 * @Date: 2018/7/3 13:07
 * @version: V1.0
 * @Description: Created with IntelliJ IDEA.
 **/
public interface TestService {

    Integer getResult();

    AreaInfo queryAreaInfo(Long areaCode);

    Boolean saveUser();
}
