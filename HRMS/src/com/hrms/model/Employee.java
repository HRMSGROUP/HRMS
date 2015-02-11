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
@Table(name="tblEmployee")
@XmlRootElement
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long empNumber;
	 
	@Column(name="First_name")
	private String firstName;
	 	 
	@Column(name="Last_name")
	private String lastName;
	 
	@Column(name="ID_number")
	private String identityNumber;
	 	 
	@Column(name="Title")
	private String title;
	 
	@Column(name="Email")
	private String email;
	 
	@Column(name="Contact")
	private String contactNumber;
	 
	@Column(name="Institution")
	private String institution;
	 
	@Column(name="Qualification")
	private String qualification;
	 
	@Column(name="Position")
	private String position;
	
	@Column(name = "Password")
	private String password;

	@Column(name = "Employee_Type")
	private String empType;

	

	public Employee(String firstName, String lastName, String identityNumber,
			String title, String email, String contactNumber,
			String institution, String qualification, String position,
			String password, String empType) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.identityNumber = identityNumber;
		this.title = title;
		this.email = email;
		this.contactNumber = contactNumber;
		this.institution = institution;
		this.qualification = qualification;
		this.position = position;
		this.password = password;
		this.empType = empType;
	}

	
	public Employee() {
		super();
	}


	public String getEmpType() {
		return empType;
	}


	public void setEmpType(String empType) {
		this.empType = empType;
	}


	public Long getEmpNumber() {
		return empNumber;
	}

	public void setEmpNumber(Long empNumber) {
		this.empNumber = empNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getInstitution() {
		return institution;
	}

	public void setInstitution(String institution) {
		this.institution = institution;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	


}
