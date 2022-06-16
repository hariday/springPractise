<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
   <%@ page isELIgnored = "false" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Location Registration</title>
<style>
#b1 {
 width: 150 px;
}
</style>
</head>
<body>
	   <form:form method="POST" 
          action="/locations/save" modelAttribute="loc">
             <table>
                <tr>
                    <td><form:label path="locCode">Code</form:label></td>
                    <td><form:input path="locCode" required="true"/></td>
                </tr>
                <tr>
                    <td><form:label path="locName">Name</form:label></td>
                    <td><form:input path="locName" required="true"/></td>
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
                    <td>
                    <input type="submit" value="Submit"/> 
                    <a href="/locations/display"><button id = "b1"value="View Locations"></button></a>
                    </td>
                </tr>
            </table>
        </form:form>
</body>
</html>