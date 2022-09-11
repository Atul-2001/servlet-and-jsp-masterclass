<%--
  Created by IntelliJ IDEA.
  User: J.A.R.V.I.S
  Date: 04-01-2021
  Time: 10:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="error.jsp" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
    <%!
        int result = 0;
    %>
    <%
        if (request.getParameter("submit").equalsIgnoreCase("ADD")) {
            int num1 = Integer.parseInt(request.getParameter("num1"));
            int num2 = Integer.parseInt(request.getParameter("num2"));
            result = num1 + num2;
        } else if (request.getParameter("submit").equalsIgnoreCase("Divide")) {
            int num1 = Integer.parseInt(request.getParameter("num1"));
            int num2 = Integer.parseInt(request.getParameter("num2"));

            result = num1 / num2;
        }
    %>

    <h1>Result is : <%=result%></h1>
</body>
</html>
