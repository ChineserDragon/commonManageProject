package com.lung.application.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.pagination.PageHelper;
import com.lung.application.inter.RoleService;
import com.lung.application.mapper.RoleMapper;
import com.lung.application.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Title: RoleServiceImpl
 * @Author: long-zp
 * @Date: 2018/7/5 8:58
 * @version: V1.0
 * @Description: Created with IntelliJ IDEA.
 **/
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public Role queryRoleById(Integer id) {
        Role role = roleMapper.selectById(id);
        return role;
    }

    @Override
    public List<Role> queryRoleList() {
        List<Role> roles = roleMapper.selectList(new EntityWrapper<Role>());
        return roles;
    }
}
