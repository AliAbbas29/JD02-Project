package by.itacademy.repository;

import by.itacademy.entity.Grade;
import org.springframework.data.repository.Repository;

import java.util.List;


public interface GradeRepository extends Repository<Grade, Integer> {
    void save(Grade grade);

    void delete(Grade grade);

    Grade findById(Integer id);

    List<Grade> findAll();
}
