package by.itacademy;

import by.itacademy.config.Config;
import by.itacademy.dao.CourseRepository;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = Config.class)
public class Test {

    @Autowired
    CourseRepository courseRepository;

    @org.junit.Test
    public void test() {
        courseRepository.deleteById(1);
    }
}
