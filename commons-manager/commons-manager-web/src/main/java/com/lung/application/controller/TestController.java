package com.lung.application.controller;

import com.lung.application.inter.TestService;
import com.lung.application.pojo.AreaInfo;
import com.lung.common.beans.ResultInfo;
import com.lung.common.controller.SuperController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Title: TestController
 * @Author: long-zp
 * @Date: 2018/7/3 13:05
 * @version: V1.0
 * @Description: Created with IntelliJ IDEA.
 **/
@Controller
@RequestMapping(value = "test")
public class TestController extends SuperController {

    @Autowired
    TestService testService;

    @RequestMapping(value = "home")
    public ModelAndView toHome(){
        Integer result = testService.getResult();
        System.out.println("this is controller ......"+result);
        return new ModelAndView("index");
    }

    @ResponseBody
    @RequestMapping(value = "queryAreaInfo")
    public ResultInfo queryAreaInfo(@RequestParam Long areaCode) {
        AreaInfo areaInfo = testService.queryAreaInfo(areaCode);
        return success(areaInfo);
    }
}
