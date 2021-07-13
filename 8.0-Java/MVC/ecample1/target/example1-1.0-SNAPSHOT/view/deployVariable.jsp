<%--
  Created by IntelliJ IDEA.
  User: estebancode14
  Date: 10/07/21
  Time: 8:32 a. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>deploy variable</title>
</head>

<body>
<h1><%="Deploy Variable"%>
</h1>
Variable in the request scope : ${message}
<br>
<br>
Rectangle:
<br>
width : ${rectangle.width}
<br>
Height : ${rectangle.height}
<br>
Area of JavaBean Rectangle : ${rectangle.area}
<br>
<br>
<a href="index.jsp">Return to home</a>
</body>
</html>
