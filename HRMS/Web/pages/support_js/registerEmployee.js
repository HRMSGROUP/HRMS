/**
 * 
 */
function doSave(){
	//Get Object
	var FirstName = $("#tbfirstName");
	var LastName = $("#tblastName");
	var ID = $("#tbidNumber");
	var Title = $("#tbtitle");
	/*var gender = $('input[name="gender"]:checked').val();*/
	var Email = $("#tbemail");
	var ContactNumber = $("#tbcontactNumber");
	var Institution = $("#tbinstitution");
	var Qualification = $("#tbqualification");
	var Position = $("#tbposition");
	var Password = $("#tbpassword");
	var Confirm = $("#tbconfirmPassword");
	var EmpType = $("#tbempType");
	
    //Get values
	var firstName = FirstName.val();
	var lastName = LastName.val();
	var identityNumber = ID.val();
	var title = Title.val();	
	var email = Email.val();
	var contactNumber = ContactNumber.val();
	var institution = Institution.val();
	var qualification = Qualification.val();
	var position = Position.val();
	var password = Password.val();
	var confirm = Confirm.val();
	var empType = EmpType.val();
	
	var saveJson = { 
			
						firstName : firstName, 
						lastName : lastName, 
						identityNumber : identityNumber, 
						title : title,
						email : email, 
						contactNumber : contactNumber, 
						institution : institution, 
						qualification : qualification,
						position : position, 
						password : password, 
						empType : empType
						
					};

    var successF = function (data) {
    	debugger;
    	if(data){
    		alert("Succesfully registered");
    		sendMail(email);
		}
		else{
			alert("Failed to register");	  		
		}
		
    };

    var errorF = function (data) {
    	alert("Error occured during the registration process, contact system admin");
    };
    
    hrms.ajax.post("http://localhost:8080/HRMS/hr/EmployeeService/RegisterEmployees", saveJson, successF, errorF);

}

function sendMail(email) { 
    
	    var saveJson = { email : email }
	    
	    	 var successF = function (data) {
	    		if(data){
	    			alert("Email sent successfully");  		
	    		}
	    		else{
	    			alert("There was a problem sending your email request, contact your system administrator");	
	    		}
	    	};

	    	var errorF = function (data) {
	    		alert("failed!!");
	    	};
	     
	   hrms.ajax.post("http://localhost:8080/HRMS/hr/EmployeeService/email", saveJson, successF, errorF);
	    
}

