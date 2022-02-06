package servlet;

import dto.UserDTO;
import entity.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import service.UserService;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/users")
public class UserServlet extends HttpServlet {

    private final UserService userService = UserService.getInstance();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        userService.save();
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        userService.delete(Integer.parseInt(req.getParameter("id")));
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        userService.update(Integer.parseInt(req.getParameter("id")));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        //   resp.setCharacterEncoding(StandardCharsets.UTF_8.name());
        try (PrintWriter writer = resp.getWriter()) {
            List<UserDTO> users = userService.findAllUsers();
            writer.write("<ul>");
            writer.write("Hello, world! ");
            users.forEach(userDTO -> writer.write("<li>" + userDTO.getFirstName() + " " + userDTO.getLastName() + "</li>"));
            writer.write("</ul>");

            if (req.getParameter("id") != null && !req.getParameter("id").isEmpty()) {
                UserDTO userDTO = userService.findUserByID(Integer.parseInt(req.getParameter("id")));
                writer.write("User id " + userDTO.getFirstName() + " " + userDTO.getLastName());
            }

            Cookie cookie = new Cookie("user", "visited");
            resp.addCookie(cookie);

            Cookie[] cookies = req.getCookies();
            for (Cookie cookie1 : cookies
            ) {
                if (cookie1.getValue().equals("visited")) {
                    writer.write("User visited");
                }
            }

            HttpSession session = req.getSession();
            User user = new User();
            session.setAttribute("user", user);
            session.getAttribute("user");
        }
    }
}