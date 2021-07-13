<%--
  Created by IntelliJ IDEA.
  User: estebancode14
  Date: 8/07/21
  Time: 8:44 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Implicit Varible</title>
</head>
<body>
    <h1><%="Implicit Varible"%></h1>
    <ul>
        <li>Name application: ${pageContext.request.contextPath}</li>
    </ul>
</body>
</html>
