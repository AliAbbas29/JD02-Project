package by.itacademy.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public abstract class BaseDaoImpl<T> implements BaseDao<T> {


    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(T entity) {
        Session session = sessionFactory.getCurrentSession();
        session.save(entity);
    }

    @Override
    public void delete(T entity) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(entity);
    }

    @Override
    public void update(T entity) {
        Session session = sessionFactory.getCurrentSession();
        session.update(entity);
    }

    @Override
    public T findById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.find(getEntityClass(), id);
    }

    @Override
    public List<T> findAll() {
        Session session = sessionFactory.getCurrentSession();
        org.hibernate.query.Query<T> query = session.createQuery("select i from " + getEntityClass().getSimpleName() + " i ", getEntityClass());
        return query.getResultList();
    }


    protected abstract Class<T> getEntityClass();
}
