package com.hrms.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import com.hrms.bDhelper.DBhelper;
import com.hrms.dao.DepartmentDao;
import com.hrms.model.Department;

public class DepartmentDaoIpml implements DepartmentDao {
	EntityManagerFactory emf = null;
	EntityManager em = null;
	@Override
	public Long saveDepartment(Department dep) {
		emf=DBhelper.provideEntity();
		em=emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(dep);
		em.getTransaction().commit();
		em.close();	
		return dep.getDepartmentId();
	}

	@Override
	public void deleteDepartment(long id) {
		emf=DBhelper.provideEntity();
		em=emf.createEntityManager();
		em.getTransaction().begin();
	    Department depa=em.find(Department.class,id);
		em.remove(depa);
		em.getTransaction().commit();
		em.close();	
	}

	@Override
	public Department searchAttachment(Department dep) {
		emf = DBhelper.provideEntity();
		em = emf.createEntityManager();
		em.getTransaction().begin();
		Department dept = em.find(Department.class,dep);
		return dept;
	}

	@Override
	public List<Department> listDepartments() {
		 emf = DBhelper.provideEntity();
			em = emf.createEntityManager();
			TypedQuery<Department> query = em.createQuery("from Department dep ",Department.class);
			List<Department> results = query.getResultList();
			return results;
		}
	}

