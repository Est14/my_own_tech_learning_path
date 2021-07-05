<%@ page import="java.beans.Expression" %><%--
  Created by IntelliJ IDEA.
  User: estebancode14
  Date: 3/07/21
  Time: 11:58 a. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Expressions JSP</title>
</head>
<body>
<h1><%="Expression JSP"%></h1>
Contact: <%= "Hello" + " " + " how are you?"%>
<br>
Math operation <%= 5 + 6 %>
<br>
Session Id: <%= session.getId() %>
<br>
<br>
<a href="index.jsp"> <%= "Return Home" %></a>
</body>
</html>
