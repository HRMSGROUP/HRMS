package com.hrms.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tblApplicant")
public class Applicant {
	@Id
	@Column(name="Applicant_Id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long appid;
	
	@Column(name="First_name")
	private String firstName;
	
	/*@Column(name="Middle_name")
	private String middleName;*/
	
	@Column(name="Last_name")
	private String lastName;
	
	@Column(name="ID_number")
	private String identityNumber;
	
/*	@Column(name="Birth_date")
	private String dateOfBirth;
	
	@Column(name="Gender")
	private String gender;*/
	
	@Column(name="Title")
	private String title;
	
	/*@Column(name="Race")
	private String race;*/
	
	@Column(name="Email")
	private String email;
	
/*	@Column(name="Address")
	private String address;
	
	@Column(name="Code")
	private String code;
	
	@Column(name="Province")
	private String province;
	
	@Column(name="Country")
	private String country;*/
	
	@Column(name="Contact")
	private String contactNumber;
	
	@Column(name="Institution")
	private String institution;
	
	@Column(name="Qualification")
	private String qualification;
	
/*	@Column(name="Year")
	private String dateCompleted;*/
	
	@Column(name="Position")
	private String position;
	
	@Column(name="Letter")
	private String coverLetter;
	
	/*@Column(name="Date_Applied_By")
	private Date applayingDate;*/
	
	/*@Column(name="CV")
	private byte[] cv;*/
	
	/*@Column(name="Matric_Results")
	private byte matricResults;
	
	@Column(name="Academic_Record")
	private byte academicRecord;*/

	public Applicant() {
		super();
	}
	
	public Applicant(String firstName, String lastName, String identityNumber,
			String title, String email, String contactNumber, String institution,
			String qualification, String position, String coverLetter) {
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
		this.coverLetter = coverLetter;
	}

	public Long getAppid() {
		return appid;
	}

	public void setAppid(Long appid) {
		this.appid = appid;
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

	public String getCoverLetter() {
		return coverLetter;
	}

	public void setCoverLetter(String coverLetter) {
		this.coverLetter = coverLetter;
	}		
	/*public byte[] getCv() {
		return cv;
	}

	public void setCv(byte[] cv) {
		this.cv = cv;
	}*/

	/*public byte getMatricResults() {
		return matricResults;
	}

	public void setMatricResults(byte matricResults) {
		this.matricResults = matricResults;
	}

	public byte getAcademicRecord() {
		return academicRecord;
	}

	public void setAcademicRecord(byte academicRecord) {
		this.academicRecord = academicRecord;
	}*/		
 	
}
