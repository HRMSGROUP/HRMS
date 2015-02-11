/**
 * 
 */


var hrms = hrms || {};
hrms.widgets = hrms.widgets || {};
hrms.widgets.date = {};
hrms.widgets.spin = {};
hrms.ajax = {};
hrms.valid8r = {};



//Boostrap growl notifactions
hrms.widgets.Growl = function (title, body, Timedelay) {
  
        var unique_id = $.gritter.add({
            // (string | mandatory) the ading of the notification
            title: title,
            // (string | mandatory) the text inside the notification
            text: body,
            // (string | optional) the image to display on the left
            image: 'image.png',
            // (bool | optional) if you want it to fade out on its own or just sit there
            sticky: true,
            // (int | optional) the time you want it to be alive for before fading out
            time: Timedelay,
            // (string | optional) the class name you want to apply to that specific message
             class_name: 'gritter-primary'
            // class_name: 'gritter-primary'
        });        
};

/* DATAPICKER */
hrms.widgets.date.create = function (selector, within, options) {
    var defaults = { changeMonth: true, changeYear: true, dateFormat: 'dd M yy', onSelect: function (dateText, inst) { }, onClose: function (dateText, inst) { $(this).trigger("change"); } };
    var sel = (within == null) ? $(selector) : $(selector, within);
    sel.datepicker($.extend(defaults, options));
    // bind blur event
    sel.change(function () {
        var thisO = $(this);
        var dtVal = Date.parse(thisO.val());
        if (isNaN(dtVal)) {
            thisO.val('');
        }
        else {
            thisO.datepicker("setDate", new Date(dtVal));
        }
    });

    return sel;
};
hrms.widgets.date.getdate = function (SelOrObj) {
    if (typeof SelOrObj === "string") {
        SelOrObj = $(SelOrObj);
    }

    if (isNaN(Date.parse(SelOrObj.val()))) {
        return null
    }
    return SelOrObj.datepicker('getDate');
}

/* SPINNER */
hrms.widgets.spin.create = function (selector, within, options) {
    var sel = (within == null) ? $(selector) : $(selector, within);
    sel.each(function () {
        var meta = eval("(" + $(this).attr('meta') + ')');
        $(this).spinner($.extend(meta, options));
    });
    return sel;
}

//get value spinner widget
hrms.widgets.spin.val = function (SelOrObj, val) {
    if (typeof SelOrObj === "string") {
        SelOrObj = $(SelOrObj);
    }

    if (typeof val === "undefined") {
        return SelOrObj.spinner("value");
    }
    else {
        SelOrObj.spinner("value", val);
    }
}


/* AJAX */

hrms.ajax.get = function (url, successF, errorF) {
	
    $.ajax({
        type: 'GET',
        url: url,
        dataType: 'json',
        contentType: "application/json",
        success: function (result) {
            if (typeof successF !== "undefined") {
                successF(result);
            }
        },
        error: function (result) {
            if (errorF == null || typeof errorF === "undefined") {
                alert('Error - ' + result.statusText);
            }
            else {
                errorF(result);
            }
        }
    });
}
hrms.ajax.post = function (url, jsonO, successF, errorF) {
 debugger;
    $.ajax({
        type: "POST",
        url: url,
        data: JSON.stringify(jsonO),// $.toJSON(jsonO) this works for jquery 10 i thnk but does not work for 7,
        processData: false,
        dataType: "json",
        contentType: "application/json",
        success: function (result) {

            if (typeof successF !== "undefined") {
                
                successF(result);
            }
        },
        error: function (result) {
        	debugger;
            if (errorF == null || typeof errorF === "undefined") {
                alert('Error - ' + result.statusText);
            }
            else {
            	debugger;
                errorF(result);
            }
        }
    });
}


/* VALID8R */
hrms.valid8r.seterror = function (cont, msg) {
    cont.addClass("valid8r_Error");
    var n = cont.next();
    if (n.hasClass('errorIcon')) {
        return;
    }
    var html = '<img class="errorIcon" title="' + msg + '" onmouseout="hrms.valid8r.ttout(this)" onmouseover="hrms.valid8r.ttIn(this)" alt="?" src="t/images/error.png"/>';
    cont.after(html);
}
hrms.valid8r.clearerror = function (cont) {
    cont.removeClass("valid8r_Error");
    var n = cont.next();
    if (n.hasClass('errorIcon')) {
        n.remove();
    }
}

hrms.valid8r.range = function (validationsArray) {
    var isValid = true;
    for (var i = 0; i < validationsArray.length; i++) {
        var item = validationsArray[i];
        if (item != true) {
            isValid = false;
        }
    }
    return isValid;
}


hrms.valid8r.req = function (val, cont, error) {
    //if it's NOT valid  
    if (val == null || val.length < 1) {
        hrms.valid8r.seterror(cont, error || 'Required!');
        return false;
    }
        //if it's valid  
    else {
        hrms.valid8r.clearerror(cont);
        return true;
    }
}

hrms.valid8r.email = function (val, cont, error) {
    //if it's Empty
    if (val == null || val.length < 1) {
        hrms.valid8r.seterror(cont, error || 'Invalid Email!');
        return false;
    }
    else {
        //if it's NOT valid 
        var re = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
        if (re.test(val) == false) {
            hrms.valid8r.seterror(cont, 'Invalid Email!');
            return false;
        }
            //if it's valid  
        else {
            hrms.valid8r.clearerror(cont);
            return true;
        }
    }
}

hrms.valid8r.passwords = function (newPassVal, newPassCont, confPassVal, confPassCont) {
    var isValid = false;

    //clear errors
    hrms.valid8r.clearerror(newPassCont);
    hrms.valid8r.clearerror(confPassCont);

    //if it's NOT valid  
    if (newPassVal == null || newPassVal.length < 1 || newPassVal == '' || confPassVal == null || confPassVal.length < 1 || confPassVal == '') {
    	hrms.valid8r.seterror(newPassCont, 'Required!');
    	hrms.valid8r.seterror(confPassCont, 'Required!');
        isValid = false;
    }
    else {
        //4 chars while testing
        if (newPassVal.length < 4 || confPassVal.length < 4) {
        	hrms.valid8r.seterror(newPassCont, 'Minimum of 4 characters required!');
        	hrms.valid8r.seterror(confPassCont, 'Minimum of 4 characters required!');
            isValid = false;
        } else {
            isValid = true;
        }
    }

    if (isValid === true) {
        //if it's valid  
        if (newPassVal === confPassVal) {
        	hrms.valid8r.clearerror(newPassCont);
        	hrms.valid8r.clearerror(confPassCont);
        } else {
        	hrms.valid8r.seterror(newPassCont, 'Passwords do not match!');
        	hrms.valid8r.seterror(confPassCont, 'Passwords do not match!');
            isValid = false;
        }
    }

    return isValid;
}



