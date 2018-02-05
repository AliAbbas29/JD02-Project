package by.itacademy;

import by.itacademy.entity.*;
import org.hibernate.Session;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;

public class MappingTest extends BaseTest {

    @Test
    public void CourseTest() {

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        InstructorProg progMan = new InstructorProg("Jimbo", "JAVA", 5);
        InstructorLang engMan = new InstructorLang("Jhon", "french", 3);
        session.save(progMan);
        session.save(engMan);
        Course java = new Course(Subject.Programming, "java", new Address("Minsk", "Gikalo 9", 9), progMan);
        Course ruby = new Course(Subject.Programming, "ruby", new Address("GOMEL", "Gik 99", 98), progMan);
        session.save(java);
        session.save(ruby);
        Student student = new Student("Karl", 80449873920L, new Address("Brest", "Vostochnaya 8", 11), java);
        session.save(student);
        Grade grade = new Grade(8, student, java);
        session.save(grade);
        session.getTransaction().commit();

        Assert.assertThat(session.find(InstructorProg.class,1).getName(),is("Jimbo"));
        Assert.assertThat(session.find(InstructorLang.class,2).getName(),is("Jhon"));
        Assert.assertThat(session.find(Course.class,1).getSpecialization(),is("java"));
        Assert.assertThat(session.find(Student.class,1).getName(),is("Karl"));
        Assert.assertThat(session.find(Grade.class,1).getValue(),is(8));
        session.close();
    }

}