package com.lung.common.controller;

import com.lung.common.beans.Result;
import com.lung.common.beans.ResultInfo;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author ChinPangLung
 * <p>
 * Mail:chinpang9527@gmail.com
 * <p>
 * Created by 2018-07-03 下午7:56
 */
@Controller
public class SuperController {

    protected HttpServletRequest request;

    protected HttpServletResponse response;

    protected Integer pageNo;

    protected Integer pageSize;

    @ModelAttribute
    protected void setReqAndRes(HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        this.request = request;
        this.response = response;
        this.pageNo = Integer.valueOf(StringUtils.isEmpty(request.getParameter("pageNo")) ? "1" : request.getParameter("pageNo"));
        this.pageSize = Integer.valueOf(StringUtils.isEmpty(request.getParameter("pageSize")) ? "10" : request.getParameter("pageSize"));
    }


    /**
     * 成功时返回前端提示信息
     *
     * @param message
     * @return
     */
    public ResultInfo success(String message) {
        ResultInfo info = new ResultInfo();
        info.setStatusCode(200);
        info.setMessage(message);
        return info;
    }

    /**
     * 成功时返回前端提示信息
     * <p>
     * 返回前端结果集
     *
     * @param message
     * @param object
     * @return
     */
    public ResultInfo success(String message, Object object) {
        if (object == null) {
            object = "";
        }
        Result info = new Result();
        info.setStatusCode(200);
        info.setMessage(message);
        info.setTotal(1);
        info.setResult(object);
        return info;
    }

    /**
     * @param obj
     *            返回前端结果集 ,提示信息默认为success
     * @return
     */
    protected ResultInfo success(Object obj)
    {
        if (obj == null)
        {
            obj = "";
        }
        Result info = new Result();
        info.setStatusCode(200);
        info.setResult(obj);
        info.setMessage("success");
        info.setTotal(1);
        return info;
    }

    /**
     * @param obj
     *            返回前端结果集 ,提示信息默认为succes
     * @param total
     *            总条数
     * @return
     */
    protected ResultInfo success(Object obj, int total)
    {
        if (obj == null)
        {
            obj = "";
        }

        Result info = new Result();
        info.setStatusCode(200);
        info.setTotal(total);
        info.setResult(obj);
        info.setMessage("success");
        info.setPageNo(pageNo);
        info.setPageSize(pageSize);
        info.setPages((int) (total + pageSize - 1) / pageSize);
        return info;
    }


    /**
     * @param message
     *            发生错误时返回前端提示信息
     * @return
     */
    protected ResultInfo error(String message)
    {
        ResultInfo info = new ResultInfo();
        info.setStatusCode(500);
        info.setMessage(message);
        return info;
    }

}
