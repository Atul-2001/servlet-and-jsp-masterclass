<%--
  Created by IntelliJ IDEA.
  User: J.A.R.V.I.S
  Date: 04-01-2021
  Time: 19:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.time.LocalDateTime" %>
<html>
<head>
    <title>Welcome ${username}!</title>
</head>
<body>
    <%
        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // for HTTP 1.1 and higher
        response.setHeader("Pragma", "no-cache"); // this also for HTTP 1.0 and lower
        response.setHeader("Expires", "0"); // if using proxies

        if (session.getAttribute("username") == null) {
            response.sendRedirect("index.jsp");
        }
    %>

    <h1>Welcome ${username}!</h1>
    <h3>Login time : <%= LocalDateTime.now() %></h3>

    <div>
        <h4><a href="video.jsp"> Go to videos </a></h4>
    </div>

    <div>
        <form action="logout-servlet" method="post">
            <input type="submit" value="Logout">
        </form>
    </div>
</body>
</html>
