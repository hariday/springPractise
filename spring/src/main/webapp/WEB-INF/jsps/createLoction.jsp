<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
   <%@ page isELIgnored = "false" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Location Registration</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" 
rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
	<div align="center" class="container form-group">
		<h3 align="center">Location Registration :</h3>
		<form:form method="POST" 
          action="/locations/save" modelAttribute="loc" >
             <table>
                <tr>
                    <td><form:label path="locCode">Code</form:label></td>
                    <td><form:input path="locCode" required="true" placeholder = "Enter Location Code"/></td>
                </tr>
                <tr>
                    <td><form:label path="locName">Name</form:label></td>
                    <td><form:input path="locName" required="true" placeholder = "Enter Location Name"/></td>
                </tr>
			<tr>
				<td><form:label path="locType">
                      Type</form:label></td>
				<td>
					<!-- RadioButton Field --> 
					Urban<form:radiobutton path="locType" value="urban" requried="true" /> 
						Rural<form:radiobutton path="locType"
						value="rural" required="true"/>
				</td>
			</tr>
			<tr>
                    <td >
                    <input type="submit" value="Submit"/> 
                    <a href="/locations/display"><input type= "button" value="View Locations"/></a>
                    </td>
                </tr>
            </table>
        </form:form>
	</div>
	   
</body>
</html>