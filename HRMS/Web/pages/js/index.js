/**
 * author: maanda
 */
 var table = null;
$(document).ready(function(){
	//This function run on pageload
	//createControls();
	$.ajax({
		dataType: "text",//force ajax return text in order to parse json latter.
		url: "http://localhost:8080/HRMS/rest/ApplicantService/list", 
		success: function(data){
			//custome parse Json
			
			var jsonTbl = JSON.parse(data);

	 table = $("#tbl_Credantials").dataTable({
	        "bJQueryUI": true,
	        "iDisplayLength": 1,
	        "bLengthChange": true,
	        "aaData": jsonTbl,
	        "sAjaxSource": "http://localhost:8080/HRMS/rest/ApplicantService/list",
	        "bServerSide": true,
	        "bSort": false,
	        "bVisible":false,
	        //"bProcessing": true,
	        "sPaginationType": "full_numbers",
	        "aoColumns": [
	                      {"sTitle": "First name", "mDataProp": "firstName", "sWidth": "100px" },
	                      // {"sTitle": "Middle name", "mDataProp": "middleName" , "sWidth": "100px"},
	                      {"sTitle": "Last name", "mDataProp": "lastName" , "sWidth": "100px"},
	                      //{"sTitle": "Title", "mDataProp": "title" , "sWidth": "100px"},
	                      {"sTitle": "ID number", "mDataProp": "identityNumber" , "sWidth": "100px"},
	                      // {"sTitle": "Date of birth", "mDataProp": "dateOfBirth", "sWidth": "100px" },	                      
	                      //{"sTitle": "Gender", "mDataProp": "gender", "sWidth": "100px" },	
	                      //{"sTitle": "Race", "mDataProp": "race", "sWidth": "100px" },
	                      //{"sTitle": "Province", "mDataProp": "province", "sWidth": "100px" },
	                      //{"sTitle": "Nationality", "mDataProp": "country", "sWidth": "100px" },
	                      //{"sTitle": "Email", "mDataProp": "email", "sWidth": "100px" },
	                      //{"sTitle": "Address", "mDataProp": "address", "sWidth": "100px" },
	                      //{"sTitle": "Code", "mDataProp": "code", "sWidth": "100px" },
	                      {"sTitle": "Contact number", "mDataProp": "contactNumber", "sWidth": "100px" },
	                      //{"sTitle": "Institution", "mDataProp": "institution", "sWidth": "100px" },
	                      //{"sTitle": "Qualification", "mDataProp": "qualification", "sWidth": "100px" },
	                      //{"sTitle": "Compelete year", "mDataProp": "dateCompleted", "sWidth": "100px" },
	                      {"sTitle": "Position", "mDataProp": "position", "sWidth": "100px" },
	                      //{"sTitle": "Cover letter", "mDataProp": "coverLetter", "sWidth": "100px" },
	                      {"sTitle": "Actions", "mDataProp": "appid", "sWidth": "100px" },
	                     
	                  ],
	                  "aoColumnDefs": [{ "bVisible": false, "aTargets": [] }],
	                  "iDeferLoading": [2, 2],
	                  "fnRowCallback": function (nRow, aData, iDisplayIndex, iDisplayIndexFull) {     	           
	       	           $('td:eq(5)', nRow).html('<input type="button"  value="View details" onclick="doUpdate('+iDisplayIndex+');" class="mws-button green" />&nbsp; <input type="button"   value="Delete"  class="mws-button red"  /><br/>');
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
	 $("#tbposition").val(data["position"]);
	 $("#tblastName").val(data["lastName"]);
	 $("#tbidNumber").val(data["identityNumber"]);
	 $("#tbtitle").val(data["title"]);
	 $("#tbgender").val(data["gender"]); 
	 $("#tbemail").val(data["email"]);
	 $("#tbaddress").val(data["address"]);
	 $("#tbcode").val(data["code"]);
	 $("#tbcontact").val(data["contactNumber"]);
	 $("input[id=hf_appid]").val(data["appid"]); 
	 
	}
function doCancel(){
	 $("#updatediv").css("display", "none");
	}

function doAccept(){
	
	
	
	
}

/*//Function to create controls using widgets
function createControls(){
	var date=new Date();
	
	thakhani.widgets.selectbox.create("#cbmGender", null, { placeholder: "Gender", allowClear: false }); 
	thakhani.widgets.money.create("#tbPrice", null, null);
	thakhani.widgets.spin.perc.create("#tbPercentage", null, null);
	thakhani.widgets.date.create ("#tbDate");
	$("#tbDate").datepicker("setDate",date);
}

function doGet()
{
	//your code HERE to GET info and return it using json

	  var successF = function (data) {
		  
        var  dbData = data;
        $.each(data, function (index, item) {
        	
            if (index == 0) {
               alert(item.email);
            alert(item.password);
            
            }
           
        });
      
         
      }
	  var errorF = function (data) {
	        alert(data.errorText);
	       
	    }

		  thakhani.ajax.get("http://localhost:8080/Cd_Store/rest/User/list", successF, errorF);

		
}

function onSave()
{
	
	//Get Object
	var NameO = $("#name");
	var EmailO = $("#email");
	var PasswordO = $("#password");
	var ConfirmO = $("#confirmpassword");
	
	
    //Get values
	var name=NameO.val();
	var email=EmailO.val();
	var password=PasswordO.val();
	var confirm=ConfirmO.val();
		
	//Do required field validation here
    var validations = [thakhani.valid8r.req(Name, NameO)];
    //Do password validation here   
    if (!thakhani.valid8r.passwords(password, PasswordO, confirm, ConfirmO)) {
        return false;
    }
    if (!thakhani.valid8r.email(email, EmailO)) {
        return false;
    }
    if (!thakhani.valid8r.range(validations)) {
        return;
    } // End validate
    
    var saveJson = { name: name,email: email,password: password};

    var successF = function (data) {
        alert("saved");
    };

    var errorF = function (data) {
        alert(data.errorText);
    };
    thakhani.ajax.post("http://localhost:8080/Cd_Store/rest/User/addUsers", saveJson, successF, errorF);


}*/

//This just to show how to clear error messages
/*function onClearError()
{
	//Get Object
	var NameO = $("#name");
	var EmailO = $("#email");
	var PasswordO = $("password");
	var ConfirmO = $("#confirmpassword");
	
	thakhani.valid8r.clearerror(NameO);
	thakhani.valid8r.clearerror(EmailO);
	thakhani.valid8r.clearerror(PasswordO);
	thakhani.valid8r.clearerror(ConfirmO);
}*/
