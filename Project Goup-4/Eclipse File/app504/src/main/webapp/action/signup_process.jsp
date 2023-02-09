<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="account.*" %>

<%
	String login_id = request.getParameter("login_id");
	String login_password = request.getParameter("login_password");
	AccountBO.handleAccountDetails(login_id, login_password);
	response.sendRedirect("../disp_all_students.jsp");
%>