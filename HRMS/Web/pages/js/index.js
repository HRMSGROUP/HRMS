/**
 * author: maanda
 */
 var table = null;
$(document).ready(function(){
	//This function run on pageload
	//createControls();
	$.ajax({
		dataType: "text",//force ajax return text in order to parse json latter.
		url: "http://localhost:8080/HRMS/hr/ApplicantService/list", 
		success: function(data){
			//custome parse Json
			
			var jsonTbl = JSON.parse(data);

	 table = $("#tbl_Credantials").dataTable({
	        "bJQueryUI": true,
	        "iDisplayLength": 1,
	        "bLengthChange": true,
	        "aaData": jsonTbl,
	        "sAjaxSource": "http://localhost:8080/HRMS/hr/ApplicantService/list",
	        "bServerSide": true,
	        "bSort": false,
	        "bVisible":false,
	        //"bProcessing": true,
	        "sPaginationType": "full_numbers",
	        "aoColumns": [
	                      {"sTitle": "First name", "mDataProp": "firstName", "sWidth": "40px" },   
	                      {"sTitle": "Last name", "mDataProp": "lastName" , "sWidth": "40px"},
	                      {"sTitle": "Title", "mDataProp": "title" , "sWidth": "30px"},	                  	          
	                      {"sTitle": "Email", "mDataProp": "email", "sWidth": "40px" },	                      
	                      {"sTitle": "Contact number", "mDataProp": "contactNumber", "sWidth": "38px" },
	                      {"sTitle": "Institution", "mDataProp": "institution", "sWidth": "40px" },
	                      {"sTitle": "Qualification", "mDataProp": "qualification", "sWidth": "30px" },                    
	                      {"sTitle": "Position", "mDataProp": "position", "sWidth": "30px" },                     
	                      {"sTitle": "Actions", "mDataProp": "appid", "sWidth": "40px" },
	                     
	                  ],
	                  "aoColumnDefs": [{ "bVisible": false, "aTargets": [] }],
	                  "iDeferLoading": [2, 2],
	                  "fnRowCallback": function (nRow, aData, iDisplayIndex, iDisplayIndexFull) {     	           
	       	           $('td:eq(8)', nRow).html('<input type="button"  value="Details" onclick="doUpdate('+iDisplayIndex+');" class="mws-button green" />&nbsp; <input type="button"   value="Delete"  class="mws-button red"  /><br/>');
	       	       }
	       	    });
	       	  

	       			}
	       		});
	       	});


function doUpdate(index){
	 debugger;
	 var data=table.fnGetData(index);
	 
	 $("#updatediv").css("display", "block");
	 $("#tbfirstName").val(data["firstName"]);
	 $("#tblastName").val(data["lastName"]);
	 $("#tbtitle").val(data["title"]);
	 $("#tbemail").val(data["email"]);
	 $("#tbidNumber").val(data["identityNumber"]);
	 $("#tbposition").val(data["position"]);
	 $("#tbcontactNumber").val(data["contactNumber"]);	 
	 $("#tbinstitution").val(data["institution"]);
	 $("#tbqualification").val(data["qualification"]);	
	 $("#tbempType").val(data["empType"]);	 
	 $("input[id=hf_appid]").val(data["appid"]); 
	 
	}
function doCancel(){
	 $("#updatediv").css("display", "none");
	}

