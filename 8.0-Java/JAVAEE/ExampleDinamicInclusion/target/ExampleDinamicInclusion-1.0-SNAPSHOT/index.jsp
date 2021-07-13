<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Dynamic Inclusion </title>
</head>
<body>
<h1><%= "Dynamic Inclusion" %>
</h1>
<jsp:include page="pages/publicResources.jsp" />
<br/>
<jsp:include page="WEB-INF/privateRosources.jsp" >
    <jsp:param name="background_color" value="yellow"/>
</jsp:include>
<br/>

</body>
</html>