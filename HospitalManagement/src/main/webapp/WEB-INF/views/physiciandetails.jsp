<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page session = "true" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Physician Details</title>
</head>
<body style="background-color: lightyellow">

	<div align="center">
	<h1>Physician Details:</h1>
		<form:form action="addphysiciandetails" method="post" modelAttribute="physiciandetails">
			<table border=4>
			<tr>
					<td>Physician Id</td>
					<td><form:input type="text" path="id"
						style="width: 120px" /></td>
				</tr>
				
				<tr>
					<td>First Name</td>
					<td><form:input type="text" path="firstName"
							style="width: 120px" /></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><form:input type="text" path="lastName"
							style="width: 120px" /></td>
				</tr>
				<tr>
					<td>Department</td>
					<td><form:input type="text" path="department"
							style="width: 120px" /></td>
				</tr>
				<tr>
					<td>Educational Qualification</td>
					<td><form:input type="text" path="educationalQualification"
							style="width: 120px" /><font color = "red"><form:errors path="educationalQualification"/></font></td>
				</tr>
				<tr>
					<td>Years Of Experience</td>
					<td><form:input type="number" path="yearsOfExperience"
							style="width: 120px" /></td>
				</tr>
				<tr>
					<td>State</td>
					<td><form:input type="text" path="state"
							style="width: 120px" /></td>
				</tr>
				
				<tr>
					<td>Insurance Plan</td>
					<td><form:select path="insurancePlan" id="insurancePlan"
							style="width: 127px">
							<option value=1>Normal</option>
							<option value=2>primitive</option>
						</form:select></td>
				</tr>

			</table>
			<input type="submit" value="Add" onclick="Added Successfully">
		</form:form>
	</div>
	
</body>
</html>
