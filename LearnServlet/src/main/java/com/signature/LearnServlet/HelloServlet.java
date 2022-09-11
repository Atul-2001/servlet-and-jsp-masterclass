package com.signature.LearnServlet;

import java.io.*;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");

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

    public void destroy() {
    }
}