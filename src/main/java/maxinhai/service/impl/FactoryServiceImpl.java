package maxinhai.service.impl;

import maxinhai.dao.FactoryDaoImpl;
import maxinhai.entity.Factory;
import maxinhai.service.FactoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * 功能描述: 工厂service
 * @Param:
 * @Return:
 * @Author: XinHai.Ma
 * @Date: 2020/11/18 21:40
 */
@Service
public class FactoryServiceImpl implements FactoryService {

    @Resource
    private FactoryDaoImpl factoryDao;

    @Override
    public Factory findOne(Long id) {
        return factoryDao.get(id);
    }

    @Override
    public Factory findOne(String name) {
        return factoryDao.findByName(name);
    }

    @Override
    public List<Factory> findAll() {
        return factoryDao.listAll();
    }

    @Override
    public List<Factory> findAllByCondition(Map<String, Object> params) {
        return factoryDao.listByMap(params);
    }

    @Override
    @Transactional
    public int save(Factory factory) {
        Serializable save = factoryDao.save(factory);
        return 1;
    }

    @Override
    public int delete(Long id) {
        return factoryDao.delete(id);
    }

    @Override
    public int update(Factory factory) {
        factoryDao.update(factory);
        return 1;
    }
}
