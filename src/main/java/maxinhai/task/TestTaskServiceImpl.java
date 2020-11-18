package maxinhai.task;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 功能描述: 定时任务
 * @Param:
 * @Return:
 * @Author: XinHai.Ma
 * @Date: 2020/11/16 23:20
 */
@Component("testTaskService")
public class TestTaskServiceImpl {

    public void printCurrentTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(new Date()));
    }

}
