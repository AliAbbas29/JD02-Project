package by.itacademy.controller;

import by.itacademy.entity.Course;
import by.itacademy.entity.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SearchController {

    @ModelAttribute("course")
    public Course courseModel() {
        return new Course();
    }

    @ModelAttribute("allSubjectsModel")
    public Subject[] allSubjectsModel() {
        return Subject.values();
    }

    @GetMapping("/search22")
    public String searchPage() {
        return "search222";
    }

    @PostMapping("/search22")
    public String searchField() {
        return "redirect:/result";
    }
}
