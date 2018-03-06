package by.itacademy;

import by.itacademy.config.Config;
import by.itacademy.repository.CourseRepository;
import by.itacademy.repository.GradeRepository;
import by.itacademy.repository.InstructorLangRepository;
import by.itacademy.repository.InstructorProgRepository;
import by.itacademy.repository.ReviewRepository;
import by.itacademy.repository.StudentRepository;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

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

    @org.junit.Test
    public void test() {
        System.out.println(reviewRepository.findById(1));
        System.out.println(gradeRepository.findById(1));
        System.out.println(studentRepository.findById(1));
    }
}
