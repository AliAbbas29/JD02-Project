package by.itacademy.dao;

import by.itacademy.entity.Grade;
import org.springframework.stereotype.Repository;


@Repository
public class GradeDaoImpl extends BaseDaoImpl<Grade> {
    @Override
    protected Class<Grade> getEntityClass() {
        return Grade.class;
    }
}
