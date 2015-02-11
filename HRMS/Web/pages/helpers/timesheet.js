$(document).ready(function(){
   
	var timesheetViewModel = function(){
	
	self = this;
	//self.overTimeWorked = ko.observable();
	self.startTime = ko.observable();
	self.endTime = ko.observable();
	self.hoursWorkedperDay = ko.observable();
	var timesheetObject = {
			//overTimeWorked:self.overTimeWorked,
			startTime:self.startTime,
			endTime:self.endTime,
			hoursWorkedperDay:	self.hoursWorkedperDay,
	};
	var updateTimeSheet = {
			
			hoursWorkedperDay:	self.hoursWorkedperDay,
			//overTimeWorked:self.overTimeWorked,
			startTime:self.startTime,
			endTime:self.endTime,
			timesheetAttendanceId:self.timesheetAttendanceId,
	};
	self.saveTimeSheet = function(){
		$.ajax({
			type:'POST',
			data:ko.toJSON(timesheetObject),
			url:'http://localhost:8080/HRMS/hr/TimesheetService/SaveAttendance',
			dataType:'json',
			contentType:'application/json;charset=utf-8',
			success:function(data){
				alert("timesheet is added " );
			},
			error:function(XHR,status,er){
				alert("Failed to save timesheet...");
			}
			
		});
	};
	self.updateTimeSheet = function(){
		
		$.ajax({
			
			type:'PUT',
			data:ko.toJSON(updateTimeSheet),
			url:'http://localhost:8080/HRMS/hr/TimesheetService/updateAttendance',
			contentType:'application/json;charset=utf-8',
			dataType:'json',
			success:function(data
					){
				alert("timesheet is successfully updated")
			},
			error:function(XHR,status,er){
				alert("timesheet update failed")
			}
		});
	};
};
   
	  ko.applyBindings(new timesheetViewModel()); 
});
