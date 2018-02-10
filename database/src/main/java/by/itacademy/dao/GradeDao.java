package by.itacademy.dao;

import by.itacademy.entity.Grade;

public class GradeDao extends BaseDao<Grade> {
    @Override
    protected Class<Grade> getEntityClass() {
        return Grade.class;
    }
}
