package by.itacademy;

import by.itacademy.entity.Subject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/result")
public class UServl extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Subject subject = Subject.valueOf(req.getParameter("dropdown1"));
        String specialization = req.getParameter("input1");
        String city = req.getParameter("dropdown2");
        Integer offset = Integer.parseInt(req.getParameter("dropdown3"));
        Integer limit = Integer.parseInt(req.getParameter("dropdown4"));
        req.setAttribute("instructors", new SomeService().findByFilter(subject, specialization, city, offset, limit));
        req.getRequestDispatcher("WEB-INF/jsp/result.jsp").forward(req, resp);
    }
}
