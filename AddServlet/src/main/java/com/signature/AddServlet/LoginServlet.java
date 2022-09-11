package com.signature.AddServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("uname");
        String password = req.getParameter("pass");

        HttpSession session = req.getSession();
        Object isLogin = session.getAttribute("isLogin");
        if (isLogin != null) {
            if ((boolean) session.getAttribute("isLogin")) {
                resp.getWriter().println("You are already login! Enjoy it.");
                return;
            }
        }

        if (id.equals("admin") && password.equals("password")) {
            session.setAttribute("isLogin", true);
            resp.getWriter().println("You have successfully login! Now you will be redirected to home!");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            session.setAttribute("isLogin", false);
            resp.getWriter().println("Failed to login! Incorrect username or password.");
        }
//        resp.sendRedirect("");
    }
}
