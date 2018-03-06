package by.itacademy.repository;

import by.itacademy.entity.InstructorLang;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface InstructorLangRepository extends Repository<InstructorLang, Integer> {
    void save(InstructorLang instructorLang);

    void delete(InstructorLang instructorLang);

    InstructorLang findById(Integer id);

    List<InstructorLang> findAll();
}
