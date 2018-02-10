package by.itacademy.dao;


import by.itacademy.entity.Course;

public class CourseDao extends BaseDao<Course> {
    @Override
    protected Class<Course> getEntityClass() {
        return Course.class;
    }
}
