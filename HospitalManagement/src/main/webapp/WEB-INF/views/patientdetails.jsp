<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page session = "true" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Add Patient Details</title>
</head>
<body style="background-color: lemonchiffon">

	<div align="center">
	<h1>Patient Details:</h1>
		<form:form action="addpatientdetails" method="post" modelAttribute="patientdetails">
			<table border=4>
				<tr>
					<td>Patient Id</td>
					<td><form:input type="number" path="id" 
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
					<td>Date of Birth</td>
					<td><form:input type="date" path="dateOfBirth"
							style="width: 120px" /></td>
				</tr>
				<tr>
					<td>Email Id</td>
					<td><form:input type="text" path="emailId"
							style="width: 120px" /><font color = "red"><form:errors path="emailId"/></font></td>
				</tr>
				<tr>
					<td>Contact Number</td>
					<td><form:input type="text" path="contactNumber"
							style="width: 120px" /><font color = "red"><form:errors path="contactNumber"/></font></td>
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
				<tr>
					<td>Physician Id</td>
					<td><input type="text" name="id"
						style="width: 120px" /></td>
				</tr>

			</table>
			<input type="submit" value="Add" onclick="Added Successfully">
		</form:form>
	</div>
	
</body>
</html>