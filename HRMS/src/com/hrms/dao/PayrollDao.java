package com.hrms.dao;

import java.util.List;

import com.hrms.model.Payroll;

public interface PayrollDao {

	Long savePayroll(Payroll payroll);
	Payroll getPayroll(String payrollName);
	Long updatePayroll(Payroll payroll);
	List<Payroll> getPayrollList();
}
