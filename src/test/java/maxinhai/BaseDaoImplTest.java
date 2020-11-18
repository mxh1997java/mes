package maxinhai;

import maxinhai.dao.FactoryDaoImpl;
import maxinhai.entity.Factory;
import maxinhai.service.impl.FactoryServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;

/**
 * 功能描述: 基础dao测试用例
 * @Param:
 * @Return:
 * @Author: XinHai.Ma
 * @Date: 2020/11/16 23:29
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring.xml")
public class BaseDaoImplTest {

    @Resource
    private FactoryServiceImpl factoryService;

    @Test
    public void test() {
        Factory factory = new Factory();
        factory.setName("西安阿尔斯通永济电器公司");
        factory.setCode("XA_001");
        factory.setAddress("西安市未央区草滩三路伏特龙");
        factory.setCreateTime(new Date());
        factory.setCreator("maxinhai");
        factory.setIsDelete(0);
        factory.setIsActive(0);
        factoryService.save(factory);
    }

}
