package com.lung.common.beans;

import lombok.Data;

import java.io.Serializable;

/**
 * @author ChinPangLung
 * <p>
 * Mail:chinpang9527@gmail.com
 * <p>
 * Created by 2018-07-03 下午8:01
 */
@Data
public class ResultInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer statusCode;

    private String message;
}
