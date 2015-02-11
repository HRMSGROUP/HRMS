package com.hrms.tester;

import com.hrms.daoImpl.DepartmentDaoIpml;
import com.hrms.daoImpl.PayrollImpl;
import com.hrms.model.Department;
import com.hrms.model.Payroll;

public class TesterClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DepartmentDaoIpml impl = new DepartmentDaoIpml();
		Department department = new Department();
		Payroll pay = new Payroll("test", "test3");
		PayrollImpl paye = new PayrollImpl();
		
		long ass = paye.savePayroll(pay);
		if(ass<0){
			System.out.println("payroll saved...");
		}
		
		department.setDepartmentBuilding("BHP Billiton");
		department.setDepartmentLocation("CUT Bloemfontein");
		department.setDepartmentName("Information Communications & Technology ");
		
		Long id = impl.saveDepartment(department);
		if(id>0){
			System.out.println("done..");
		}
	}

}
