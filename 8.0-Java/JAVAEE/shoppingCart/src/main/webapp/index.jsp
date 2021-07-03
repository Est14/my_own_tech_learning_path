<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Shopping Shop</title>
</head>
<body>
<h1><%= "Shopping Shop" %>
</h1>
<form action="sopping-servlet" method="post" name="form1">
    <label>
        <span>Article to add</span>
        <input type="text" name="article" placeholder="article">
    </label>
    <input type="submit" value="Add Cart">
</form>

</body>
</html>