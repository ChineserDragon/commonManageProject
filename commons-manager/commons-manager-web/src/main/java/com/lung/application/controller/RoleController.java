package com.lung.application.controller;

import com.baomidou.mybatisplus.plugins.pagination.PageHelper;
import com.lung.application.inter.RoleService;
import com.lung.application.model.Role;
import com.lung.common.beans.ResultInfo;
import com.lung.common.controller.SuperController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Title: RoleController
 * @Author: long-zp
 * @Date: 2018/7/5 9:01
 * @version: V1.0
 * @Description: Created with IntelliJ IDEA.
 **/
@RestController
@RequestMapping(value = "role")
public class RoleController extends SuperController {

    @Autowired
    private RoleService roleService;

    @RequestMapping(value = "queryById")
    public ResultInfo queryRoleById(Integer id) {
        if (id == null) {
            return error("by zreo");
        }
        Role role = roleService.queryRoleById(id);
        return success(role);
    }

    @RequestMapping(value = "queryRoleList")
    public ResultInfo queryRoleList(){
//        PageHelper.startPage(pageNo,pageSize);
        List<Role> roles = roleService.queryRoleList();
        return success(roles);
    }

}
