<%--
  Created by IntelliJ IDEA.
  User: J.A.R.V.I.S
  Date: 04-01-2021
  Time: 16:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
    <title>JSTL</title>
</head>
<body>
<h1>${val}</h1><br>
<c:out value="${val}"/>
<c:out value="${fn:length(val)}"/>
<c:out value="${fn:indexOf(val, 'is')}"/><br>

${student}<br>
${student.name}<br>

${students}<br>

<c:forEach items="${students}" var="student">
    ${student} : ${student.name} &nbsp; ${student.rollNo} <br>
</c:forEach>
</body>
</html>
