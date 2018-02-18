package by.itacademy;

import by.itacademy.config.DatabaseConfig;
import by.itacademy.config.ServiceConfig;
import by.itacademy.entity.Course;
import by.itacademy.entity.Subject;
import by.itacademy.service.CourseFilterServiceImpl;
import by.itacademy.service.SomeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/result")
public class UServl extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ServiceConfig.class);
        int page = 1;
        if (req.getParameter("page") != null) {
            page = Integer.parseInt(req.getParameter("page"));
        }
        Subject subject = Subject.valueOf(req.getParameter("dropdown1"));
        String specialization = req.getParameter("input1");
        String city = req.getParameter("dropdown2");
        Integer offset = Integer.parseInt(req.getParameter("dropdown3"));
        Integer limit = Integer.parseInt(req.getParameter("dropdown4"));
        List<Course> courses = context.getBean(CourseFilterServiceImpl.class).findByFilter(subject, specialization, city, offset, limit);
        int noOfPages = (int) Math.ceil(context.getBean(CourseFilterServiceImpl.class).getNoOfRecords(courses) / limit);
        req.setAttribute("courses", courses);
        req.setAttribute("noOfPages", noOfPages);
        req.setAttribute("currentPage", page);
        req.getRequestDispatcher("WEB-INF/jsp/result.jsp").forward(req, resp);
    }
}
