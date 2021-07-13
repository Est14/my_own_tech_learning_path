<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>MVC Example</title>
</head>
<body>
<h1><%= "MVC Example" %>
</h1>
<div style="color: aqua">
    ${message}
</div>
<br/>
<!-- controller can handle many flows -->
<a href="controller-servlet">Link to controller servlet without params</a>
<br><br>
<a href="controller-servlet?action1=addVariables">Link to controller servlet add variables</a>
<br><br>
<a href="controller-servlet?action1=listVariables">Link to controller servlet list variables</a>
</body>
</html>