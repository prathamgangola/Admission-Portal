<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title> College SignUp Page </title>
	<link href="static/style.css" rel="stylesheet">
	
	</head>
	<body>
		<h1> SignUp Here </h1>
			<form class="form" action="action/signup_process.jsp">
				<div>
					<label> User Id </label>
					<input type="text" name="login_id">
				</div>
				<div>
					<label> Password </label>
					<input type="password" name="login_password">
				</div>
				<div>
					<input type="submit" value="Submit">
				</div>
			</form>
	</body>
</html>
