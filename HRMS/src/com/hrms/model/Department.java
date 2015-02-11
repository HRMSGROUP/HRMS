package com.hrms.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name ="tblDepartment")
@XmlRootElement
public class Department implements Serializable
{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long departmentId;
	
	
	@Column(name = "tblDepartment_DepartmentName")
	private String departmentName;
	
	@Column(name = "tblDepartment_DepartmentBuilding")
	private String departmentBuilding;
	
	@Column(name = "tblDepartment_DepartmentLocation")
	private String departmentLocation;
	
/*	@OneToMany(mappedBy="department", cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private Set<Job> jobs;*/
	
	public Department() {
		
	}

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentBuilding() {
		return departmentBuilding;
	}

	public void setDepartmentBuilding(String departmentBuilding) {
		this.departmentBuilding = departmentBuilding;
	}


	public String getDepartmentLocation() {
		return departmentLocation;
	}

	public void setDepartmentLocation(String departmentLocation) {
		this.departmentLocation = departmentLocation;
	}

/*	public Set<Job> getJobs() {
		return jobs;
	}

	public void setJobs(Set<Job> jobs) {
		this.jobs = jobs;
	}*/

	public Department(Long departmentId, String departmentName,
			String departmentBuilding, String departmentTitle,
			String departmentLocation) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.departmentBuilding = departmentBuilding;
		this.departmentLocation = departmentLocation;
	}

	
}
