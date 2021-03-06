package by.itacademy.controller;

import by.itacademy.entity.Course;
import by.itacademy.entity.Subject;
import by.itacademy.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SearchController {
//    private final
//    CourseFilterService service;

//    @Autowired
//    public SearchController(CourseFilterService service) {
//        this.service = service;
//    }

    private final CourseRepository courseRepository;

    @Autowired
    public SearchController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @ModelAttribute("course")
    public Course courseModel() {
        return new Course();
    }

    @ModelAttribute("allSubjectsModel")
    public Subject[] allSubjectsModel() {
        return Subject.values();
    }


    @GetMapping("/search")
    public String searchPage() {
        return "search";
    }

    @PostMapping("/search")
    public String searchField(Model model, Subject subject, String specialization, String city, Integer pageNumber, Integer limit) {
        //model.addAttribute("filteredCourse", service.findByFilter(subject, specialization, city, offset, limit));
//        Pageable pageRequest = new PageRequest(pageNumber, limit);
        model.addAttribute("filteredCourse", courseRepository.findByFilter(subject, specialization, city));
//        model.addAttribute("nextPage", pageRequest.next());
        return "result";
    }

    @GetMapping("/nextpage")
    public String nextP() {
        return "result";
    }

    @PostMapping("/nextpage")
    public String nextPage() {
        return "result";
    }
}
