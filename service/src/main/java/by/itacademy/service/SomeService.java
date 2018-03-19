package by.itacademy.service;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class SomeService {


    //    public List<Course> findByFilter(Subject subject, String specialization, String city, int offset, int limit) {
//        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        session.beginTransaction();
//        List<Course> studentsCourses = session.createQuery("select c from Course c where c.subject =:subj and c.specialization=:spec and c.address.city=:cit")
//                .setParameter("subj", subject)
//                .setParameter("spec", specialization)
//                .setParameter("cit", city)
//                .setFirstResult(offset)
//                .setMaxResults(limit).getResultList();
//        studentsCourses.forEach(System.out::println);
//        session.getTransaction().commit();
//        session.close();
//        sessionFactory.close();
//        return studentsCourses;
//    }
//
////    public static void main(String[] args) {
////
////        System.out.println(getNoOfRecords(new SomeService().findByFilter(Subject.Programming, "java", "London", 0, 5)));
////    }
//
//    public int getNoOfRecords(List<Course> studentsCourses) {
//        return studentsCourses.size();
//    }


    public static void main(String[] args) {
        //AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ServiceConfig.class);
//        ipDao.findAll().forEach(System.out::println);
//        InstructorProgDao ipDao = context.getBean(InstructorProgDao.class);
//        CourseFilterService service = context.getBean(CourseFilterService.class);
//        List<Course> studentsCourses = service.findByFilter(Subject.Programming, "java", "London", 0, 5);
//        studentsCourses.forEach(System.out::println);
    }

}
