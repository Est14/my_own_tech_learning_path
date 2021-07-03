<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Servlet Form</title>
</head>
<body>
<h1><%= "Servlet Form" %>
</h1>
<form name="form1" action="servlet" method="post">
    User: <label>
    <input type="text" name="user" />
</label>
    <br/>
    password: <label>
    <input type="password" name="password" />
</label>
<label>
    <br/>
    <input type="submit" value="Send">
</label>
</form>
<br/>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>