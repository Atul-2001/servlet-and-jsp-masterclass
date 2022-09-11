package com.signature.AddServlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AddServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));

        int result = num1 + num2;

        /*PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1> Result is : " + result + "</h1>");
        out.println("</body></html>");*/

        // method to pass or set value to servlet request as an attribute
        // so that this req can be passed to another servlet
        // there are two methods :-
        // 1. Session management
        // 2. direct method by setting the value to previous request as an attribute / URL rewriting
        // 3. Cookie Management.
//        req.setAttribute("sq", result);

        // method to call one servlet from another servlet
        // there are two methods :-
        // 1. Request dispatcher -> it is used when redirected servlet is belongs to same website. It does not tell anything to client about request redirection
        // 2. Redirect -> it is can be used for both purposes whether redirecting within the website or outside the website.
        //                It informs the client about the redirection through URL so client sends another request to the redirected servlet.
        /*RequestDispatcher dispatcher = req.getRequestDispatcher("square");
        dispatcher.forward(req, resp);*/

//        resp.sendRedirect("square?sq="+result); // this method of redirecting is using URL rewriting to send data to another servlet

        Cookie cookie = new Cookie("sq", String.valueOf(result));
        resp.addCookie(cookie);
        resp.sendRedirect("square");
    }
}
