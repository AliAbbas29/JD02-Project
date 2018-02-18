package by.itacademy.service;

import by.itacademy.config.ServiceConfig;
import by.itacademy.entity.Course;
import by.itacademy.entity.Subject;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class SomeService {
    //    public List<Course> findByFilter(Subject subject, String specialization, String city, int offset, int limit) {
//        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        session.beginTransaction();
//        List<Course> courses = session.createQuery("select c from Course c where c.subject =:subj and c.specialization=:spec and c.address.city=:cit")
//                .setParameter("subj", subject)
//                .setParameter("spec", specialization)
//                .setParameter("cit", city)
//                .setFirstResult(offset)
//                .setMaxResults(limit).getResultList();
//        courses.forEach(System.out::println);
//        session.getTransaction().commit();
//        session.close();
//        sessionFactory.close();
//        return courses;
//    }
//    public int getNoOfRecords(List<Course> courses) {
//        return courses.size();
//    }
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ServiceConfig.class);
        List<Course> courses = context.getBean(CourseFilterServiceImpl.class).findByFilter(Subject.Programming, "java", "London", 0, 5);
        courses.forEach(System.out::println);
    }
}
