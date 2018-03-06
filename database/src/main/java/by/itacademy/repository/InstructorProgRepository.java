package by.itacademy.repository;

import by.itacademy.entity.InstructorProg;
import org.springframework.data.repository.Repository;

import java.util.List;


public interface InstructorProgRepository extends Repository<InstructorProg, Integer> {
    void save(InstructorProg instructorProg);

    void delete(InstructorProg instructorProg);

    InstructorProg findById(Integer id);

    List<InstructorProg> findAll();
}
