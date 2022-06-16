<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Location</title>
<style type="text/css">
#th{
 background-color: #04AA6D;
  color: blue;
}

#hm{
position: relative;
    top: 65px;
}

#d1 , #e1{
height: 30px;

}
</style>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" 
rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>

<c:if test="${empty locationDisplay }">
	<h1>No Data</h1>
</c:if>
	<div align="center">
	<h3 id = "hm" align="center">Location Table </h3>
	<c:if test="${ not empty locationDisplay }">
			<table class="table">
				<thead id="th">
					<tr>
						<td>Id</td>
						<td>Code</td>
						<td>Name</td>
						<td>Type</td>
						<td colspan="2" >Action</td>
					</tr>
				</thead>
				
				<tbody id="tb">
					<c:forEach items="${locationDisplay}" var="loc">
						<tr>
							<td>${loc.locId }</td>
							<td>${loc.locCode }</td>
							<td>${loc.locName }</td>
							<td>${loc.locType }</td>
							<td><a href="/locations/deleteById?locId=${loc.locId}"><img  id = "d1" alt="" src="/locDelete.png"></a></td>
							<td><a href="/locations/updateById?locId=${loc.locId}"><img id ="e1" alt="" src="/locEdit.png"></a></td>
						</tr>
						<br>
					</c:forEach>
				</tbody>
			</table>
			</c:if>
			
	</div>
	<div align="center">
		<a href="/locations/createLoc">
		<input type="button" class = "btn btn-primary" value="Create Location" /></a>
	</div>
</body>
</html>