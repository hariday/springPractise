<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Location</title>
</head>
<body>
<c:if test="${empty locationDisplay }">
	<h1>No Data</h1>
</c:if>

<c:if test="${ not empty locationDisplay }">
	<c:forEach items="${locationDisplay}" var="item">
    ${item}<br>
</c:forEach>
</c:if>

</body>
</html>