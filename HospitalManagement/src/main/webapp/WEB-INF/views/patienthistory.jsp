<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Patient</title>
</head>
<body style= "background-color:lightblue">
	<div align="center">
		<h1>View Patient Details</h1>
		<form:form action="patienthistory" method="post" modelAttribute="patientdetails">
			<table>
				<tr>
					<td>Patient Id</td>
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

			</table>
			<input type="submit" value="View">
		</form:form>

		<%-- <c:if test="${!empty list}">
			<table class="tg">
				<tr>
					<th width="80">Patient ID</th>
					<th width="120">First Name</th>
					<th width="120">Last Name</th>
					<th width="120">Date of Birth</th>
					<th width="120">Email Id</th>
					<th width="120">State</th>
					<th width="120">Insurance Plan</th>
				</tr>
				<c:forEach items="${list}" var="patient">
					<tr>
						<td>${patient.patientId}</td>
						<td>${patient.firstName}</td>
						<td>${patient.lastName}</td>
						<td>${patient.dateofBirth}</td>
						<td>${patient.emailId}</td>
						<td>${patient.state}</td>
						<td>${patient.insurancePlan}</td>
						
					</tr>
				</c:forEach>
			</table>
		</c:if>
 --%>

	</div>
</body>
</html>