<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Success - Hospital Records</title>
</head>
<body style="background-color: lightblue">
<h4>Your Login is Successful!!</h4>
<div align="center">
			<h1>Hospital Management System!!</h1>

			<table border=4>
				<tr>
					<td>Patient Details :</td>
					<td><a href="/HospitalManagement/patientdetails/addpatientdetails">Add Patient Details</a></td>
				</tr>
				<tr>
					<td>Physician Details</td>
					<td><a href="/HospitalManagement/physiciandetails/addphysiciandetails">Add Physician Details</a></td>
				</tr>
				<tr>
					<td>Diagnostic Details</td>
					<td><a href="/HospitalManagement/diagnosticdetails/adddiagnosticdetails">Add Diagnostic Details</a></td>
				</tr>
				<tr>
					<td>Patient History</td>
					<td><a href="/HospitalManagement/patientdetails/patienthistory">View Patient Details</a></td>
				</tr>
				<tr>
					<td>Physician Search</td>
					<td><a href="/HospitalManagement/physiciandetails/physiciansearch">View Physician Details</a></td>
				</tr>
				</table>
			</div>
</body>
</html>
