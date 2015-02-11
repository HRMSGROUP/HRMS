package com.hrms.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "tblPayroll")
@XmlRootElement
public class Payroll implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2081233512939414568L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long payrollId;

	//@Column(name ="tblPayroll_Name")
	private String payrollName;

	//@Column(name ="tblPayroll_Description")
	private String payrollDescription;
		

	/**
	 * 
	 */
	public Payroll() {
	}

	/**
	 * @param payrollId
	 * @param payrollName
	 * @param payrollDescription
	 */
	public Payroll(String payrollName, String payrollDescription) {
		this.payrollName = payrollName;
		this.payrollDescription = payrollDescription;
	}

	/**
	 * @return the payrollId
	 */
	public Long getPayrollId() {
		return payrollId;
	}

	/**
	 * @param payrollId the payrollId to set
	 */
	public void setPayrollId(Long payrollId) {
		this.payrollId = payrollId;
	}

	public String getPayrollName() {
		return payrollName;
	}

	public void setPayrollName(String payrollName) {
		this.payrollName = payrollName;
	}

	public String getPayrollDescription() {
		return payrollDescription;
	}

	public void setPayrollDescription(String payrollDescription) {
		this.payrollDescription = payrollDescription;
	}
	
	
}
