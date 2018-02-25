package by.itacademy.service;

import by.itacademy.config.ServiceConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
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
//
////    public static void main(String[] args) {
////
////        System.out.println(getNoOfRecords(new SomeService().findByFilter(Subject.Programming, "java", "London", 0, 5)));
////    }
//
//    public int getNoOfRecords(List<Course> courses) {
//        return courses.size();
//    }


    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ServiceConfig.class);
//        ipDao.findAll().forEach(System.out::println);
//        InstructorProgDao ipDao = context.getBean(InstructorProgDao.class);
//        CourseFilterService service = context.getBean(CourseFilterService.class);
//        List<Course> courses = service.findByFilter(Subject.Programming, "java", "London", 0, 5);
//        courses.forEach(System.out::println);
    }

}
