package com.lung.application.test.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * ��Դ��
 * </p>
 *
 * @author ChinPangLung
 * @since 2018-10-16
 */
public class Resource extends Model<Resource> {

    private static final long serialVersionUID = 1L;

	@TableId(value="resource_id", type= IdType.AUTO)
	private Long resourceId;
    /**
     * 菜单名称
     */
	private String name;
    /**
     * 菜单图标
     */
	private String icon;
    /**
     * 菜单对应的vue组件
     */
	private String component;
    /**
     * 菜单标题
     */
	private String title;
    /**
     * 链接
     */
	private String path;
    /**
     * 排序
     */
	private Integer sort;
    /**
     * 上级资源
     */
	@TableField("parent_id")
	private Long parentId;
    /**
     * 描述
     */
	private String description;
    /**
     * 是否可用
     */
	@TableField("is_available")
	private Integer isAvailable;
	private String hidden;
	private String redirect;
	@TableField("always_show")
	private String alwaysShow;
    /**
     * ����ʱ��
     */
	@TableField("create_time")
	private Date createTime;
    /**
     * ����ʱ��
     */
	@TableField("operate_time")
	private Date operateTime;


	public Long getResourceId() {
		return resourceId;
	}

	public void setResourceId(Long resourceId) {
		this.resourceId = resourceId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getComponent() {
		return component;
	}

	public void setComponent(String component) {
		this.component = component;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(Integer isAvailable) {
		this.isAvailable = isAvailable;
	}

	public String getHidden() {
		return hidden;
	}

	public void setHidden(String hidden) {
		this.hidden = hidden;
	}

	public String getRedirect() {
		return redirect;
	}

	public void setRedirect(String redirect) {
		this.redirect = redirect;
	}

	public String getAlwaysShow() {
		return alwaysShow;
	}

	public void setAlwaysShow(String alwaysShow) {
		this.alwaysShow = alwaysShow;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getOperateTime() {
		return operateTime;
	}

	public void setOperateTime(Date operateTime) {
		this.operateTime = operateTime;
	}

	@Override
	protected Serializable pkVal() {
		return this.resourceId;
	}

	@Override
	public String toString() {
		return "Resource{" +
			"resourceId=" + resourceId +
			", name=" + name +
			", icon=" + icon +
			", component=" + component +
			", title=" + title +
			", path=" + path +
			", sort=" + sort +
			", parentId=" + parentId +
			", description=" + description +
			", isAvailable=" + isAvailable +
			", hidden=" + hidden +
			", redirect=" + redirect +
			", alwaysShow=" + alwaysShow +
			", createTime=" + createTime +
			", operateTime=" + operateTime +
			"}";
	}
}
