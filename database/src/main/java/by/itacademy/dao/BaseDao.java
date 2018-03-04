package by.itacademy.dao;


import org.springframework.data.repository.Repository;

import java.util.List;

public interface BaseDao<T> extends Repository<T, Integer> {

    void save(T entity);

    void delete(T entity);

    void update(T entity);

    T findById(int id);

    List<T> findAll();

}
