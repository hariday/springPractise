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
<h3 align="center">Location Table </h3>
<c:if test="${empty locationDisplay }">
	<h1>No Data</h1>
</c:if>
	<div align="center">
	
	<c:if test="${ not empty locationDisplay }">
			<table>
				<thead>
					<tr>
						<td>Id</td>
						<td>Code</td>
						<td>Name</td>
						<td>Type</td>
					</tr>
				</thead>
				<br>
				<tbody>
					<c:forEach items="${locationDisplay}" var="loc">
						<tr>
							<td>${loc.locId }</td>
							<td>${loc.locCode }</td>
							<td>${loc.locName }</td>
							<td>${loc.locType }</td>
						</tr>
						<br>
					</c:forEach>
				</tbody>
			</table>
			</c:if>
	</div>
	
</body>
</html>