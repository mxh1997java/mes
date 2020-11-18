package maxinhai.service;

import maxinhai.entity.Factory;

import java.util.List;
import java.util.Map;

public interface FactoryService {

    Factory findOne(Long id);

    Factory findOne(String name);

    List<Factory> findAll();

    List<Factory> findAllByCondition(Map<String, Object> params);

    int save(Factory factory);

    int delete(Long id);

    int update(Factory factory);

}
