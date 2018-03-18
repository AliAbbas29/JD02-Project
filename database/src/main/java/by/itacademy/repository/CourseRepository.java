package by.itacademy.repository;

import by.itacademy.entity.Course;
import by.itacademy.entity.Subject;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface CourseRepository extends Repository<Course, Integer> {
    void save(Course course);

    void delete(Course course);

    void deleteById(Integer id);

    Course findById(Integer id);

    List<Course> findAll();

    @Query("select c from Course c where c.subject =?1 and c.specialization=?2 and c.address.city=?3")
    Page<Course> findByFilter(Subject subject, String specialization, String city, Pageable pageRequest);

//    Page<Course> findAll(Pageable pageRequest);
}
