$(document).ready(function(){
   
	var departmentViewModel = function(){
	
	self = this;
	self.hoursWorkedperDay = ko.observable();
	self.overTimeWorked = ko.observable();
	self.startTime = ko.observable();
	self.endTime = ko.observable();
	
	var departmentObject = {
			
			hoursWorkedperDay:	self.hoursWorkedperDay,
			overTimeWorked:self.overTimeWorked,
			startTime:self.startTime,
			endTime:self.endTime,
	};

	
	self.saveTimeSheet = function(){
		$.ajax({
			type:'POST',
			data:ko.toJSON(departmentObject),
			url:'http://localhost:8080/HRMS/hr/timesheet/addAttendance',
			dataType:'json',
			contentType:'application/json;charset=utf-8',
			success:function(data){
				alert("Department is added " );
			},
			error:function(XHR,status,er){
				alert("Failed to save department...");
			}
			
		});
	};
};
   
	  ko.applyBindings(new departmentViewModel()); 
});
