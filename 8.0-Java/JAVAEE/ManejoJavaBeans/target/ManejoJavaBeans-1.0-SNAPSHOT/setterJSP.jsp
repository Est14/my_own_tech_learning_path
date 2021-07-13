<%--
  Created by IntelliJ IDEA.
  User: estebancode14
  Date: 8/07/21
  Time: 7:51 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP that modify to Java Bean</title>
</head>
<body>
// Conectamos nuestro JSP con el Java Bean
<jsp:useBean id="retangle" class="com.est.ManejoJavaBeans.bean.Rectangle" scope="session"/>

Modify attribute:
<br>
<br>
<%
    int w = 5;
    int h = 6;

%>
<jsp:setProperty name="retangle" property="width" value="<%=w%>" />
<jsp:setProperty name="retangle" property="height" value="<%=h%>" />
</body>
</html>
