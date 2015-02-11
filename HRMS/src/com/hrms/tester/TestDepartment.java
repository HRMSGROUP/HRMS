package com.hrms.tester;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.hrms.daoImpl.DepartmentDaoIpml;
import com.hrms.model.Department;



public class TestDepartment {

	DepartmentDaoIpml impl = new DepartmentDaoIpml();
	Department department = new Department();
	
	@Test
	public void test() {
		department.setDepartmentBuilding("BHP Billiton");
		department.setDepartmentLocation("CUT Bloemfontein");
		department.setDepartmentName("Information Communications & Technology ");
	
		
		Long id = impl.saveDepartment(department);
		assertEquals(id, id);
	
	}
	/*@Ignore
	@Test
	public void searchDepartment() 
	{
		department = impl.getDepartment(2L);
		System.out.println("ID\t\tName\t\tLocation");
		System.out.println(department.getDepartmentId()+"\t\t" +department.getDepartmentName()+"\t\t"+department.getDepartmentLocation());
	}*/
	@Ignore
	@Test
	public void departments()
	{
		List<Department> departments = impl.listDepartments();
		System.out.println("ID\t\tName\t\tLocation");
		for(Department department:departments)
		{
			System.out.println(department.getDepartmentId()+"\t\t" +department.getDepartmentName()+"\t\t"+department.getDepartmentLocation());
		}
	}
}
