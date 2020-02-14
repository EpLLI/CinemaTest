<%--
  Created by IntelliJ IDEA.
  User: Иван
  Date: 13.02.2020
  Time: 15:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Date serch</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/filmbydate" method="GET">
    <label>First Date</label>
    <label>
        <input type="Date" name="date1">
    </label>
    <label>Second Date</label>
    <label>
    <input type="Date" name="date2">
</label>
    <input type="submit" value="Search by Date">
</form>
</body>
</html>
