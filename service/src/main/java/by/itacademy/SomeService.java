package by.itacademy;

import by.itacademy.entity.Course;
import by.itacademy.entity.Subject;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

class SomeService {


    List<Course> findByFilter(Subject subject, String specialization, String city, int offset, int limit) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        List<Course> courses = session.createQuery("select c from Course c where c.subject =:subj and c.specialization=:spec and c.address.city=:cit").setParameter("subj", subject)
                .setParameter("spec", specialization)
                .setParameter("cit", city)
                .setFirstResult(offset)
                .setMaxResults(limit).getResultList();
        courses.forEach(System.out::println);
        //Subject.valueOf(specialization);
        int id = 2;
        session.createQuery("select c from Course c where c.id=:set").setParameter("set", id).setFirstResult(offset).setMaxResults(limit).getResultList().forEach(System.out::println);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
        return courses;
    }

//    public static void main(String[] args) {
//
//        System.out.println(getNoOfRecords(new SomeService().findByFilter(Subject.Programming,"java","London",0,5)));
//    }

    int getNoOfRecords(List<Course> courses) {
        return courses.size();
    }
}
