package com.hrms.daoImpl;


import java.util.List;







import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import com.hrms.bDhelper.DBhelper;
import com.hrms.dao.PayrollDao;
import com.hrms.model.Payroll;

public class PayrollImpl implements PayrollDao
{
	EntityManagerFactory emf = null;
	EntityManager em = null;
	@Override
	public Long savePayroll(Payroll payroll) {
		emf=DBhelper.provideEntity();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(payroll);
		em.getTransaction().commit();
		em.close();	
		return payroll.getPayrollId();
	}

	@Override
	public Payroll getPayroll(String payrollName) {
		emf=DBhelper.provideEntity();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		Payroll payroll=em.find(Payroll.class,payrollName);
		return payroll;
	}

	@Override
	public Long updatePayroll(Payroll payroll) {
		emf=DBhelper.provideEntity();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		//book=em.find(Book.class,id);
		em.persist(payroll);
		em.getTransaction().commit();
		em.close();
		return payroll.getPayrollId();
	}

	@Override
	public List<Payroll> getPayrollList() {
		emf = DBhelper.provideEntity();
		em = emf.createEntityManager();
		TypedQuery<Payroll> query = em.createQuery("from Payroll dep ",Payroll.class);
		List<Payroll> results = query.getResultList();
		return results;
	}

}


