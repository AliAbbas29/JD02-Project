package by.itacademy.dao;


import by.itacademy.entity.Course;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class CourseDaoImpl extends BaseDaoImpl<Course> implements CourseDao {
    @Override
    protected Class<Course> getEntityClass() {
        return Course.class;
    }
}
