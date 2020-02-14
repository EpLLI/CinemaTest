<%--
  Created by IntelliJ IDEA.
  User: Иван
  Date: 13.02.2020
  Time: 19:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Date and director id serch</title>
<style>
    table {
        font-family: arial, sans-serif;
        border-collapse: collapse;
        width: 100%;
    }

    td, th {
        border: 1px solid #dddddd;
        text-align: left;
        padding: 8px;
    }

    tr:nth-child(even) {
        background-color: #dddddd;
    }
</style>
</head>
<body>
<table>

    <tr>
        <th>Id</th>
        <th>First name</th>
        <th>Last name</th>
        <th>Birth date</th>
    </tr>
    <c:forEach var="dir" items="${dirList}">
        <tr>
            <td>${dir.id}</td>
            <td>${dir.first_name}</td>
            <td>${dir.last_name}</td>
            <td>${dir.birth_date}</td>
        </tr>
    </c:forEach>
</table>
<form action="${pageContext.request.contextPath}/filmbydiridanddate" method="POST">
    <label>Id</label>
    <label>
        <input type="text" name="id">
    </label>
    <label>First Date</label>
    <label>
        <input type="Date" name="date1">
    </label>
    <label>Second Date</label>
    <label>
        <input type="Date" name="date2">
    <input type="submit" value="Search by date and director">
</form>
</body>
</html>
