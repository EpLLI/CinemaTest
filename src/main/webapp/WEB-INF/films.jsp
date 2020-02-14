<%--
  Created by IntelliJ IDEA.
  User: Иван
  Date: 13.02.2020
  Time: 13:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Films</title>
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
<p>These films are for you</p>
<p var="dr" items="${dir}"> ${dir.first_name} ${dir.last_name}</p>
<p items="${date1}" items="${date2}"> ${date1.toString()} ${date2.toString()}</p>
<table>

    <tr>
        <th>Name</th>
        <th>Genre</th>
        <th>Release_date</th>
    </tr>
    <c:forEach var="film" items="${filmList}">
        <tr>
            <td>${film.name}</td>
            <td>${film.genre}</td>
            <td>${film.date}</td>
        </tr>
    </c:forEach>
</table>

<form action="${pageContext.request.contextPath}/" method="POST">
    <input type="submit" value="Return">
</form>
</body>
</html>
