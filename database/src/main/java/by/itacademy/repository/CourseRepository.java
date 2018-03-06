package by.itacademy.repository;

import by.itacademy.entity.Course;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface CourseRepository extends Repository<Course, Integer> {
    void save(Course course);

    void delete(Course course);

    Course findById(Integer id);

    List<Course> findAll();
}
