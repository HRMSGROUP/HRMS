$(document).ready(function(){
   
	 var cachedCityOptions = null;
     
	    $(document).ready(function () {
	        $('#department').jtable({
	            title: 'department List',
	            paging: true,
	            pageSize: 10,
	            sorting: true,
	            multiSorting: true,
	            defaultSorting: 'Name ASC',
	            actions: {
	                listAction: function (postData, jtParams) {
	                    console.log("Loading from custom function...");
	                    return $.Deferred(function ($dfd) {
	                        $.ajax({
	                            url: '/http://localhost:8080/HRMS/hr/departments/list?jtStartIndex=' + jtParams.jtStartIndex + '&jtPageSize=' + jtParams.jtPageSize + '&jtSorting=' + jtParams.jtSorting,
	                            type: 'GET',
	                            dataType: 'text',
	                            data: postData,
	                            success: function (data) {
	                                $dfd.resolve(data);
	                            },
	                            error: function () {
	                                $dfd.reject();
	                            }
	                        });
	                    });
	                },
	                deleteAction: function (postData) {
	                    console.log("deleting from custom function...");
	                    return $.Deferred(function ($dfd) {
	                        $.ajax({
	                            url: '/Demo/DeleteStudent',
	                            type: 'POST',
	                            dataType: 'json',
	                            data: postData,
	                            success: function (data) {
	                                $dfd.resolve(data);
	                            },
	                            error: function () {
	                                $dfd.reject();
	                            }
	                        });
	                    });
	                },
	                createAction: function (postData) {
	                    console.log("creating from custom function...");
	                    return $.Deferred(function ($dfd) {
	                        $.ajax({
	                            url: '/Demo/CreateStudent',
	                            type: 'POST',
	                            dataType: 'json',
	                            data: postData,
	                            success: function (data) {
	                                $dfd.resolve(data);
	                            },
	                            error: function () {
	                                $dfd.reject();
	                            }
	                        });
	                    });
	                },
	                updateAction: function(postData) {
	                    console.log("updating from custom function...");
	                    return $.Deferred(function ($dfd) {
	                        $.ajax({
	                            url: '/Demo/UpdateStudent',
	                            type: 'POST',
	                            dataType: 'json',
	                            data: postData,
	                            success: function (data) {
	                                $dfd.resolve(data);
	                            },
	                            error: function () {
	                                $dfd.reject();
	                            }
	                        });
	                    });
	                }
	            },
	            fields: {
	            	 userid: {
	                 	title:'departmentId',
	                     key: true,
	                     list: true,
	                     create:true
	                 },
	                 firstName: {
	                     title: 'departmentName',
	                     width: '30%',
	                     edit:false
	                 },
	                 lastName: {
	                     title: 'departmentBuilding',
	                     width: '30%',
	                     edit:true
	                 },
	                 email: {
	                     title: 'departmentLocation',
	                     width: '20%',
	                     edit: true
	                 }       
	            }
	        });
	        //Load student list from server
	        $('#StudentTableContainer').jtable('load');
	    });
});
