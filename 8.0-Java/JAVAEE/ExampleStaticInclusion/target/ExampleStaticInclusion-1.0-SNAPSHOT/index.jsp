<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Static Inclusion</title>
</head>
<body>
<h1><%= "Static Inclusion"%>
</h1>
<br/>
<ul>
    <li> <%@ include file="pages/new1.html" %></li>
    <li> <%@ include file="pages/new2.jsp" %></li>
</ul>
</body>
</html>