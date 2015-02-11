/*package com.hrs.model;

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
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;



@Entity
@Table(name ="tblTraining")

@NamedQueries
({
	@NamedQuery(name="findTrainingByName",query="from Training  where trainingnName =:trainingnName"),
	@NamedQuery(name="getTrainingList", query="from Training")
	
})
@XmlRootElement
public class Training implements Serializable
{
	
	*//**
	 * 
	 *//*
	private static final long serialVersionUID = 582253188354218089L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long trainingId;	
	
	@NotNull

	@Column(name = "tblTraining_TrainingName")
	private String trainingnName;
	
	@NotNull
	@Column(name = "tblTraining_TrainingLocation")
	private String trainingLocation;
	
	@NotNull

	@Column(name = "tblTraining_TrainingDescription")
	private String trainingDescription;
	
	@NotNull
	@Column(name="tblskillDetails")
	private String[] skillDetails;

		
	@Temporal(TemporalType.TIMESTAMP)
	private Date startingDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date endDate;
	
	
	@ManyToOne
	@JoinColumn(name="tblEmpNumber")
	private Employee employee;

	public Training() {
	}

	public Long getTrainingId() {
		return trainingId;
	}

	public void setTrainingId(Long trainingId) {
		this.trainingId = trainingId;
	}

	public String getTrainingLocation() {
		return trainingLocation;
	}

	public void setTrainingLocation(String trainingLocation) {
		this.trainingLocation = trainingLocation;
	}
	
	public Date getStartingDate() {
		return startingDate;
	}

	public void setStartingDate(Date startingDate) {
		this.startingDate = startingDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getTrainingnName() {
		return trainingnName;
	}

	public void setTrainingnName(String trainingnName) {
		this.trainingnName = trainingnName;
	}

	public String getTrainingDescription() {
		return trainingDescription;
	}

	public void setTrainingDescription(String trainingDescription) {
		this.trainingDescription = trainingDescription;
	}

	public String[] getSkillDetails() {
		return skillDetails;
	}

	public void setSkillDetails(String[] skillDetails) {
		this.skillDetails = skillDetails;
	}
	

}*/