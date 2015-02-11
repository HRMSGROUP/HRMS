$(document).ready(function(){
   
	var departmentViewModel = function(){
	
	self = this;
	self.departmentName = ko.observable();
	self.departmentBuilding = ko.observable();
	self.departmentLocation = ko.observable();
	self.departmentId = ko.observable();
	
	var departmentObject = {
			
			departmentName:	self.departmentName,
			departmentBuilding:self.departmentBuilding,
			departmentLocation:self.departmentLocation,
	};
	var updateDepartment = {
			
			departmentId:self.deparmentId,
			departmentName:	self.departmentName,
			departmentBuilding:self.departmentBuilding,
			departmentLocation:self.departmentLocation,
	};
	
	self.saveDepartment = function(){
		$.ajax({
			type:'POST',
			data:ko.toJSON(departmentObject),
			url:'http://localhost:8080/HRMS/hr/departments/addDepartment',
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
	self.updateDeparment = function(){
		
		$.ajax({
			
			type:'PUT',
			data:ko.toJSON(updateDepartment),
			url:'http://localhost:8080/HRMS/hr/departments/addDepartment',
			contentType:'application/json;charset=utf-8',
			dataType:'json',
			success:function(data
					){
				alert("Deparment is successfully updated")
			},
			error:function(XHR,status,er){
				alert("Department update failed")
			}
		});
	};
};
   
	  ko.applyBindings(new departmentViewModel()); 
});
