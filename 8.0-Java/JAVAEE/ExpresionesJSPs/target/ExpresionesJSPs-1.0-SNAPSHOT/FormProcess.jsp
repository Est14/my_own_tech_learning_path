<%--
  Created by IntelliJ IDEA.
  User: estebancode14
  Date: 3/07/21
  Time: 11:59 a. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form Process</title>
</head>
<body>
<h1><%= "Result process form "%></h1>
<h3> <%= "User Name: " + request.getParameter("user")%></h3>
<h3> <%= "Password: " + request.getParameter("password")%></h3>
<br>
<br>
<a href="index.jsp">Return Home</a>
</body>
</html>
