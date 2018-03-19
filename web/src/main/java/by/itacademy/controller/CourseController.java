package by.itacademy.controller;


import by.itacademy.entity.Address;
import by.itacademy.entity.Course;
import by.itacademy.entity.Instructor;
import by.itacademy.entity.Student;
import by.itacademy.entity.Subject;
import by.itacademy.repository.CourseRepository;
import by.itacademy.repository.InstructorRepository;
import by.itacademy.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@Transactional
public class CourseController {

    private final InstructorRepository instructorRepository;

    private final CourseRepository courseRepository;

    private final
    StudentRepository studentRepository;

    @Autowired
    public CourseController(CourseRepository courseRepository, InstructorRepository instructorRepository, StudentRepository studentRepository) {
        this.courseRepository = courseRepository;
        this.instructorRepository = instructorRepository;
        this.studentRepository = studentRepository;
    }

    @ModelAttribute("corse")
    public Course courseModel() {
        return new Course();
    }

    @ModelAttribute("stud")
    public Student studModel() {
        return new Student();
    }

    @ModelAttribute("allSubjectsModel")
    public Subject[] allSubjectsModel() {
        return Subject.values();
    }

    @ModelAttribute("allCourses")
    public List<Course> allCourses() {
        return courseRepository.findAll();
    }

    @ModelAttribute("allInstructors")
    public List<Instructor> allInstructors() {

        return instructorRepository.findAll();
    }

    @ModelAttribute("courseToFindById")
    public Course findThatCourseById(Integer courseToDelete) {
        return courseRepository.findById(courseToDelete);
    }

//    @ModelAttribute("courseToEdit")
//    public Course findAndEditThatCourseById(Integer courseToEdit){
//        return courseRepository.findById(courseToEdit);
//    }

    @GetMapping("/courses")
    public String couPage() {
        return "courses";
    }

    @PostMapping("/courses")
    public String showAllCourses() {
        return "courses";
    }

    @PostMapping("/deletePage")
    public String showDeletePage() {
        return "deleteCourse";
    }

    @PostMapping("/editPage")
    public String chooseEditPage() {
        return "editCourseChoosing";
    }

    @PostMapping("/addPage")
    public String showAddPage() {
        return "addCourse";
    }

    @PostMapping("/takePartPage")
    public String takePartPage() {
        return "takePartCourse";
    }

    @PostMapping("/editCourseChoosing")
    public String showEditPage(Model model, Integer courseToEdit) {
        model.addAttribute("courseToEdit", courseRepository.findById(courseToEdit));
        System.out.println(courseToEdit);
        return "editCourse";
    }

    @GetMapping("/deleteCourse")
    public String deleteCo() {
        return "deleteCourse";
    }

    @PostMapping("/deleteCourse")
    public String deleteCourse(Integer courseToDelete) {
        courseRepository.deleteById(courseToDelete);
        //model.addAttribute("courseToEdit", courseRepository.findById(courseToDelete));
        return "welcome";
    }

    @GetMapping("/editCourse")
    public String editCoursePage() {
        return "editCourse";
    }

    @PostMapping("/editCourse")
    public String editCourse(Subject subject, String specialization, String city, String street, Integer office, Integer courseToExport) {
//        courseRepository.deleteById(courseToDelete);
        Course course = courseRepository.findById(courseToExport);
        course.setSubject(subject);
        course.getAddress().setCity(city);
        if (street != null && office != null) {
            course.setAddress(new Address(city, street, office));
        }
        if (specialization != null) {
            course.setSpecialization(specialization);
        }
        return "welcome";
    }

    @GetMapping("/addCourse")
    public String addCoursePage() {
        return "addCourse";
    }

    @PostMapping("/addCourse")
    public String addCourse(Subject subject, String specialization, String city, String street, Integer office, Integer instructor_id) {
        Course course = new Course();
        course.setSubject(subject);
        course.setSpecialization(specialization);
        course.setAddress(new Address(city, street, office));
        course.setInstructor(instructorRepository.findById(instructor_id));
        courseRepository.save(course);
        return "welcome";
    }

    @GetMapping("/takePartCourse")
    public String takePartPageShow() {
        return "welcome";
    }

    @PostMapping("/takePartCourse")
    public String takePartInCourse(String firstName, String lastName, Long phonenumber, String city, String street, Integer flat, Integer courseToTakePart) {
        Student student = new Student();
        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setPhonenumber(phonenumber);
        student.setAddress(new Address(city,street,flat));
        studentRepository.save(student);
        student.addCourse(courseRepository.findById(courseToTakePart));
        System.out.println(student.getStudentsCourses());
        return "welcome";
    }
}
