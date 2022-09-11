package com.signature.LearnServlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class WelcomeServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();
        out.println("<html><body>");

        out.println("Hii...<br>");

        ServletContext ctx = getServletContext();
        String val = ctx.getInitParameter("name");
        out.println(val + "<br>");

        val = ctx.getInitParameter("phone");
        out.println(val + "<br><br><br>");

        out.println("Welcome...<br>");
        ServletConfig cfg = getServletConfig();
        val = cfg.getInitParameter("name");
        out.println("username : " + val + "<br>");

        val = cfg.getInitParameter("password");
        out.println("password : " + val);

        out.println("</body></html>");
    }
}
