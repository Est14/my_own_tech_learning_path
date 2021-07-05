<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Example Expressions JSP</title>
</head>
<body>
<h1><%= "Example Expressions JSP" %>
</h1>
<br/>
<a href="Expressions.jsp">Link to JSP expressions</a>
<h4> <%= "Form html"%></h4>
<form name="form1" action="FormProcess.jsp">
    <label>
        <span>User:</span>
        <input type="text" name="user">
    </label>
    <br>
    <label>
        <span>Password:</span>
        <input type="password" name="password">
    </label>
    <br>
    <input type="submit" value="send">
</form>
</body>
</html>