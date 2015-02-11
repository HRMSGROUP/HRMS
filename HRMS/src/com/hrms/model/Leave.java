package com.hrms.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
@Entity
@Table(name="tblLeave")

@NamedQueries
({
	@NamedQuery(name="findLeaveById",query="from Leave  where leaveId =:leaveId"),
	@NamedQuery(name="getLeaveList", query="from Leave")
	
})
@XmlRootElement
public class Leave implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	private Long leaveId;
	
	@Column(name="tblLeave_NoOfDays")
	private int noOfDays;
	
	@Column(name="tblLeave_NoOfTakenDays")
	private int noOfTakenDays;
	
	@Column(name="tblLeave_NoOfAvailableDays")
	private int noOfAvailableDays;
	
	@Column(name = "tblLeave_DepartmentManagerApproval")
	private String departmentManagerApproval;
	
	@Column(name = "tblLeave_HrManagerApprovalStatus")
	private String hrManagerApprovalStatus;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date leaveStartDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date leaveEndDate;
	
	@ManyToOne
	@JoinColumn(name="empNumber")
	private Employee employee;
	
	public Leave() {
	
	}



	public Long getLeaveId() {
		return leaveId;
	}



	public void setLeaveId(Long leaveId) {
		this.leaveId = leaveId;
	}



	public int getNoOfDays() {
		return noOfDays;
	}



	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}



	public int getNoOfTakenDays() {
		return noOfTakenDays;
	}



	public void setNoOfTakenDays(int noOfTakenDays) {
		this.noOfTakenDays = noOfTakenDays;
	}



	public int getNoOfAvailableDays() {
		return noOfAvailableDays;
	}



	public void setNoOfAvailableDays(int noOfAvailableDays) {
		this.noOfAvailableDays = noOfAvailableDays;
	}



	public Employee getEmployee() {
		return employee;
	}



	public void setEmployee(Employee employee) {
		this.employee = employee;
	}



	public String getDepartmentManagerApproval() {
		return departmentManagerApproval;
	}



	public void setDepartmentManagerApproval(String departmentManagerApproval) {
		this.departmentManagerApproval = departmentManagerApproval;
	}



	public String getHrManagerApprovalStatus() {
		return hrManagerApprovalStatus;
	}



	public void setHrManagerApprovalStatus(String hrManagerApprovalStatus) {
		this.hrManagerApprovalStatus = hrManagerApprovalStatus;
	}



	public Date getLeaveStartDate() {
		return leaveStartDate;
	}



	public void setLeaveStartDate(Date leaveStartDate) {
		this.leaveStartDate = leaveStartDate;
	}



	public Date getLeaveEndDate() {
		return leaveEndDate;
	}



	public void setLeaveEndDate(Date leaveEndDate) {
		this.leaveEndDate = leaveEndDate;
	}



	public Leave(int noOfDays, int noOfTakenDays, int noOfAvailableDays) {
		this.noOfDays = noOfDays;
		this.noOfTakenDays = noOfTakenDays;
		this.noOfAvailableDays = noOfAvailableDays;
	}

	
	
	
}
