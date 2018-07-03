package com.lung.common.beans;

import lombok.Data;

/**
 * @author ChinPangLung
 * <p>
 * Mail:chinpang9527@gmail.com
 * <p>
 * Created by 2018-07-03 下午8:12
 */
@Data
public class Result extends ResultInfo {

    private static final long serialVersionUID = 1L;

    private Integer total;

    private Integer pageNo;

    private Integer pageSize;

    private Integer pages;   // 总页数

    private Object result; // 返回结果

}
