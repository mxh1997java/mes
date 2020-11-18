package maxinhai.dao;

import org.hibernate.SessionFactory;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * 功能描述: 基础dao接口
 * @Param:
 * @Return:
 * @Author: XinHai.Ma
 * @Date: 2020/11/16 23:08
 */
public interface BaseDao {

    /**
     * 获取SessionFactory
     *
     * @return SessionFactory
     */
    SessionFactory getSessionFactory();

    /**
     * 根据ID加载实体
     *
     * @param entityClazz 实体class
     * @param id          唯一主键
     * @return 实体
     */
    <T> T get(Class<T> entityClazz, Serializable id);


    /**
     * 保存实体
     *
     * @param entity 保存的实体
     * @return 实体
     */
    <T> Serializable save(T entity);

    /**
     * 更新实体
     *
     * @param entity 实体
     */
    <T> void update(T entity);

    /**
     * 更新或保持实体
     *
     * @param entity 实体
     */
    <T> void saveOrUpdate(T entity);

    /**
     * 删除实体
     *
     * @param entity 实体
     */
    <T> void delete(T entity);

    /**
     * 根据ID删除实体
     *
     * @param entityClazz 实体class
     * @param id          唯一主键
     */
    <T> int delete(Class<T> entityClazz, Serializable id);

    /**
     * 删除多个实体根据map
     *
     * @param entityClazz
     * @param fieldDeleteMap
     * @param <T>
     */
    <T> int deleteByMap(Class<T> entityClazz, Map<String, Object> fieldDeleteMap);

    /**
     * 获取该实体所有列表
     *
     * @param entityClazz 实体class
     * @return 实体列表
     */
    <T> List<T> listAll(Class<T> entityClazz);

    /**
     * 获取实体列表，根据类字段的map映射成hql的where过滤<br/>
     * <pre>
     * 例如：实体类
     * class A{
     *   String bField;//字段
     * }
     * Map<String, Object> fieldFilterMap = HashMap<>(2);
     * fieldFilterMap.put("bField" , "ABC");
     * findAllByEntity(A.class, Map<String, Object> fieldFilterMap);
     * 则映射成hql为：select en from A en where en.bField='ABC'查询
     * </pre>
     *
     * @param entityClazz    实体class
     * @param fieldFilterMap 根据实体类的字段对应的值进行过滤
     * @return 实体列表
     */
    <T> List<T> listByMap(Class<T> entityClazz, Map<String, Object> fieldFilterMap);

    /**
     * 获取实体总数
     *
     * @param entityClazz 实体class
     * @return 总数
     */
    <T> long countAll(Class<T> entityClazz);

    /**
     * 获取实体总数
     *
     * @param entityClazz
     * @param fieldFilterMap
     * @param <T>
     * @return
     */
    <T> long countByMap(Class<T> entityClazz, Map<String, Object> fieldFilterMap);

    /**
     * 根据HQL语句查询实体
     *
     * @param hql hql语句
     * @return 实体列表
     */
    List<Object> queryByHql(String hql);

    /**
     * 根据带占位符参数HQL语句查询实体
     *
     * @param hql    hql语句,?0的方式设置占位符号
     *               例如：from Entity where id = ?0 and name = ?1
     * @param params 参数
     * @return 数据列表
     */

    List<Object> queryByHql(String hql, Object... params);


    /**
     * 根据带占位符参数HQL语句查询实体
     *
     * @param hql
     * @param map
     * @return
     */
    List<Object> queryByHql(String hql, Map<String, Object> map);

    /**
     * 使用hql 语句进行分页查询操作
     *
     * @param hql      需要查询的hql语句
     * @param pageNo   查询第pageNo页的记录
     * @param pageSize 每页需要显示的记录数
     * @return 当前页的所有记录
     */
    List<Object> queryByHql(String hql, int pageNo, int pageSize);

    /**
     * 使用hql 语句进行分页查询操作
     *
     * @param hql      需要查询的hql语句,?0的方式设置占位符号
     * @param params   如果hql带占位符参数，params用于传入占位符参数
     *                 例如：from Entity where id = ?0
     * @param pageNo   查询第pageNo页的记录
     * @param pageSize 每页需要显示的记录数
     * @return 当前页的所有记录
     */

    List<Object> queryByHql(String hql, int pageNo, int pageSize, Object... params);

    List<Object> queryByHql(String hql, int pageNo, int pageSize, Map<String, Object> params);


    /**
     * 使用sql语句进行查询操作
     *
     * @param sql 需要查询的sql语句
     * @return 返回查询数据
     */
    List<Map<String, Object>> queryBySql(String sql);

    /**
     * 使用sql语句进行查询操作
     *
     * @param sql    需要查询的sql语句,,?0的方式设置占位符号.
     * @param params 如果sql带占位符参数，params用于传入占位符参数
     *               例如：select * from table where id = :index0 and name = :index1
     * @return 返回查询数据
     */
    List<Map<String, Object>> queryBySql(String sql, Object... params);


    /**
     * 使用sql语句进行查询操作
     *
     * @param sql    需要查询的sql语句
     * @param params 如果sql带占位符参数，params用于传入map结构的占位符参数
     * @return 返回查询数据
     */
    List<Map<String, Object>> queryBySql(String sql, Map<String, Object> params);

    /**
     * 使用sql语句进行查询操作
     *
     * @param sql      需要查询的sql语句
     * @param pageNo   查询第pageNo页的记录
     * @param pageSize 每页需要显示的记录数
     * @return 当前页的所有记录
     */
    List<Map<String, Object>> queryBySqlAndPage(String sql, int pageNo, int pageSize);

    /**
     * 使用sql语句进行查询操作
     *
     * @param sql      需要查询的sql语句
     * @param pageNo   查询第pageNo页的记录
     * @param pageSize 每页需要显示的记录数
     * @param params   如果sql带占位符参数,?0的方式设置占位符号
     * @return 当前页的所有记录
     */
    List<Map<String, Object>> queryBySqlAndPage(String sql, int pageNo, int pageSize, Object... params);

    /**
     * 使用sql语句进行查询操作
     *
     * @param sql      需要查询的sql语句
     * @param pageNo   查询第pageNo页的记录
     * @param pageSize 每页需要显示的记录数
     * @param map      如果sql带占位符参数，params用于传入map结构的占位符参数
     * @return 当前页的所有记录
     */
    List<Map<String, Object>> queryBySqlAndPage(String sql, int pageNo, int pageSize, Map<String, Object> map);

    /**
     * 使用sql语句进行查询操作，返回唯一结果
     *
     * @param sql 需要查询的sql语句
     * @return 返回唯一结果
     */
    Object queryUniqueResult(String sql);

    /**
     * 使用sql语句进行查询操作，返回唯一结果
     *
     * @param sql    需要查询的sql语句
     * @param params 如果sql带占位符参数,?0的方式设置占位符号
     * @return 返回唯一结果
     */
    Object queryUniqueResult(String sql, Object... params);

    /**
     * 使用sql语句进行查询操作，返回唯一结果
     *
     * @param sql 需要查询的sql语句
     * @param map 如果sql带占位符参数，传入map作为参数
     * @return 返回唯一结果
     */
    Object queryUniqueResult(String sql, Map<String, Object> map);

    /**
     * 执行hql语句，返回变化的数量
     *
     * @param hql hql语句
     * @return 变化的数量
     */
    int executeHql(String hql);

    /**
     * 执行hql语句，返回变化的数量
     *
     * @param hql    hql语句
     * @param params hql占位符参数，,?0的方式设置占位符号
     * @return 变化的数量
     */
    int executeHql(String hql, Object... params);

    /**
     * 执行hql语句，返回变化的数量
     *
     * @param hql hql语句
     * @param map hql占位符参数,根据map的key和value设置参数
     * @return 变化的数量
     */
    int executeHql(String hql, Map<String, Object> map);

    /**
     * 执行sql语句，返回变化的数量
     *
     * @param sql sql语句
     * @return 变化的数量
     */
    int executeSql(String sql);

    /**
     * 执行sql语句，返回变化的数量
     *
     * @param sql    sql语句
     * @param params hql占位符参数，,?0的方式设置占位符号
     * @return 变化的数量
     */
    int executeSql(String sql, Object... params);

    /**
     * 执行sql语句，返回变化的数量
     *
     * @param sql sql语句
     * @param map hql占位符参数,根据map的key和value设置参数
     * @return 变化的数量
     */
    int executeSql(String sql, Map<String, Object> map);

}
