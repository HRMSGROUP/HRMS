/**
 * 
 */
/**
 * 
 */
var table=null;
$(document).ready(function(){
	loadTable();
});

function loadTable()
{
	$.ajax({
		dataType: "text",//force ajax return text in order to parse json latter.
		url: "http://localhost:8080/HRMS/hr/EmployeeService/ViewEmployees", 
		success: function(data){

			var jsonTbl = JSON.parse(data);
			table=$("#tbl_employee").dataTable({
	        "bJQueryUI": true,
	        "iDisplayLength": 1,
	        "bLengthChange": true,
	        "aaData": jsonTbl,
	        "sAjaxSource": "http://localhost:8080/HRMS/hr/EmployeeService/ViewEmployees",
	        "bServerSide": true,
/*	        "bSort": false,*/
	        "bVisible":false,
	        "bProcessing": false,
	        "sPaginationType": "full_numbers",
	        "aoColumns": [	                   	                      
	                      {"sTitle": "First name", "mDataProp": "firstName" , "sWidth": "150px"},	                    
	                      {"sTitle": "Last name", "mDataProp": "lastName" , "sWidth": "150px"},	
	                      {"sTitle": "ID number", "mDataProp": "identityNumber" , "sWidth": "200px"},
	                      {"sTitle": "Title", "mDataProp": "title" , "sWidth": "100px"},	              
	                      {"sTitle": "Email", "mDataProp": "email" , "sWidth": "100px"},	                     
	                      {"sTitle": "Contact Number", "mDataProp": "contactNumber" , "sWidth": "100px"},
	                      {"sTitle": "Institution", "mDataProp": "institution" , "sWidth": "100px"},   
	                      {"sTitle": "Qualification", "mDataProp": "qualification" , "sWidth": "100px"},
	                      {"sTitle": "Position", "mDataProp": "position" , "sWidth": "100px"},	                      
	                      {"sTitle": "Employee type", "mDataProp": "empType" , "sWidth": "100px"},                   
	                      {"sTitle": "Actions", "mDataProp": "empNumber", "sWidth": "150px" },
	                      
	                  ],
	                  "aoColumnDefs": [{ "bVisible": false, "aTargets": [] }],
	                  "iDeferLoading": [jsonTbl.length, jsonTbl.length],
	                  "fnRowCallback": function (nRow, aData, iDisplayIndex, iDisplayIndexFull) { 
	                	  
	       	           $('td:eq(10)', nRow).html('<input type="submit" value="View" onclick="doUpdate('+iDisplayIndex+');" class="mws-button green">&nbsp; <input type="button" class="mws-button red" value="Delete" onclick="doDelete('+aData["empNumber"]+');"/><br/>');
	
	                  }
	       	});
	    }
	});	
}

function doDelete(empNumber){

	var empNumber = empNumber;
	
	var saveJson = { empNumber: empNumber};
	
	var successF = function (data) {
		alert("Succesfuly removed");
		table.fnDestroy();
		loadTable();
    };
    
    var errorF = function (data) {
    	
        alert("Delete error, contact system admin!!!");
    };
	 hrms.ajax.post("http://localhost:8080/HRMS/hr/EmployeeService/DeleteEmployees",saveJson, successF, errorF);
}

function doUpdate(index){

	var data=table.fnGetData(index);
	
	$("#updatediv").css("display", "block");
	$("#tbfirstName").val(data["firstName"]);	
	$("#tblastName").val(data["lastName"]);
	$("#tbidNumber").val(data["identityNumber"]);
	$("#tbtitle").val(data["title"]);	
	$("#tbemail").val(data["email"]);		
	$("#tbinstitution").val(data["institution"]);
	$("#tbqualification").val(data["qualification"]);
	$("#tbposition").val(data["position"]);
	$("#tbcontactNumber").val(data["contactNumber"]);
	$("#tbempType").val(data["empType"]);
	$("input[id=hf_empNumber]").val(data["empNumber"]);	
		
}

function doCancel(){
	$("#updatediv").css("display", "none");
}
function update(){
	var empNumber =$("input[id=hf_empNumber]").val();
	
	//Get Object
	var FirstName = $("#tbfirstName");
	var LastName = $("#tblastName");
	var ID = $("#tbidNumber");
	var Title = $("#tbtitle");
	var Email = $("#tbemail");
	var Institution = $("#tbinstitution");
	var Qualification = $("#tbqualification");
	var Position = $("#tbposition");
	var ContactNumber = $("#tbcontactNumber");
	var EmpType = $("#tbempType");
	
    //Get values
	var firstName = FirstName.val();
	var lastName = LastName.val();
	var identityNumber = ID.val();
	var title = Title.val();	
	var email = Email.val();
	var institution = Institution.val();
	var qualification = Qualification.val();
	var position = Position.val();
	var contactNumber = ContactNumber.val();
	var empType = EmpType.val();
	
	var saveJson = { 			
						empNumber : empNumber, 
						firstName : firstName, 			
						lastName : lastName, 
						identityNumber : identityNumber, 
						title : title, 					
						email : email, 	
						institution : institution,
						qualification : qualification,
						position : position, 
						contactNumber : contactNumber, 
						empType : empType		
					};

	    var successF = function (data) {
	    	
	    	if(data){
	    		alert("Succesfully updated");
	    		table.fnDestroy();
	    		loadTable();
			}
			else{
				alert("Not updated");	  		
			}
			
	    };

	    var errorF = function (data) {
	    	alert("Failed to update");
	    };
	    
	    hrms.ajax.post("http://localhost:8080/HRMS/hr/EmployeeService/UpdateEmployees", saveJson, successF, errorF);

}

