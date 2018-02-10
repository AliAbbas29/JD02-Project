package by.itacademy.dao;


import by.itacademy.entity.Student;

public class StudentDao extends BaseDao<Student>{
    @Override
    protected Class<Student> getEntityClass() {
        return Student.class;
    }
}
