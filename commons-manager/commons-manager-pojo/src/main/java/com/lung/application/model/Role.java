package com.lung.application.model;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Title: Role
 * @Author: long-zp
 * @Date: 2018/7/5 8:53
 * @version: V1.0
 * @Description: Created with IntelliJ IDEA.
 **/
@Data
public class Role extends Model<Role> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "role_id", type = IdType.AUTO)
    private Long roleId;
    private String name;
    private String description;
    @TableField("is_available")
    private Integer isAvailable;
    @TableField("create_time")
    private Date createTime;
    @TableField("operate_time")
    private Date operateTime;

    @Override
    protected Serializable pkVal() {
        return null;
    }
}
