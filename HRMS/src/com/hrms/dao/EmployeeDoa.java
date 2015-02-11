package com.hrms.dao;

import java.util.List;

import com.hrms.model.Employee;

public interface EmployeeDoa {
	
public long registerEmployee(String firstName, String lastName, String identityNumber,
		String title, String email, String contactNumber,
		String institution, String qualification, String position,
		String password, String empType);

public boolean DeleteEmployee( Long empNumber );

public List<Employee> employeeList();

public boolean updateEmployee( Long empNumber,String firstName, String lastName, String identityNumber, String title, String email, String contactNumber,
		String institution, String qualification, String position, String empType ); 

public boolean SendMail(String email);

public boolean login(String email, String password, String empType);

}
