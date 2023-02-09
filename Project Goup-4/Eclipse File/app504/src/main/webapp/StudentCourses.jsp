
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="college.admin.*, java.util.*, java.io.*" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Course List</title>
</head>
<body>
	<h1>Courses List</h1>

	<%
		ArrayList<CourseEntity> list = CollegeBO.GetCourses();	
		for(CourseEntity course : list) 
		{
			out.print("<div>");
			out.print("<h1>" + course.getCourse_name() + "</h1>");
			out.print("<div>" + course.getCourse_detail() + "</div>");
			out.print("<input type='button' value='Apply for Course'/>");
			out.print("</div>");
			
		}
	 %>
	
</body>
</html>