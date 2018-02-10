package by.itacademy.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.List;

public abstract class BaseDao<T> {

    public void save(T entity) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(entity);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }

    public void delete(T entity) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(entity);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }

    public void update(T entity) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(entity);
        session.getTransaction();
        session.close();
        sessionFactory.close();
    }

    public T findById(int id) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        T entity = session.find(getEntityClass(), id);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
        return entity;
    }

    public List<T> findAll() {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        org.hibernate.query.Query<T> query = session.createQuery("select i from " + getEntityClass().getSimpleName() + " i ", getEntityClass());
        List<T> entity = query.getResultList();
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
        return entity;
    }


    protected abstract Class<T> getEntityClass();
}
