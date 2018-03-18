//package by.itacademy.service;
//
//
//import by.itacademy.entity.Course;
//import by.itacademy.entity.Subject;
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//
//@Service
//@Transactional
//public class CourseFilterServiceImpl implements CourseFilterService {
//
//    private final
//    SessionFactory sessionFactory;
//
//    @Autowired
//    public CourseFilterServiceImpl(SessionFactory sessionFactory) {
//        this.sessionFactory = sessionFactory;
//    }
//
//    @Override
//    public List<Course> findByFilter(Subject subject, String specialization, String city, int offset, int limit) {
//        List<Course> courses = sessionFactory.getCurrentSession().createQuery("select c from Course c where c.subject =:subj and c.specialization=:spec and c.address.city=:cit", Course.class)
//                .setParameter("subj", subject)
//                .setParameter("spec", specialization)
//                .setParameter("cit", city)
//                .setFirstResult(offset)
//                .setMaxResults(limit).getResultList();
//        return courses;
//    }
//
//    @Override
//    public int getNoOfRecords(List<Course> courses) {
//        return courses.size();
//    }
//}
