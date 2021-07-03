<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Status Code</title>
</head>
<body>
<h1><%= "Status Code" %>
    <fieldset>
        <legend> Auth Form</legend>
        <form name="form1" action="Servlet" method="post">
            User: <label>
            <input type="text" name="user">
        </label>
            Password: <label>
            <input type="password" name="password">
        </label>
            <br><br>
            <input type="submit" value="send">
        </form>
    </fieldset>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>