package by.itacademy;

import by.itacademy.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class CourseMapping {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        InstructorLang sue = new InstructorLang("Sue", "german", 3);
        session.save(sue);
        Course german = new Course(Subject.Language, "german", new Address("GOMEL", "Gik 99", 98), sue);
        session.save(german);
        Student sam = new Student("Sam",80447019375L, new Address("Minsk","Vic.Sq 14", 154));
        Student max = new Student("Max",80293931469L, new Address("Minsk","Lidskaya 33", 76));
        sam.addCourse(german);
        max.addCourse(german);
        session.save(sam);
        session.save(max);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}
