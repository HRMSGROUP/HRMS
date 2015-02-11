package com.hrms.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import com.hrms.daoImpl.PayrollImpl;
import com.hrms.model.Payroll;


@Path("/payRollController")
public class PayRollService {
	
	PayrollImpl payImp=null;
	@Path("/savePayroll")	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response savePayroll(Payroll payroll)
	{  
		 
		payImp = new PayrollImpl();
	    payImp.savePayroll(payroll);
		return Response.status(200).build();
	}
	
	@GET 
	@Path("{payrollName}") 
	@Produces({ MediaType.APPLICATION_JSON}) 
    public Response findByPayrollName(@PathParam("payrollName") String payrollName){
		payImp = new PayrollImpl();
		
		Payroll payroll = payImp.getPayroll(payrollName);
		
			return Response.status(200).entity(payroll).build();
	}
	
	@Path(value = "/getPayrollList")
	@GET
	@Produces({ MediaType.APPLICATION_JSON})
	public String getPayrollList() throws JSONException{
	List<Payroll> payrollList=(List<Payroll>)payImp.getPayrollList();
	
	  
	  JSONArray jsonArray = new JSONArray();
	  
	  for (int i = 0; i < payrollList.size(); i++)
	    {
	      JSONObject payRoll = new JSONObject();
	      
	      payRoll.put("payrollId" ,payrollList.get(i).getPayrollId());
	      payRoll.put("payrollName" ,payrollList.get(i).getPayrollName());
	      jsonArray.put(payrollList);
	    }
	  return jsonArray.toString();
	}
	
	/*@GET
	@Path("/processPayments")
	@Produces(MediaType.APPLICATION_JSON)
	public String processPayments() throws JSONException
	{
		payImp = new PayrollImpl();
		List<Employee> employess = payImp.calculateSalaries();
		
		JSONArray jsonArray = new JSONArray();
		for(Employee emp:employess)
		{
			JSONObject empPayroll = new JSONObject();
			empPayroll.put("firstName", emp.getFirstName());
			empPayroll.put("lastName", emp.getLastName());
			empPayroll.put("salary", emp.getJob().getGrade().getSalary());
			empPayroll.put("uif", emp.getJob().getGrade().getUifDeduction());
			empPayroll.put("pension", emp.getJob().getGrade().getPensionDeduction());
			empPayroll.put("commissionAmount", emp.getJob().getGrade().getCommissionAmount());
			empPayroll.put("netSalary", emp.getJob().getGrade().getNetSalary());
			
			
			jsonArray.put(empPayroll);
		}
		return jsonArray.toString();
	}*/

}
