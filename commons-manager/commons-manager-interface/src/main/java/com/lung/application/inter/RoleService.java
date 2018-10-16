package com.lung.application.inter;

import com.lung.application.model.Role;

import java.util.List;

/**
 * @Title: RoleService
 * @Author: long-zp
 * @Date: 2018/7/5 8:58
 * @version: V1.0
 * @Description: Created with IntelliJ IDEA.
 **/
public interface RoleService {

    Role queryRoleById(Integer id);

    List<Role> queryRoleList();
}
