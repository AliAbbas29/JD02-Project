package by.itacademy.dao;


import java.util.List;

public interface BaseDao<T> {

    void save(T entity);

    void delete(T entity);

    void update(T entity);

    T findById(int id);

    List<T> findAll();
}
