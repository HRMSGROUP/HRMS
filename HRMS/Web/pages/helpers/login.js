$(document).ready(function(){
   
	var loginViewModel = function(){
	
	self = this;
	self.email = ko.observable();
	self.password = ko.observable();
	
	var login = {
			
			email:	self.email,
			password:self.password,
	};
	
	self.LoginUser = function(){
		$.ajax({
			type:'POST',
			data:ko.toJSON(login),
			url:'http://localhost:8080/HRMS/hr/departments/addDepartment',
			dataType:'json',
			contentType:'application/json;charset=utf-8',
			success:function(data){
				alert("success " );
			},
			error:function(XHR,status,er){
				alert("error happened...");
			}
			
		});
	};

};
   
	  ko.applyBindings(new loginViewModel()); 
});
