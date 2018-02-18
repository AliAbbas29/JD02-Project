package by.itacademy.dao;


import by.itacademy.entity.Student;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImpl extends BaseDaoImpl<Student> {
    @Override
    protected Class<Student> getEntityClass() {
        return Student.class;
    }
}
