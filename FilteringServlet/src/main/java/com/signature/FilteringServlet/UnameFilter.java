package com.signature.FilteringServlet;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter("/login-servlet")
public class UnameFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        String uname = request.getParameter("uname");
        if (uname.length() >= 3) {
            chain.doFilter(request, response);
        } else {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("<h1> Invalid User name!</h1>");
            out.println("<h2> Username must be of length 3 or more </h2>");
            out.println("</body></html>");
        }
    }

    @Override
    public void destroy() {

    }
}
