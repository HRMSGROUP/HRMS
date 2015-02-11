/**
 * 
 */

 function login() { // loginForm is submitted
	    var Email = $("#tbemail")
	    var Password = $("#tbpassword")
	    var EmpType = $("#tbempType")
	    // Get values
	    var email = Email.val();
	    var password = Password.val();
	    var empType = EmpType.val();
    
	    var saveJson = { email : email, password : password, empType : empType }
	    
	    	 var successF = function (data) {
	    		if(data){
	    			
	    			 var url = "http://localhost:8080/HRMS/employee.html";
	    			 $(location).attr('href',url);
	    		
	    		}
	    		else{
	    			alert("Incorrect email or password");	    			  		
	    		}
	    	};

	    	var errorF = function (data) {
	    		alert("failed!!");
	    	};
	     
	   		thabiso.ajax.post("http://localhost:8080/HRMS/hr/EmployeeService/login", saveJson, successF, errorF);
	    
	 }