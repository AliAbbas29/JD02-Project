package by.itacademy.service;

import by.itacademy.entity.Course;
import by.itacademy.entity.Subject;

import java.util.List;

public interface CourseFilterService {
    List<Course> findByFilter(Subject subject, String specialization, String city, int offset, int limit);

    int getNoOfRecords(List<Course> courses);
}
