<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body style="background-color: lightgreen">
<div align="center">
<h1>Login Page:</h1>
		<form:form action="login" method="post" modelAttribute="user">
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
					<td>Role</td>
					<td><form:select path="roleId" id="roleId"
							style="width: 127px">
							<option value=1>Hospital Admin</option>
							<option value=2>Admin</option>
							
						</form:select></td>
				</tr>
				</table>
				<input type="submit" value="Login">
				</form:form>
				</div>
</body>
</html>