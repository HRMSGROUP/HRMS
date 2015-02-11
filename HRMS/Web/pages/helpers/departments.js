$(document).ready(function(){
	$.ajax({
		dataType: "text",//force ajax return text in order to parse json latter.
		url: "http://localhost:8080/HRMS/hr/departments/list", 
		success: function(data){
			//custome parse Json
			
			var jsonTbl = JSON.parse(data);

	  $("#example").dataTable({
	        "bJQueryUI": true,
	        "iDisplayLength": 1,
	        "bLengthChange": true,
	        "aaData": jsonTbl,
	        "sAjaxSource": "http://localhost:8080/HRMS/hr/departments/list",
	        "bServerSide": true,
	        "bSort": false,
	        "bVisible":true,
	        "bProcessing": false,
	        "sPaginationType": "full_numbers",
	        "aoColumns": [
	                      {"sTitle": "departmentId", "mDataProp": "departmentId", "sWidth": "100px" },
	                      {"sTitle": "departmentName", "mDataProp": "departmentName" , "sWidth": "200px"},
	                      {"sTitle": "departmentBuilding", "mDataProp": "departmentBuilding", "sWidth": "100px" },
	                      {"sTitle": "departmentLocation", "mDataProp": "departmentLocation", "sWidth": "200px" },                     
	                     
	                  ],
	                  "aoColumnDefs": [{ "bVisible": false, "aTargets": [] }],
	                  "iDeferLoading": [2, 2],
	                  "fnRowCallback": function (nRow, aData, iDisplayIndex, iDisplayIndexFull) {     	           
	       	           $('td:eq(4)', nRow).html('<input type="button" class="btn btn-primary"   value="update"  />&nbsp;&nbsp;&nbsp;&nbsp;<input type="button" class="btn btn-primary"  value="Delete" /><br/>');
	       	       }
	       	    });
	       	  

	       			}
	       		});
	       	});