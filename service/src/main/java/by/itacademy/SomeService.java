package by.itacademy;

import by.itacademy.dao.InstructorDao;
import by.itacademy.entity.Instructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

class SomeService {
    List<Instructor> writeExample() {
        List<Instructor> instructor = new InstructorDao().findAll();
        instructor.forEach(System.out::println);
        return instructor;
    }

    List<Instructor> findByFilter(int offset, int limit) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        List<Instructor> instructor = session.createQuery("select i from Instructor i").setFirstResult(offset).setMaxResults(limit).getResultList();
        instructor.forEach(System.out::println);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
        return instructor;
    }
}
