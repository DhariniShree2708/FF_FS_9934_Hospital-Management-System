<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page session = "true" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Registration</title>
</head>
<body style="background-color: lightgreen">

	<div align="center">
		<h1>Registration Page:</h1>
		<form:form action="registration" method="post" modelAttribute="user">
			<table border=1>
				<tr>
					<td>Email Id</td>
					<td><form:input type="text" path="emailId" 
							style="width: 120px" /><font color = "red"><form:errors path="emailId"/></font></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><form:input type="password" path="password"
							style="width: 120px" /><font color = "red"><form:errors path="password"/></font></td>
				</tr>
				<tr>
					<td>Confirm Password</td>
					<td><input type="password" name="confirmpassword"
						style="width: 120px" /></td>
				</tr>
				<tr>
					<td>Role</td>
					<td><form:select path="roleId" id="roleId"
							style="width: 127px">
							<option value=1>Hospital Admin</option>
							<option value=2>Admin</option>
							
						</form:select></td>
				</tr>

			</table>
			<input type="submit" value="Register">
		</form:form>
	</div>
	
</body>
</html>