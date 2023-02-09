<html>
	<head>
		<style>
		
.logo {
	position : absolute;
	margin-top: 85px; 
	margin-left: 85px; 
	top : 0;
	left : 0;
}		

ul {
    float: left;
    width: 100%;
    padding: 0;
    margin-top: 2px;
	margin-left: 85px;
    list-style-type: none;
}

.cd {
    float: left;
    width: 20%;
    text-decoration: none;
	text-align: center;
    color: white;
    background-color: black;
    padding: 0.2em 0.6em;
    border-right: 1px solid white;
}
		
.header {
	  width : 100%;
	  height : 150px;
	  background-color : #2848BF;
}

.footer{
	  width : 100%;
	  height : 100px;
	  background-color : #2D3656 ;
}		

div{
	background-color: #e0ebeb;
    height: auto;
}
		
input[type=text], input[type=password],input[type=Number],input[type=date] {
    width: 30%;
    padding: 12px 20px;
    margin: 8px 0;
    height:10px;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}

button {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 25%;
}

.cancelbtn {
    padding: 14px 20px;
    background-color: #f44336;
    width=25%;
}
body{
    background-color:#5072C6;
	font-family: Helvetica, sans-serif;
    padding: 5%;
}
	
.cancelbtn,.signupbtn {
    float: left;
    width: 22%;
}

.container {
	width:auto;
    padding: 16px;
}

.clearfix::after {
    content: "";
    clear: both;
    display: table;
    height:30px;
    }

@media screen and (max-width: 300px) {
    .cancelbtn, .signupbtn {
       width: 100%;
    }
}

label{
	min-width:180px;
	display: inline-block;
}
		</style>
		<script type="text/javascript" src="js/Validation.js"></script> 
	</head>
	<body style ="background:linear-gradient(135deg, #71b7e6, #9b59b6)">

			<img class = "logo" src = "images/Logo.jpg" height = "110px" width = "auto" border = 2%;>

	
	<div class = "header">
        <FONT SIZE="4" FACE="Algerian" COLOR="white"><CENTER><h1>Prestige Institute of Engineering,<br> Management & Research<br> Mumbai</h1><CENTER></FONT>
	</div>
	
		<FONT FACE="arial" COLOR="#00008B"> <CENTER><h2>Permanently Affilated to University of Mumbai</h2>
				<font size = "3" color = "black" >   Appooved By AICTE , Accredited by NBA<br>
					<font size = "2" >(Recognized by UGC under the sections 2(f) and 12(B) of the UGC act 1956)</font>
				</font>
											</CENTER>
		</FONT>
			    
			<br>
			
			<hr style = "border-top: 2px solid black;">
			
			            <MARQUEE BEHAVIOUR="SLIDE"><BIG><b><a href = "registrationPage.jsp" target = "blank"> Admissions open for year 2021-2022! Click here for registration. </a></b></BIG>  </MARQUEE>
			
			<ul class = "ul">
				<li><a class="cd" href="index.jsp">Home</a></li>
				<li><a class="cd" href="About Us.html">About us</a></li>
				<li><a class="cd" href="registrationPage.jsp">Registration Page</a></li>
				<li><a class="cd" href="Contact Details.html">Contact us</a></li>
			</ul>
			
			<br>
			<br>
			<br>
		
		<title>Registration Page</title>
			<div style = "text-align:center">
				<h2>Register for Admission</h2>
			</div>

	<form name = "frm" action = "action/registrationProcess.jsp" method="POST" style="border:1px solid #ccc">
		<div class="container">
			<fieldset>
				<legend>Personal details</legend>
					<label><b>Name  </b> </label>
					<input type="text" placeholder="Enter name" name="sname"  id="sname" required>
					
					<br>
					
					<label><b>Father's Name</b></label>
					<input type="text" placeholder="Enter Name" name="fname"  id="fname" required>
					
					<br>
					
					<label><b>Mother's Name</b></label>
					<input type="text" placeholder="Enter Name" name="mname"  id="mname" required>
					
					<br>
					
					<label><b>Age of Student</b></label>
					<input type="Number" placeholder="Enter Age" name="age" id="age" required>
					
					<br>
					
					<label><b>Select Gender</b></label>
					<select name="gender">
					<option default>Select Gender</option>
					<option value="M">Male</option>
					<option value="F">Female</option>
					<option value="O">Others</option>
					</select>
					
					<br>
					
					<label><b>Address</b></label>
					<input type="text" placeholder="Enter Your Address" name="address" id="add" required><br>
          </fieldset>
      
			<fieldset>
					<legend>Academic details</legend>
					<label><b>Select Course</b></label>
					<select name="coursename" id="coursename" onchange="checkFunt()">
					<option value="Def">Select Course</option>
					<option value="Computer Engineering">Computer Engineering</option>
					<option value="Civil Engineering">Civil Engineering</option>
					<option value="Mechanical Engineering">Mechanical Engineering</option>
					<option value="Electrical Engineering">Electrical Engineering</option>
					</select>
					
					<br>
					
					<label><b>10th Marks</b></label>
					<input type="text" name="percentssc" id="percentssc" placeholder="Enter your SSC percentage" required>
					
					<br>
					
					<label><b>12th Marks</b></label>
                    <input type="text" name="percenthsc" id="percenthsc" placeholder="Enter your HSC percentage" required>
					
					<br>
					
					<label><b>Registration Fee</b></label>
					<input type="Number" placeholder="Fee Amount" name="fee" id = "fee"><br>
			</fieldset>
			
					<br>
					
					<input type="checkbox" id = "check" required>
      
			<p>I Agree to the <a href="file:///C:/Users/vikrant.gaikwad/Desktop/Project/Terms.pdf">Terms & Condition</a>.</p>

			<div class="clearfix">
				<button type="submit" class="signupbtn" onclick = "checkElig()" value="Submit" >Register</button>
			</div>
		</div>
	</form>
	
    <br>
	
	<div class = "footer">
    <footer>
	
	<br>
	
        <p style = "text-align:center">
			<font color = "white">@copyright Prestige Institute</font>
        </p>
		
    </footer>
	</div>
	
    </body>
</html>