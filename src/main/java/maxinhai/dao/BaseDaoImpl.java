package maxinhai.dao;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 功能描述: 基础dao层
 * @Param:
 * @Return:
 * @Author: XinHai.Ma
 * @Date: 2020/11/16 23:08
 */
@Repository("baseDaoImpl")
public class BaseDaoImpl implements BaseDao {


    private static final Object[] EMPTY_OBJECT_ARRAY = {};
    private static final Map<String, Object> EMPTY_MAP = new HashMap<>(2);

    @Resource
    private SessionFactory sessionFactory;

    @Override
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    private Session getSession() {
        return getSessionFactory().getCurrentSession();
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T> T get(Class<T> entityClazz, Serializable id) {
        return (T) getSession().get(entityClazz, id);
    }


    @Override
    public <T> Serializable save(T entity) {
        return getSession().save(entity);
    }

    @Override
    public <T> void update(T entity) {
        getSession().update(entity);
    }

    public <T> void saveOrUpdate(T entity) {
        getSession().saveOrUpdate(entity);
    }

    @Override
    public <T> void delete(T entity) {
        getSession().delete(entity);
    }

    @Override
    public <T> int delete(Class<T> entityClazz, Serializable id) {
        Map<String, Object> fieldFilterMap = new HashMap<>(2);
        fieldFilterMap.put("id", id);
        return deleteByMap(entityClazz, fieldFilterMap);
    }

    @Override
    public <T> int deleteByMap(Class<T> entityClazz, Map<String, Object> fieldDeleteMap) {

        StringBuilder sb = buildHql("DELETE ", entityClazz.getSimpleName(), " en WHERE 1 = 1 ");

        appendEqualsCondition(fieldDeleteMap, sb);

        Query query = getSession().createQuery(sb.toString());

        setParamsByMap(fieldDeleteMap, query);

        return query.executeUpdate();

    }

    /**
     * 追加equals条件
     *
     * @param fieldFilterMap 类字段参数map
     * @param sb             hql语句
     */
    private void appendEqualsCondition(Map<String, Object> fieldFilterMap, StringBuilder sb) {
        if (null != fieldFilterMap) {
            for (Map.Entry<String, Object> en : fieldFilterMap.entrySet()) {
                String key = en.getKey().trim();
                sb.append(" and en.").append(key);
                sb.append(" = :").append(key);
            }
        }
    }

    @Override
    public <T> List<T> listAll(Class<T> entityClazz) {
        return listByMap(entityClazz, EMPTY_MAP);
    }

    @SuppressWarnings("unchecked")
    public <T> List<T> listByMap(Class<T> entityClazz, Map<String, Object> fieldFilterMap) {

        StringBuilder sb = buildHql("FROM ", entityClazz.getSimpleName(), " en WHERE 1 = 1 ");

        appendEqualsCondition(fieldFilterMap, sb);

        Query query = getSession().createQuery(sb.toString());

        setParamsByMap(fieldFilterMap, query);

        return (List<T>) query.list();
    }

    @Override
    public <T> long countAll(Class<T> entityClazz) {
        return countByMap(entityClazz, null);
    }

    @Override
    public <T> long countByMap(Class<T> entityClazz, Map<String, Object> fieldFilterMap) {

        StringBuilder sb = buildHql("SELECT COUNT(*) FROM ", entityClazz.getSimpleName(), " en WHERE 1 = 1 ");

        appendEqualsCondition(fieldFilterMap, sb);

        List<?> l = queryByHql(sb.toString(), fieldFilterMap);

        if (null != l && 1 == l.size()) {
            return (Long) l.get(0);
        }
        return 0;
    }

    @Override
    public List<Object> queryByHql(String hql) {
        return queryByHql(hql, EMPTY_OBJECT_ARRAY);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Object> queryByHql(String hql, Object... params) {

        Query query = getSession().createQuery(hql);

        setParamsByArray(query, params);

        return query.list();
    }

    @Override
    public List<Object> queryByHql(String hql, Map<String, Object> map) {
        Query query = getSession().createQuery(hql);

        setParamsByMap(map, query);

        return query.list();
    }

    @Override
    public List<Object> queryByHql(String hql, int pageNo, int pageSize) {
        return queryByHql(hql, pageNo, pageSize, EMPTY_OBJECT_ARRAY);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Object> queryByHql(String hql, int pageNo, int pageSize, Object... params) {

        Query query = getSession().createQuery(hql);

        setPageParam(pageNo, pageSize, query);

        setParamsByArray(query, params);

        return (List<Object>) query.list();
    }

    @Override
    public List<Object> queryByHql(String hql, int pageNo, int pageSize, Map<String, Object> params) {

        Query query = getSession().createQuery(hql);

        setPageParam(pageNo, pageSize, query);

        setParamsByMap(params, query);

        return (List<Object>) query.list();
    }


    @Override
    public List<Map<String, Object>> queryBySql(String sql) {
        return queryBySql(sql, EMPTY_OBJECT_ARRAY);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Map<String, Object>> queryBySql(String sql, Object... params) {

        SQLQuery sqlQuery = getSession().createSQLQuery(sql);

        sqlQuery.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);

        setParamsByArray(sqlQuery, params);

        return (List<Map<String, Object>>) sqlQuery.list();
    }

    public List<Map<String, Object>> queryBySql(String sql, Map<String, Object> map) {

        SQLQuery sqlQuery = getSession().createSQLQuery(sql);

        sqlQuery.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);

        setParamsByMap(map, sqlQuery);

        return (List<Map<String, Object>>) sqlQuery.list();
    }


    @Override
    public List<Map<String, Object>> queryBySqlAndPage(String sql, int pageNo, int pageSize) {
        return queryBySqlAndPage(sql, pageNo, pageSize, EMPTY_OBJECT_ARRAY);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Map<String, Object>> queryBySqlAndPage(String sql, int pageNo, int pageSize, Object... params) {

        SQLQuery sqlQuery = getSession().createSQLQuery(sql);

        sqlQuery.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);

        setPageParam(pageNo, pageSize, sqlQuery);

        setParamsByArray(sqlQuery, params);

        return (List<Map<String, Object>>) sqlQuery.list();
    }

    public List<Map<String, Object>> queryBySqlAndPage(String sql, int pageNo, int pageSize, Map<String, Object> map) {

        SQLQuery sqlQuery = getSession().createSQLQuery(sql);

        sqlQuery.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);

        setPageParam(pageNo, pageSize, sqlQuery);

        setParamsByMap(map, sqlQuery);

        return (List<Map<String, Object>>) sqlQuery.list();
    }

    @Override
    public Object queryUniqueResult(String sql) {
        return queryUniqueResult(sql, EMPTY_OBJECT_ARRAY);
    }

    @Override
    public Object queryUniqueResult(String sql, Object... params) {

        SQLQuery sqlQuery = getSession().createSQLQuery(sql);

        setParamsByArray(sqlQuery, params);

        return sqlQuery.uniqueResult();
    }

    @Override
    public Object queryUniqueResult(String sql, Map<String, Object> map) {

        SQLQuery sqlQuery = getSession().createSQLQuery(sql);

        setParamsByMap(map, sqlQuery);

        return sqlQuery.uniqueResult();
    }

    @Override
    public int executeHql(String hql) {

        return executeHql(hql, EMPTY_OBJECT_ARRAY);
    }

    @Override
    public int executeHql(String hql, Object... params) {

        Query query = getSession().createQuery(hql);

        setParamsByArray(query, params);

        return query.executeUpdate();
    }

    @Override
    public int executeHql(String hql, Map<String, Object> map) {

        Query query = getSession().createQuery(hql);

        setParamsByMap(map, query);

        return query.executeUpdate();
    }

    @Override
    public int executeSql(String sql) {

        return executeSql(sql, EMPTY_OBJECT_ARRAY);
    }

    @Override
    public int executeSql(String sql, Object... params) {

        Query query = getSession().createSQLQuery(sql);

        setParamsByArray(query, params);

        return query.executeUpdate();
    }

    @Override
    public int executeSql(String sql, Map<String, Object> map) {

        Query query = getSession().createSQLQuery(sql);

        setParamsByMap(map, query);

        return query.executeUpdate();
    }

    /**
     * 根据数组设置org.hibernate.Query查询参数，?0的方式设置占位符号
     *
     * @param query org.hibernate.Query
     * @param array 数组
     */
    private void setParamsByArray(Query query, Object[] array) {
        if (null != array) {
            for (int i = 0, len = array.length; i < len; i++) {
                query.setParameter(String.valueOf(i), array[i]);
            }
        }
    }

    private StringBuilder buildHql(String keyword, String className, String where) {
        StringBuilder sb = new StringBuilder(keyword);
        sb.append(className).append(where);
        return sb;
    }

    /**
     * 设置分页参数
     *
     * @param pageNo   第几页
     * @param pageSize 每页多少数目
     * @param query    org.hibernate.Query
     */
    private void setPageParam(int pageNo, int pageSize, Query query) {
        query.setFirstResult((pageNo - 1) * pageSize);
        query.setMaxResults(pageSize);
    }

    /**
     * 根据map的key和value设置org.hibernate.Query查询参数
     *
     * @param map   map
     * @param query org.hibernate.Query
     */
    private void setParamsByMap(Map<String, Object> map, Query query) {

        if (null != query && null != map && map.size() > 0) {
            for (Map.Entry<String, Object> each : map.entrySet()) {
                String key = each.getKey();
                Object value = each.getValue();
                if (null == value) {
                    query.setParameter(key, value);
                } else if (value.getClass().isArray()) {
                    query.setParameterList(key, (Object[]) value);
                } else if (value instanceof Collection) {
                    query.setParameterList(key, (Collection) value);
                } else {
                    query.setParameter(key, value);
                }
            }
        }
    }

}
