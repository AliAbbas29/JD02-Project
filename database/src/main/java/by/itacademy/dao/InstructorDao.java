package by.itacademy.dao;


import by.itacademy.entity.Instructor;

public class InstructorDao extends BaseDao<Instructor> {
    @Override
    protected Class<Instructor> getEntityClass() {
        return Instructor.class;
    }
}
