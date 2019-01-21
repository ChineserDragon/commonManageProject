package com.lung.application.controller;

import com.lung.application.inter.RoleService;
import com.lung.application.model.Role;
import com.lung.common.beans.ResultInfo;
import com.lung.common.controller.SuperController;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @ApiOperation(value = "根据Id获取角色",notes = "get请求，返回json数据")
    @ApiImplicitParam(name = "id",value = "角色ID",required = true,dataType = "Integer")
    @RequestMapping(value = "queryById",method = RequestMethod.GET)
    public ResultInfo queryRoleById(@RequestParam(value = "id",required = true) Integer id) {
//        if (id == null) {
//            return error("by zreo");
//        }
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
