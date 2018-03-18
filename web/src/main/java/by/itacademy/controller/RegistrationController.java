package by.itacademy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {

    @GetMapping("/register")
    private String registrationPage(){
        return "registration";
    }

    @PostMapping("/register")
    private String register(){
        return "welcome";
    }
}
