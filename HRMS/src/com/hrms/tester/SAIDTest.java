package com.hrms.tester;

import com.xml_fx.services.SAIDValidator.SAIDValidatorSoapProxy;
import com.xml_fx.services.SAIDValidator.said_xsd.SaidType;

public class SAIDTest {

	 /**
	  ***Testing id validation with soup
	  */
	 public static void main(String[] args) {
	  
	  SAIDValidatorSoapProxy proxy = new SAIDValidatorSoapProxy();
	  
	  String id = "9203186164083";
	        
	  try{
	   SaidType saidType = proxy.validateIdString("", id);
	   if(saidType.isValid()==true){
	    System.out.println("user valid");
	   }
	   else{
	    System.out.println("This person is a ghost...");
	   }
	  }
	  catch(Exception ex){
	   
	   ex.printStackTrace();
	  }
	 }	
	
}
