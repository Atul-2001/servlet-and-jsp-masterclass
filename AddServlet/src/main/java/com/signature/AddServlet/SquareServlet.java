package com.signature.AddServlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SquareServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        int val = (int) req.getAttribute("sq"); // is used when using request dispatcher
        int val = 0;
        for (Cookie cookie : req.getCookies()) {
            if (cookie.getName().equals("sq")) {
                String res = cookie.getValue();
                if (res != null) {
                    val = Integer.parseInt(res);
                    break;
                }
            }
        }
//        int val = Integer.parseInt(req.getParameter("sq"));
        int sq = val * val;

        PrintWriter out = resp.getWriter();
        out.println("Result is : " + sq);
    }
}
