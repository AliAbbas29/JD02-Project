package by.itacademy;

import by.itacademy.config.Config;
import by.itacademy.entity.Address;
import by.itacademy.entity.Course;
import by.itacademy.entity.Student;
import by.itacademy.entity.User;
import by.itacademy.repository.CourseRepository;
import by.itacademy.repository.GradeRepository;
import by.itacademy.repository.InstructorLangRepository;
import by.itacademy.repository.InstructorProgRepository;
import by.itacademy.repository.InstructorRepository;
import by.itacademy.repository.ReviewRepository;
import by.itacademy.repository.StudentRepository;
import by.itacademy.repository.UserRepository;
import net.sf.ehcache.CacheManager;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = Config.class)
public class Test {

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private InstructorLangRepository instructorLangRepository;

    @Autowired
    private InstructorProgRepository instructorProgRepository;

    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private GradeRepository gradeRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private InstructorRepository instructorRepository;

    @org.junit.Test
    public void test() {
//        Course course = courseRepository.findById(1);
//        int size = CacheManager.ALL_CACHE_MANAGERS.get(0).getCache("myCache").getSize();
//        System.out.println(size);
//        Course course1 = courseRepository.findById(1);
        User user = userRepository.findById(1);
        System.out.println(user.getPassword());
        Course course = new Course();
    }
}
