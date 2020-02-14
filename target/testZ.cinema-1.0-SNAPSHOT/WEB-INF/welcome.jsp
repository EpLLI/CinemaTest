<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Cinema</title>
</head>
<body>
<h1>Welcome to my Cinema</h1>
<form action="${pageContext.request.contextPath}/director" method="POST">
<input type="submit" value="Search by director">
</form>
<form action="${pageContext.request.contextPath}/date" method="POST">
    <input type="submit" value="Search by date">
</form>
<form action="${pageContext.request.contextPath}/dirAnddate" method="POST">
    <input type="submit" value="Search by director and date">
</form>
</body>
</html>