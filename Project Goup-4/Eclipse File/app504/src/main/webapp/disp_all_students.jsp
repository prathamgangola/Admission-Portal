<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="account.*, java.util.*" %>
   
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title> College STUDENT LIST </title>
	<link href="static/style.css" rel="stylesheet">
	
	</head>
	<body>
		<h1> ALL STUDENT RECORDS </h1>
		<a href="registrationPage.jsp"> SIGN UP </a>
		<%
			ArrayList <SignupData> list = RegistrationDb.queryDB();
		%>
			<table width="100%"> 
				<tr> 
					<th> STUD_ID </th>
					<th> STUDENT NAME </th>
					<th> FATHER NAME </th>
					<th> MOTHER NAME </th>
					<th>AGE </th>
					<th> GENDER </th>
					<th> ADDRESS </th>
					<th> COURSE </th>
					<th> 10TH % </th>
					<th> 12TH % </th>
					<th> FEE </th>
					
				</tr>
				
		<%
			for(SignupData s : list) {
				int stud_id = s.getStud_id();
				String studentName= s.getStudentName();
				String fathersName= s.getFathersName();
				String mothersName= s.getMothersName();
				String age= s.getAge();
				String gender= s.getGender();
				String address= s.getAddress();
				String course= s.getCourse();
				String percentssc= s.getPercentssc();
				String percenthsc= s.getPercenthsc();
				String fee= s.getFee();
			
		%>
			<tr> 
				<td> <%= stud_id %> </td>
				<td> <%= studentName%> </td>
<td> <%= fathersName%> </td>
<td> <%= mothersName%> </td>
<td> <%= age        %> </td>
<td> <%= gender     %> </td>
<td> <%= address    %> </td>
<td> <%= course     %> </td>
<td> <%= percentssc %> </td>
<td> <%= percenthsc %> </td>
<td> <%= fee        %> </td>
			</tr>
		<%
			}
				
		%>
		</table>
	</body>
</html>
