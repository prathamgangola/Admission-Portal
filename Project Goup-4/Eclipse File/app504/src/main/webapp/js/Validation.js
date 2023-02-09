
  function checkElig() 
	{	
	if(document.getElementById("sname").value == "")
		{
			alert("Plaese enter yor name!!");
			frm.sname.focus();
			return false;
		}						
		if(document.getElementById("fname").value == "")
		{
			alert("Please enter your father's name!");
			frm.fname.focus();
			return false;
		}					
	if(document.getElementById("mname").value == "")
		{
			alert("Please enter your mother's name!");
			frm.mname.focus();
			return false;
		}
	if(document.getElementById("age").value == "")
		{
			alert("Please enter your age!");
			frm.age.focus();
			return false;
		}				
	if(document.getElementById("age").value < "17")
		{
			alert("Sorry you are not Eligible! Age must be above 17!");
			document.getElementById("age").focus();
			return false;
		}				
	if(document.getElementById("add").value == "")
		{
			alert("Please enter your address!");
			frm.address.focus();
			return false;
		}		
	if(document.getElementById("percentssc").value == "")
		{
			alert("Please enter X percentage!");
			frm.percentssc.focus();
			return false;
		}						
	if(document.getElementById("percenthsc").value == "")
		{
			alert("Please enter XII percentage!");
			frm.percenthsc.focus();
			return false;
		}	
	if(document.getElementById("coursename").value=="Mechanical Engineering" && document.getElementById("percentssc").value < "80" )
		{
			alert("Your Not eligible for "+document.getElementById("coursename").value + " course");
			frm.percentssc.focus();
			return false;
		}
	if(document.getElementById("coursename").value=="Mechanical Engineering" && document.getElementById("percenthsc").value < "70")
		{
			alert("Your Not eligible for "+document.getElementById("coursename").value + " course");
			frm.percenthsc.focus();
			return false;
		}
	if(document.getElementById("coursename").value=="Civil Engineering" && document.getElementById("percentssc").value< "70" )
		{
			alert("Your Not eligible for "+document.getElementById("coursename").value +" course");
			frm.percentssc.focus();
			return false;
		}
	if(document.getElementById("coursename").value=="Civil Engineering" && document.getElementById("percenthsc").value < "60")
		{
			alert("Your Not eligible for "+document.getElementById("coursename").value +" course");
			frm.percenthsc.focus();
			return false;
		}	
	if(document.getElementById("coursename").value=="Electrical Engineering" && document.getElementById("percentssc").value< "70" )
		{
			alert("Your Not eligible for "+document.getElementById("coursename").value +" course");
			frm.percentssc.focus();
			return false;
		}
	if(document.getElementById("coursename").value=="Electrical Engineering" && document.getElementById("percenthsc").value < "60")
		{
			alert("Your Not eligible for "+document.getElementById("coursename").value +" course");
			frm.percenthsc.focus();
			return false;
		}	
	if(document.getElementById("coursename").value=="Computer Engineering" && document.getElementById("percentssc").value< "85" )
		{
			alert("Your Not eligible for "+document.getElementById("coursename").value +" course");
			frm.percentssc.focus();
			return false;
		}
	if(document.getElementById("coursename").value=="Computer Engineering" && document.getElementById("percenthsc").value < "75")
		{
			alert("Your Not eligible for "+document.getElementById("coursename").value +" course");
			frm.percenthsc.focus();
			return false;
		}
	if(!check.checked)
	{
		alert("Checkbox and checked");
		return false;
	}
	return alert("Form Submitted Successfully!");
	}
  
  function checkFunt()
	{
	if(document.getElementById("coursename").value=="Mechanical Engineering" )
		{
			document.getElementById("fee").value="88000";
			alert("Minimum percentage for X=81 and XII=71");
		}
	if(document.getElementById("coursename").value=="Computer Engineering" )
		{
			document.getElementById("fee").value="100000";
			alert("Minimum percentage for X=86 and XII=76");
		}
	if(document.getElementById("coursename").value=="Civil Engineering" )
		{
			document.getElementById("fee").value="75000";
			alert("Minimum percentage for X=71 and XII=61");
		}
	if(document.getElementById("coursename").value=="Electrical Engineering" )
		{
			document.getElementById("fee").value="85000";
			alert("Minimum percentage for X=71 and XII=61");
		}		  
	}
	
 
  
  
