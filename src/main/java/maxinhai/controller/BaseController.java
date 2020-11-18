package maxinhai.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

/**
 * 功能描述: 基础Action
 * @Param:
 * @Return:
 * @Author: XinHai.Ma
 * @Date: 2020/11/16 23:22
 */
public class BaseController extends ActionSupport implements RequestAware, SessionAware, ApplicationAware {

    protected Map<String, Object> requestMap;

    protected Map<String, Object> applicationMap;

    protected Map<String, Object> sessionMap;

    @Override
    public void setApplication(Map<String, Object> map) {
        this.applicationMap = map;
    }

    @Override
    public void setRequest(Map<String, Object> map) {
        this.requestMap = map;
    }

    @Override
    public void setSession(Map<String, Object> map) {
        this.sessionMap = map;
    }

    /**
     * 功能描述: 将数据转化为JSON并返回给前台
     * @Param: [object]
     * @Return: void
     * @Author: XinHai.Ma
     * @Date: 2020/11/17 22:51
     */
    public void toResponse(Object object) {
        HttpServletResponse response = ServletActionContext.getResponse();
        response.setContentType("application/json;charset=utf-8");
        PrintWriter writer;
        try {
            writer = response.getWriter();
            writer.print(JSON.toJSONString(object));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
