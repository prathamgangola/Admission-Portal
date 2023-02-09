<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="account.*" %>

<%
	String studentName = request.getParameter("sname");
	String fathersName = request.getParameter("fname");
    String mothersName = request.getParameter("mname");
	String age = request.getParameter("age");
	String gender = request.getParameter("gender");
	String course = request.getParameter("coursename");
	String percentssc = request.getParameter("percentssc");
	String percenthsc = request.getParameter("percenthsc");
	String fee = request.getParameter("fee");
	String homeaddress = request.getParameter("address");
	
	
	RegistrationDb.handleAccountDetails(studentName,fathersName,mothersName,age,gender,homeaddress,course,percentssc,percenthsc,fee);
	response.sendRedirect("../disp_all_students.jsp");
%>