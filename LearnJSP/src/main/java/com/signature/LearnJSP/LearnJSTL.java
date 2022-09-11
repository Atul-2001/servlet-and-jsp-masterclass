package com.signature.LearnJSP;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet("/jstl")
public class LearnJSTL extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String str = "Hello this is an example to EL";
        req.setAttribute("val", str);

        req.setAttribute("student", new Student(0, "Hello World"));

        List<Student> students = Arrays.asList(new Student(1, "Atul"),
                new Student(2, "Shivang"),
                new Student(3, "Abhi"),
                new Student(4, "Vivek"),
                new Student(5, "Vivek"));
        req.setAttribute("students", students);

        RequestDispatcher dispatcher = req.getRequestDispatcher("jstl.jsp");
        dispatcher.forward(req, resp);
    }
}
