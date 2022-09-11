package org.signature;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login-servlet")
public class Login extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("uname");
        String password = req.getParameter("password");

        if (username.equals("admin") && password.equals("password")) {
            HttpSession session = req.getSession();
            session.setAttribute("username", username);

            resp.sendRedirect("welcome.jsp");
        } else {
            resp.sendRedirect("index.jsp");
        }
    }
}
