<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Physician</title>
</head>
<body style="background-color: lemonchiffon">
<div align="center">
		<h1>Search Physician Details</h1>
		<form:form action="physiciansearch" method="post" modelAttribute="physiciandetails">
			<table >
				<tr>
					<td>State</td>
					<td><form:input type="text" path="state"
							style="width: 120px" /></td>
				</tr>
				<tr>
					<td>Plan</td>
					<td><form:select path="insurancePlan" style="width: 127px">
							<option value=1>Normal</option>
							<option value=2>Primitive</option>
						</form:select></td>
				</tr>
				<tr>
					<td>Department</td>
					<td><form:input type="text" path="department"
							style="width: 120px" /></td>
				</tr>
				
				
			</table>
			<input type="submit" value="Search">
		</form:form>
	</div>
</body>
</html>