package by.itacademy.repository;

import by.itacademy.entity.Instructor;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface InstructorRepository extends Repository<Instructor, Integer> {

    List<Instructor> findAll();

    Instructor findById(Integer id);
}
