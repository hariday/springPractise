<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
   <%@ page isELIgnored = "false" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Location </title>
</head>
<body>
<div align="center" class="container form-group">
		<h3 align="center">Location Registration :</h3>
		<form:form method="POST" 
          action="/locations/edit" modelAttribute="loc" >
             <table>
             	<tr>
                    <td><form:label path="locId">Id</form:label></td>
                    <td><form:input path="locId"   value = "${loc.locId}" readonly="true"/></td>
                </tr>
                <tr>
                    <td><form:label path="locCode">Code</form:label></td>
                    <td><form:input path="locCode" required="true" placeholder = "Enter Location Code" value = "${loc.locCode}"/></td>
                </tr>
                <tr>
                    <td><form:label path="locName">Name</form:label></td>
                    <td><form:input path="locName" required="true" placeholder = "Enter Location Name" value = "${loc.locName }"/></td>
                </tr>
			<tr>
				<td><form:label path="locType">
                      Type</form:label></td>
				<td>
					<!-- RadioButton Field --> 
					Urban<input type="radio" name="locType" value="urban"  ${loc.locType == 'urban'?'checked':'' } /> 
						Rural<input type="radio" name="locType"
						value="rural"  ${loc.locType == 'rural'?'checked':''}/>
				</td>
			</tr>
			<tr>
                    <td >
                    <input type="submit" value="Submit"/> 
                    </td>
                </tr>
            </table>
        </form:form>
	</div>
</body>
</html>