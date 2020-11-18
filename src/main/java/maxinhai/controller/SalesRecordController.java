package maxinhai.controller;

import com.alibaba.fastjson.JSONObject;
import maxinhai.entity.SalesRecord;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.*;

@Controller
@Scope(value = "prototype")
public class SalesRecordController extends BaseController {

    public String hello() {
        return "SUCCESS";
    }

    public String error() {
        return "SUCCESS";
    }

    public String success() {
        return "SUCCESS";
    }

    /**
     * 功能描述: 返回Map给前台
     * @Param: []
     * @Return: void
     * @Author: XinHai.Ma
     * @Date: 2020/11/17 22:55
     */
    public void helloMap() {
        Map<String, Object> result = new HashMap<>();
        result.put("message", "请求成功");
        result.put("code", 200);
        result.put("data", 1);
        toResponse(result);
    }

    /**
     * 功能描述: 返回List给前台
     * @Param: []
     * @Return: void
     * @Author: XinHai.Ma
     * @Date: 2020/11/17 22:55
     */
    public void helloList() {
        List<SalesRecord> objectList = new ArrayList<>();
        SalesRecord record = new SalesRecord();
        record.setCreateTime(new Date());
        record.setCreator("admin");
        record.setIsDelete(0);
        objectList.add(record);
        toResponse(objectList);
    }

    public void helloObject() {
        List<SalesRecord> objectList = new ArrayList<>();
        SalesRecord record = new SalesRecord();
        record.setCreateTime(new Date());
        record.setCreator("admin");
        record.setIsDelete(0);
        objectList.add(record);
        Map<String, Object> result = new HashMap<>();
        result.put("message", "请求成功");
        result.put("code", 200);
        result.put("data", objectList);
        JSONObject object = new JSONObject(result);
        toResponse(object);
    }

}
