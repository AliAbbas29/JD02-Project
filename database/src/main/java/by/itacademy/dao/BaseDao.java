package by.itacademy.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public abstract class BaseDao<T> {
    private static final SessionFactory SESSION_FACTORY = new Configuration().configure().buildSessionFactory();

    public void save(T entity) {
        Session session = SESSION_FACTORY.openSession();
        session.beginTransaction();
        session.save(entity);
        session.getTransaction().commit();
        session.close();
    }

    public void delete(T entity) {
        Session session = SESSION_FACTORY.openSession();
        session.beginTransaction();
        session.delete(entity);
        session.getTransaction().commit();
        session.close();
    }

    public void update(T entity) {
        Session session = SESSION_FACTORY.openSession();
        session.beginTransaction();
        session.update(entity);
        session.getTransaction().commit();
        session.close();
    }

    public T findById(int id) {
        Session session = SESSION_FACTORY.openSession();
        session.beginTransaction();
        T entity = session.find(getEntityClass(), id);
        session.getTransaction().commit();
        session.close();
        return entity;
    }

    public List<T> findAll() {
        Session session = SESSION_FACTORY.openSession();
        session.beginTransaction();
        org.hibernate.query.Query<T> query = session.createQuery("select i from " + getEntityClass().getSimpleName() + " i ", getEntityClass());
        List<T> entity = query.getResultList();
        session.getTransaction().commit();
        session.close();
        return entity;
    }

    public void sessionClose() {
        SESSION_FACTORY.close();
    }


    protected abstract Class<T> getEntityClass();
}
