package by.itacademy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CourseFilterController {

//    private final
//    CourseFilterService service;
//
//    @Autowired
//    public CourseFilterController(CourseFilterService service) {
//        this.service = service;
//    }
//
//    @ModelAttribute("filteredCourses")
//    public List<Course> showFilteredCourses(Subject subject, String specialization, String city, Integer offset, Integer limit) {
//        return service.findByFilter(subject, specialization, city, offset, limit);
//    }

    @GetMapping("/result")
    public String showResult() {
        return "result";
    }
}
