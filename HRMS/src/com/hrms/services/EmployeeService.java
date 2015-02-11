package com.hrms.services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.hrms.daoImpl.EmployeeDaoImpl;
import com.hrms.model.Employee;


@Path(value="/EmployeeService")
public class EmployeeService {

	@Path(value="/RegisterEmployees")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public String RegisterEmployee(Employee employee)
	{
		String firstName =employee.getFirstName();
		String identityNumber = employee.getIdentityNumber();
		String lastName = employee.getLastName();
		String title = employee.getTitle();
		String email = employee.getEmail();
		String password = employee.getPassword();
		String institution = employee.getInstitution();
		String qualification = employee.getQualification();
		String position = employee.getPosition();
		String contactNumber = employee.getContactNumber();
		String empType = employee.getEmpType();

		EmployeeDaoImpl employeeDao = new EmployeeDaoImpl();

		employeeDao.registerEmployee( firstName,  lastName,  identityNumber, title,  email,  contactNumber,
				 institution,  qualification,  position, password,  empType);		
		
		String registeredEmployee =  new Gson().toJson("success");
		
		return  registeredEmployee;
	}
	
	@Path(value="/ViewEmployees")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String employeeList() {
		
		EmployeeDaoImpl  employee = new EmployeeDaoImpl();

		List<Employee> employeeList = employee.employeeList();
		Gson gsonBooks=new Gson();

		String employees = gsonBooks.toJson(employeeList);
		 
		 return employees;	
	}
	
	@Path(value="/DeleteEmployees")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public boolean DeleteData(Employee employee)
	{
		Long empNumber = employee.getEmpNumber();
			
		EmployeeDaoImpl empDaoImpl = new EmployeeDaoImpl();
		boolean status=false;
		try {
				status = empDaoImpl.DeleteEmployee( empNumber );
					
			} 
			catch (Exception e) {
				e.printStackTrace();
			}		
			 return status;	
	}
	
	@Path(value="/UpdateEmployees")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public boolean  UpdateEmployee(Employee employee){
		Long empNumber = employee.getEmpNumber();
		String firstName = employee.getFirstName();
		String lastName = employee.getLastName();
		String email = employee.getEmail();
		String identityNumber = employee.getIdentityNumber();
		String title = employee.getTitle();
		String institution = employee.getInstitution();
		String qualification = employee.getQualification();
		String position = employee.getPosition();
		String contactNumber = employee.getContactNumber();
		String empType = employee.getEmpType();
		
		boolean status = false;
		EmployeeDaoImpl empDaoImpl = new EmployeeDaoImpl();
		try{
			status = empDaoImpl.updateEmployee(   empNumber, firstName,  lastName,  identityNumber,  title,  email,  contactNumber, institution,  qualification,  position,  empType );			 
		}
		catch(Exception e){
			e.printStackTrace();
		}	
		return status;
	}
	
	@Path(value="/email")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public boolean SendMail(Employee employee) {
		boolean status = false;
		String email = employee.getEmail();
		
		EmployeeDaoImpl empDaoImpl = new EmployeeDaoImpl();
		
		try {
			status = empDaoImpl.SendMail(email);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return status;
		
	}
	
	@POST
	@Path("/login")
	@Produces(MediaType.APPLICATION_JSON)
	public boolean  login(Employee employee){
		boolean status = false;
		String email = employee.getEmail();
		String password = employee.getPassword();
		String empType = employee.getEmpType();
		
		EmployeeDaoImpl empDaoImpl = new EmployeeDaoImpl();
		try {
				status = empDaoImpl.login(email, password, empType);
			
			} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return status;
		
	}
	
}

