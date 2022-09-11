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
<a href="hello-servlet">Hello Servlet</a><br><br><br><br>

    <div>
        <form action="login-servlet" method="post">
            <label for="uname">Username : </label>&nbsp;
            <input type="text" name="uname" id="uname"/><br><br>

            <label for="pass">Password : </label>&nbsp;
            <input type="password" name="password" id="pass"/><br><br>

            <input type="submit" value="Login"/>
        </form>
    </div>

    <div>
        <a href="about_us.jsp"><h4>About us</h4></a>
    </div>
</body>
</html>