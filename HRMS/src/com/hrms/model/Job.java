/*package com.hrms.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name="tblJobs")
@XmlRootElement(name = "Job")
@XmlAccessorType(XmlAccessType.FIELD)
public class Job implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)	
	private Long jobId;
	
	@Column(name="tblJob_Title")
	private String jobTitle;
	
	@Column(name="tblJob_Level")
	private String jobLevel;
	
	@Column(name="tblJob_Location")
	private String jobLocation;
	
	@Column(name="tblJob_Category")
	private String jobCategory;
	
	@Column(name="tblJob_NoOfPositions")//@Size(min=1,max=100)
	private Integer noOfPositions;
	
	@Column(name="tblJob_Type")
	private String jobType;
	
	@Column(name="tblJob_Description")
	private String jobDescription;
	
	@Column(name="tblJob_ProbationPeriod",nullable= true) 
	private Date probationPeriod;
	
	@Column(name="tblJob_StartDate")@Temporal(TemporalType.TIMESTAMP)
	private Date startDate;
	
	@Column(name="tblJob_EndDate", nullable=true)
	private Date endDate;
	
	@OneToMany(mappedBy="job",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private Set<Employee> employee;
	
	
	
	
	@ManyToOne
	@JoinColumn(name="departmentId")
	private Department department;
		
	public Long getJobId() {
		return jobId;
	}
	public void setJobId(Long jobId) {
		this.jobId = jobId;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getJobLevel() {
		return jobLevel;
	}
	public void setJobLevel(String jobLevel) {
		this.jobLevel = jobLevel;
	}
	public String getJobLocation() {
		return jobLocation;
	}
	public void setJobLocation(String jobLocation) {
		this.jobLocation = jobLocation;
	}
	public String getJobCategory() {
		return jobCategory;
	}
	public void setJobCategory(String jobCategory) {
		this.jobCategory = jobCategory;
	}
	public int getNoOfPositions() {
		return noOfPositions;
	}
	public void setNoOfPositions(int noOfPositions) {
		this.noOfPositions = noOfPositions;
	}
	public String getJobType() {
		return jobType;
	}
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}
	public String getJobDescription() {
		return jobDescription;
	}
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}
	public Date getProbationPeriod() {
		return probationPeriod;
	}
	public void setProbationPeriod(Date probationPeriod) {
		this.probationPeriod = probationPeriod;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Set<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(Set<Employee> employee) {
		this.employee = employee;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
		public Job() {
			
		}
			

}
*/