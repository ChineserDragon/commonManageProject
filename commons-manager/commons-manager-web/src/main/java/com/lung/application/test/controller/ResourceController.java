package com.lung.application.test.controller;


import com.lung.application.test.api.IResourceService;
import com.lung.application.test.entity.Resource;
import com.lung.common.beans.ResultInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import com.lung.common.controller.SuperController;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 * ��Դ�� 前端控制器
 * </p>
 *
 * @author ChinPangLung
 * @since 2018-10-16
 */
@Controller
@RequestMapping("/resource")
public class ResourceController extends SuperController {

    @Autowired
    IResourceService iResourceService;

    @RequestMapping("testResource")
    @ResponseBody
    public ResultInfo TestResource() {

        Resource resource = iResourceService.selectById(2);

        return success(resource);
    }

}

