package by.itacademy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CourseFilterController {

    @GetMapping("/filter")
    public String showResult() {
        return "result";
    }
}
