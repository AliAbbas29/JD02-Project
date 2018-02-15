package by.itacademy.dao;


import by.itacademy.entity.InstructorProg;

public class InstructorProgDao extends BaseDao<InstructorProg> {
    @Override
    protected Class<InstructorProg> getEntityClass() {
        return InstructorProg.class;
    }
}
