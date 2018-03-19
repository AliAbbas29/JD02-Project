package by.itacademy.controller;

import by.itacademy.entity.User;
import by.itacademy.repository.RoleRepository;
import by.itacademy.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {

    private final
    RoleRepository roleRepository;

    private final
    UserRepository userRepository;

    private final
    PasswordEncoder passwordEncoder;

    @Autowired
    public RegistrationController(UserRepository userRepository, PasswordEncoder passwordEncoder, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.roleRepository = roleRepository;
    }

    @GetMapping("/register")
    private String registrationPage() {
        return "registration";
    }

    @PostMapping("/register")
    private String register(String name, String password) {
        User user = new User();
        user.setName(name);
        user.setPassword(passwordEncoder.encode(password));
        user.setRole(roleRepository.findById(3));
        userRepository.save(user);
        return "welcome";
    }
}
