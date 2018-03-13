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
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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
        PageRequest pageRequest = new PageRequest(0,1);
        System.out.println(courseRepository.findAll(pageRequest));
        System.out.println(pageRequest.getPageNumber());
        System.out.println(pageRequest.next().getPageNumber());
        System.out.println(pageRequest.next().getPageNumber());
    }
}
