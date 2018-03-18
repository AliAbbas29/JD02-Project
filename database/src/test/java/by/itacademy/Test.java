package by.itacademy;

import by.itacademy.config.Config;
import by.itacademy.entity.Role;
import by.itacademy.entity.User;
import by.itacademy.repository.CourseRepository;
import by.itacademy.repository.GradeRepository;
import by.itacademy.repository.InstructorLangRepository;
import by.itacademy.repository.InstructorProgRepository;
import by.itacademy.repository.ReviewRepository;
import by.itacademy.repository.StudentRepository;
import by.itacademy.repository.UserRepository;
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

    @Autowired
    private UserRepository userRepository;

    @org.junit.Test
    public void test() {
//        PageRequest pageRequest = new PageRequest(0,1);
//        System.out.println(courseRepository.findById(1));
//        System.out.println(courseRepository.findAll(pageRequest));
//        System.out.println(pageRequest.getPageNumber());
//        System.out.println(pageRequest.next().getPageNumber());
//        System.out.println(pageRequest.next().getPageNumber());
       User user = userRepository.findById(1);
        Role role = user.getRole();
        System.out.println(role.getName());

    }
}
