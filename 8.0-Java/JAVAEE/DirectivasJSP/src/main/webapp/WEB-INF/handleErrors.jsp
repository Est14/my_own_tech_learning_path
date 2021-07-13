<%@page isErrorPage="true" %>
<%@page import="java.io.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Handle error</title>

</head>
<body>
    <h1>Handle ERROR</h1>
    <h3>An Error was happen</h3>
    <%= exception.getMessage()%>
</body>
</html>
