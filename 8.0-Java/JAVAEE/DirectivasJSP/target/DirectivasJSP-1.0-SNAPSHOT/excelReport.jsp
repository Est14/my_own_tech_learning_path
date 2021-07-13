<%@page import="com.est.DirectivasJSP.util.Conversions, java.util.Date" %>
<%@page contentType="application/vnd.ms-excel" %>
<%
    String nameFile = "excelReport.xls";
    response.setHeader("Content-Disposition", "attachment;filename=" + nameFile);
%>
<!DOCTYPE html>
<html>
<head>
    <title>Excel Report</title>
</head>
<body>
    <h1> Excel Report </h1>
    <table border="1">
        <tr>
            <th>Courses</th>
            <th>Description</th>
            <th>Date</th>
        </tr>
        <tr>
            <td>1. Java Fundations</td>
            <td>We go to learn the basic Java syntax</td>
            <td>
                <%= Conversions.format(new Date())%>
            </td>
        </tr>
        <tr>
            <td>1. Java Programing</td>
            <td>We go to practices concepts of OOP with JAVA</td>
            <td>
                    <%= Conversions.format(new Date())%>
            </td>
        </tr>
    </table>
</body>
</html>
