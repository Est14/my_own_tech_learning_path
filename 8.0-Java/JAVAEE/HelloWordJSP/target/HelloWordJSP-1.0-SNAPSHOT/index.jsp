<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Hello World JSP</title>
</head>
<body>
<h1> This are the elements we can use in JSP</h1>
<ul>
    <li> <% out.print("Hello with Scriplets"); %></li>
    <li>${"Hello with expression language (EL)"}</li>
    <li><%= "Hello with expressions "%></li>
    <li><c:out value="Hello with JSTL" /></li>

</ul>
<br/>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>