package by.itacademy;

import by.itacademy.dao.CourseRepository;
import by.itacademy.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;

public class ComeOn {

    @Autowired
    private static CourseRepository courseRepository;

    private  String subject;

    public static void main(String[] args) {
        System.out.println(courseRepository.findById(1));
    }
}
