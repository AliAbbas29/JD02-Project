package by.itacademy;

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
        Integer offset = Integer.parseInt(req.getParameter("searchinput"));
        req.setAttribute("instructors", new SomeService().findByFilter(offset, 2));
        req.getRequestDispatcher("WEB-INF/jsp/result.jsp").forward(req, resp);
    }
}
