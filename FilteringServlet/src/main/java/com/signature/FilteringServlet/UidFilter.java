package com.signature.FilteringServlet;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter("/login-servlet")
public class UidFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("Inside filter");
        int uid = Integer.parseInt(request.getParameter("uid"));
        if (uid > 100) {
            chain.doFilter(request, response);
        } else {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("<h1> Invalid User ID!</h1>");
            out.println("<h2> User ID should be greater than 100 </h2>");
            out.println("</body></html>");
        }
    }

    @Override
    public void destroy() {

    }
}
