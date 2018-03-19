package by.itacademy.repository;

import by.itacademy.entity.Student;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface StudentRepository extends Repository<Student, Integer> {
    void save(Student student);

    void saveAndFlush(Student student);

    void delete(Student student);

    Student findById(Integer id);

    List<Student> findAll();
}
