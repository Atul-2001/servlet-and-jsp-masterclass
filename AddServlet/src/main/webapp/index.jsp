<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a><br><br>
    <form action="add">
        Enter first number : <label>
        <input type="text" name="num1"/>
    </label><br>
        Enter second number : <label>
        <input type="text" name="num2"/>
    </label><br>
        <input type="submit" value="Submit"/>
    </form>
<br><br>
<a href="login.html">Login to see more</a>
</body>
</html>