package maxinhai.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * 功能描述: 基础service
 * @Param:
 * @Return:
 * @Author: XinHai.Ma
 * @Date: 2020/11/16 23:13
 */
public interface BaseService<E> {

    /**
     * 保存
     */
    Serializable save(E entity);

    /**
     * 删除根据id
     */
    int delete(Serializable id);

    /**
     * 删除根据map条件
     */
    int deleteByMap(Map<String, Object> fieldFilterMap);

    /**
     * 删除
     */
    void delete(E entity);

    /**
     * 删除根据实体类
     */
    void update(E entity);

    /**
     * 保存或者更新
     */
    void saveOrUpdate(E entity);

    /**
     * 查询根据id
     */
    E get(Serializable id);

    /**
     * 查询所有
     */
    List<E> listAll();

    /**
     * 查询根据map条件
     */
    List<E> listByMap(Map<String, Object> fieldFilterMap);

    /**
     * 查询个数
     */
    long countAll();

    /**
     * 查询个数根据map条件
     */
    long countByMap(Map<String, Object> fieldFilterMap);

}
