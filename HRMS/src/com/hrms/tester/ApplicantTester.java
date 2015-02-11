package com.hrms.tester;

import java.io.File;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.hrms.model.Applicant;


public class ApplicantTester {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
		EntityManager em = emf.createEntityManager();
		
		Applicant applicant=new Applicant();
		
		File file = new File("C:/Users/Thakahnis/Documents/Presentation1.pptx");
		//byte bFile = (byte) file.length();
		byte[] bFile = new byte[(int)file.length()];	
		
		applicant.setFirstName("maanda");
		applicant.setLastName("Thavhanyedza");
		//applicant.setMiddleName("Cedrick");
		applicant.setTitle("mr");
		applicant.setIdentityNumber("9201115826088");
		//applicant.setDateOfBirth("2012/12/12");
		//applicant.setGender("male");		
		//applicant.setRace("African");
		applicant.setEmail("thavhanyedza.maanda@gmail.com");
		//applicant.setAddress("P.O Box");
		//applicant.setCode("0950");
		//applicant.setProvince("Limpopo");
		//applicant.setCountry("South Africa");
		applicant.setContactNumber("0721657807");
		applicant.setInstitution("CapaCiTi");
		applicant.setQualification("Degree");
		//applicant.setDateCompleted("2014");
		applicant.setPosition("Junior");
		applicant.setCoverLetter("cover letter");
		//applicant.setCv(bFile);	
		applicant.setInstitution("Uwc");
		//applicant.setApplayingDate(new Date());
		
		//applicant.setMatricResults(bFile);	
		//applicant.setAcademicRecord(bFile);
		
		em.getTransaction().begin();
		
		em.persist(applicant);
		
		em.getTransaction().commit();
		
		/*long Id=1;
		Applicant app=em.find(Applicant.class, Id);
		app.getCv().toString();
		System.out.println(app.getCv());*/

	}

}
