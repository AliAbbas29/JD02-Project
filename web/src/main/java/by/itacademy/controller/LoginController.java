package by.itacademy.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String loginPost() {
        return "welcome";
    }

    @PostMapping("/logout")
    public String logoutPage() {
        return "welcome";
    }
}
