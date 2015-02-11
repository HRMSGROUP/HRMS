package com.hrms.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import com.hrms.bDhelper.DBhelper;
import com.hrms.dao.ApplicantDao;
import com.hrms.model.Applicant;

public class ApplicantDaoImpl implements ApplicantDao{
	
	EntityManagerFactory emf = null;
	EntityManager em = null;

	@Override
	public Applicant saveApplicant(Applicant applicant) {
		emf=DBhelper.provideEntity();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(applicant);
		em.getTransaction().commit();
		em.close();
		return applicant;	
		
	}

	@Override
	public void deleteApplicant(Long appid) {
		emf=DBhelper.provideEntity();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		Applicant applicant=em.find(Applicant.class,appid);
		em.remove(applicant);
		em.getTransaction().commit();
		em.close();	
		
	}

	@Override
	public Applicant updateApplicant(Applicant applicant){
		
		return applicant;				
	}

	@Override
	public List<Applicant> listApplicant() {
		emf = DBhelper.provideEntity();
	     em = emf.createEntityManager();
	     TypedQuery<Applicant> query = em.createQuery("SELECT applicant from Applicant applicant", Applicant.class);
		 List<Applicant> list = query.getResultList();
	   return list;		
	}

}
