<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page session = "true" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Diagnostic Details</title>
</head>
<body style="background-color: lightblue">

	<div align="center">
	<h1>Diagnostic Details:</h1>
		<form:form action="adddiagnosticdetails" method="post" modelAttribute="diagnosticdetails">
			<table border=1>
			<tr>
					<td>Patient Id</td>
					<td><form:input type="number" path ="patientId"
						style="width: 120px" /></td>
				</tr>
			<tr>
					<td>Physician Id</td>
					<td><form:input type="text" path="physicianId"
						style="width: 120px" /></td>
				</tr>
				<tr>
					<td>Diagnostic Id</td>
					<td><form:input type="number" path="diagnosticId"
						style="width: 120px" /></td>
				</tr>
				
				<tr>
					<td>Symptoms</td>
					<td><form:input type="text" path="symptoms"
							style="width: 120px" /></td>
				</tr>
				<tr>
					<td>Diagnosis Provided</td>
					<td><form:input type="text" path="diagnosisProvided"
							style="width: 120px" /></td>
				</tr>
				<tr>
					<td>Date of Diagnosis</td>
					<td><form:input type="date" path="dateOfDiagnosis"
							style="width: 120px" /></td>
				</tr>
				<tr>
					<td>Follow Up</td>
					<td><form:select path="followUp" id="followUp"
							style="width: 127px">
							<option value=1>Required</option>
							<option value=2>Not Required</option>
						</form:select></td>
				</tr>
				<tr>
					<td>Date of Followup</td>
					<td><form:input type="date" path="dateOfFollowUp"
							style="width: 120px" /></td>
				</tr>
				<tr>
					<td>Bill Amount</td>
					<td><form:input type="double" path="billAmount"
							style="width: 120px" /></td>
				</tr>
				<tr>
					<td>Card Number</td>
					<td><form:input type="text" path="cardNumber"
							style="width: 120px" /><font color = "red"><form:errors path="cardNumber"/></font></td>
				</tr>
				<tr>
					<td>Mode Of Payment</td>
					<td><form:select path="modeOfPayment" id="modeOfPayment"
							style="width: 127px">
							<option value=1>Online</option>
							<option value=2>Cash</option>
						</form:select></td>
				</tr>
				
				

			</table>
			<input type="submit" value="Add" onclick="Added Successfully">
		</form:form>
	</div>
	
</body>
</html>