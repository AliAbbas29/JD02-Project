package by.itacademy;

import by.itacademy.entity.Instructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

 class SomeService {
     List<Instructor> writeExample() {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        org.hibernate.query.Query<Instructor> query = session.createQuery("select i from Instructor  i", Instructor.class);
        List<Instructor> instructors = query.getResultList();
//        for (Instructor i : instructors) {
//            System.out.println(i);
//        }
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
        return instructors;
    }
}
