<%--
  Created by IntelliJ IDEA.
  User: estebancode14
  Date: 10/07/21
  Time: 9:39 a. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Scope Variables</title>
</head>
<body>
<h1><%="Scope Variable"%></h1>
<br>
Scope Request:
<br>
Base : ${rectRequest.width}
Height : ${rectRequest.height}
Area : ${rectRequest.area}
<br>
<br>
Scope Session:
<br>
Base : ${rectSession.width}
Height : ${rectSession.height}
Area : ${rectSession.area}
<br>
<br>
Scope Application:
<br>
Base : ${rectApplication.width}
Height : ${rectApplication.height}
Area : ${rectApplication.area}
<br>
<br>
<a href="index.jsp">Return to home</a>
</body>
</html>
