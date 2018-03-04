package by.itacademy.dao;

import by.itacademy.entity.Course;

/**
 * Created by SAM19 on 04.03.2018.
 */
public interface CourseRepository extends org.springframework.data.repository.Repository<Course, Integer> {
    Course findById(Integer id);
    void deleteById(Integer id);
}
