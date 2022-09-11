<%--
  Created by IntelliJ IDEA.
  User: J.A.R.V.I.S
  Date: 04-01-2021
  Time: 20:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Videos</title>
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

    <h1>Videos of all lectures will be available here!</h1>
    <ol type="1">
        <li><a href="#">Introduction to Java!</a></li>
        <li><a href="#">Data type and variables in java!</a></li>
        <li><a href="#">Functions in java!</a></li>
        <li><a href="#">Packages in java!</a></li>
    </ol>
    <br><br><br><br>

    <form action="upload" method="post" enctype="multipart/form-data">
        <input type="file" name="files" multiple/> &nbsp;&nbsp;
        <input type="submit" value="Upload">
    </form>
</body>
</html>
