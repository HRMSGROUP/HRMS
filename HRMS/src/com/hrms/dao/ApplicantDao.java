package com.hrms.dao;

import java.util.List;

import com.hrms.model.Applicant;

public interface ApplicantDao {
	
	public Applicant saveApplicant (Applicant applicant);
	
	public void deleteApplicant (Long appid);
	
	public Applicant updateApplicant(Applicant applicant);
	
	public List<Applicant> listApplicant();	
	
}
