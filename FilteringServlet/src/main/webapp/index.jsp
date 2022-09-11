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
<a href="hello-servlet">Hello Servlet</a>

<div>
    <form action="login-servlet" method="post">
        <label for="uid">UserID : </label>
        <input type="text" name="uid" id="uid"/><br><br>

        <label for="uname">UserName : </label>
        <input type="text" name="uname" id="uname"/><br><br>

        <input type="submit" value="Login">
    </form>
</div>
</body>
</html>