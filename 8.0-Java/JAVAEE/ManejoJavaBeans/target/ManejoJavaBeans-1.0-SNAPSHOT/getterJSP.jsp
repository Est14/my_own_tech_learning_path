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
    <title>Get Attribute</title>
</head>
<body>
<jsp:useBean id="retangle" class="com.est.ManejoJavaBeans.bean.Rectangle" scope="session" />
<h1> <%="This are the attributes and methods  of Java Beans"%></h1>

Width = <jsp:getProperty name="retangle" property="width"/>
<br>
Height = <jsp:getProperty name="retangle" property="height"/>
<br>
Area = <jsp:getProperty name="retangle" property="area"/>
<br>
<br>
<a href="index.jsp">Back to home</a>
</body>
</html>
