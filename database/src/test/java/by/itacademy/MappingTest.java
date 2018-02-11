package by.itacademy;

import by.itacademy.dao.StudentDao;
import by.itacademy.entity.Address;
import by.itacademy.entity.Student;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;

public class MappingTest extends BaseTest {

    @Test
    public void CourseTest() {
        Student sue = new Student("Sue", 80253932149L, new Address("London", "Trafalguar sq. 14", 22));
        StudentDao studentDao = new StudentDao();
        studentDao.save(sue);
        Assert.assertThat(studentDao.findById(1).getName(), is("Sue"));
        Student sam = studentDao.findById(1);
        sam.setName("Sam");
        studentDao.update(sam);
        Assert.assertThat(studentDao.findById(1).getName(), is("Sam"));
        studentDao.delete(studentDao.findById(1));
        studentDao.save(sue);
        studentDao.save(sam);
        List<Student> students = studentDao.findAll();
        Assert.assertThat(students.get(1).getName(), is("Sam"));
        studentDao.sessionClose();
    }
}
