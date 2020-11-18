package maxinhai.dao;

import maxinhai.entity.Factory;
import maxinhai.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FactoryDaoImpl extends BaseServiceImpl<Factory> {

    /**
     * 功能描述: 根据name查询
     * @Param: [name]
     * @Return: maxinhai.entity.Factory
     * @Author: XinHai.Ma
     * @Date: 2020/11/18 21:45
     */
    public Factory findByName(String name) {
        String sql = " from Factory f where f.name='" + name +"'";
        List<Object> objectList = baseDao.queryByHql(sql);
        return (Factory) objectList.get(0);
    }

}
