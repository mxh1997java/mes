package maxinhai.service.impl;

import maxinhai.dao.BaseDaoImpl;
import maxinhai.service.BaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Map;

public class BaseServiceImpl<E> implements BaseService<E> {


    @Resource
    protected BaseDaoImpl baseDao;

    protected final Class<E> clazz;
    {
        try {
            ParameterizedType parameterizedType = (ParameterizedType) this.getClass().getGenericSuperclass();
            clazz = (Class<E>) parameterizedType.getActualTypeArguments()[0];
        } catch (Exception e) {
            throw new RuntimeException("未声明实体泛型,继承BaseService需要按照规范!!!");
        }
    }

    @Override
    public Serializable save(E entity) {
        return baseDao.save(entity);
    }

    @Override
    public int delete(Serializable id) {
        return baseDao.delete(clazz, id);
    }

    @Override
    public int deleteByMap(Map<String, Object> fieldFilterMap) {
        return baseDao.deleteByMap(clazz, fieldFilterMap);
    }

    @Override
    public void delete(E entity) {
        baseDao.delete(entity);
    }

    @Override
    public void update(E entity) {
        baseDao.update(entity);
    }

    @Override
    public void saveOrUpdate(E entity) {
        baseDao.saveOrUpdate(entity);
    }

    @Override
    public E get(Serializable id) {
        return baseDao.get(clazz, id);
    }

    @Override
    public List<E> listAll() {
        return baseDao.listAll(clazz);
    }

    @Override
    public List<E> listByMap(Map<String, Object> fieldFilterMap) {
        return baseDao.listByMap(clazz, fieldFilterMap);
    }

    @Override
    public long countAll() {
        return baseDao.countAll(clazz);
    }

    @Override
    public long countByMap(Map<String, Object> fieldFilterMap) {
        return baseDao.countByMap(clazz, fieldFilterMap);
    }

}
