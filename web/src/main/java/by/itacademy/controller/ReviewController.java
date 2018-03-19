package by.itacademy.controller;

import by.itacademy.entity.Course;
import by.itacademy.entity.Review;
import by.itacademy.repository.CourseRepository;
import by.itacademy.repository.ReviewRepository;
import by.itacademy.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ReviewController {

    private final
    ReviewRepository reviewRepository;

    private final
    UserRepository userRepository;

    private final
    CourseRepository courseRepository;

    @Autowired
    public ReviewController(CourseRepository courseRepository, UserRepository userRepository, ReviewRepository reviewRepository) {
        this.courseRepository = courseRepository;
        this.userRepository = userRepository;
        this.reviewRepository = reviewRepository;
    }

    @ModelAttribute("allCourses")
    public List<Course> allCourses() {
        return courseRepository.findAll();
    }

    @PostMapping("/reviewPage")
    public String showReviewPage() {
        return "review";
    }

    @PostMapping("/review")
    public String makeAReview(String review, String name, Integer courseToReview) {
        Review usersReview = new Review();
        usersReview.setReview(review);
        usersReview.setCourse(courseRepository.findById(courseToReview));
        usersReview.setUser(userRepository.findByName(name));
        reviewRepository.save(usersReview);
        return "welcome";
    }
}
