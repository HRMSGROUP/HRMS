$(document).ready(function(){
   
	var payrollViewModel = function(){
	
	self = this;
	self.payrollName = ko.observable();
	self.payrollDescription = ko.observable();
/*	self.payrollId = ko.observable();*/
	
	var payrollObject = {
			
			payrollName:self.payrollName,
			payrollDescription:self.payrollDescription,
	};
	var updatePayroll = {
			
			/*payrollId:self.payrollId,*/
			payrollName:self.payrollName,
			payrollDescription:self.payrollDescription,
	};
	
	self.savePayroll = function(model,event){
		$.ajax({
			type:'POST',
			data:ko.toJSON(payrollObject),
			url:'http://localhost:8080/HRMS/hr/payRollController/savePayroll',
			dataType:'json',
			contentType:'application/json;charset=utf-8',
			success:function(data){
				alert("payroll is added " );
			},
			error:function(XHR,status,er){
				alert("Failed to save payroll...");
			}
			
		});
	};
	self.updateDeparment = function(){
		
		$.ajax({
			
			type:'PUT',
			data:ko.toJSON(updateDepartment),
			url:'http://localhost:8080/HRMS/hr/departments/addDepartment',
			contentType:'application/json;charset=utf-8',
			dataType:'json',
			success:function(data
					){
				alert("payroll is successfully updated")
			},
			error:function(XHR,status,er){
				alert("Department update failed")
			}
		});
	};
};
   
	  ko.applyBindings(new payrollViewModel()); 
});
