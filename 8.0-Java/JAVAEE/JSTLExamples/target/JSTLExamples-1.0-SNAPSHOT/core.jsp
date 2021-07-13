<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSTL Core</title>
</head>
<body>
<h1><%="JSTL Core"%></h1>
<!--variable Manipulation -->
    <c:set var="name" value="Esteban" />
    Variable name: <c:out value="${name}" />
<br>
<br>
<a href="index.jsp">Go back to home</a>
</body>
</html>
