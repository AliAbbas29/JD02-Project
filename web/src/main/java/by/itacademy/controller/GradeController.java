package by.itacademy.controller;

import by.itacademy.entity.Course;
import by.itacademy.entity.Grade;
import by.itacademy.repository.CourseRepository;
import by.itacademy.repository.GradeRepository;
import by.itacademy.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class GradeController {

    private final
    GradeRepository gradeRepository;

    private final
    StudentRepository studentRepository;

    private final
    CourseRepository courseRepository;

    @Autowired
    public GradeController(CourseRepository courseRepository, StudentRepository studentRepository, GradeRepository gradeRepository) {
        this.courseRepository = courseRepository;
        this.studentRepository = studentRepository;
        this.gradeRepository = gradeRepository;
    }

    @ModelAttribute("allCourses")
    public List<Course> allCourses() {
        return courseRepository.findAll();
    }

    @PostMapping("/gradeCourse")
    public String showGradeCoursePage() {
        return "gradeCourse";
    }

    @PostMapping("/gradeStudent")
    public String showGradeStudentPage(Model model, Integer courseToGrade) {
        model.addAttribute("studentsForThatCourse", courseRepository.findById(courseToGrade).getStudents());
        model.addAttribute("thatStudentsCourse", courseRepository.findById(courseToGrade));
        return "gradeStudent";
    }

    @PostMapping("/grade")
    public String gradePage(Integer value, Integer studentToGrade, Integer courseToGrade) {
        Grade grade = new Grade();
        System.out.println("value:" + value + "studentToGrade:" + studentToGrade + "courseToGrade: " + courseToGrade);
        grade.setValue(value);
        grade.setStudent(studentRepository.findById(studentToGrade));
        grade.setCourse(courseRepository.findById(courseToGrade));
        gradeRepository.save(grade);
        return "welcome";
    }
}
