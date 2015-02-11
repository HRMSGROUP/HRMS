package com.hrms.tester;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.hrms.model.Employee;


public class EmployeeTester {

	public static void main(String[] args) {
		//creates a persistence unit by providing the same unique name which we provide for persistence-unit in persistent.xml file
	   	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "persistence" );
	   	//entitymanagerfactory object will create the entitymanger instance by using createEntityManager () method
	   	EntityManager entitymanager = emfactory.createEntityManager( );
	   	entitymanager.getTransaction( ).begin( );
	   	
		Employee emp = new Employee("Thabiso","Phogole", "9903196164084", "MR", "thabiso@gmail.com", "0721169640" ,"University of Limpopo", "BSc Computer Science", "Java Developer", "12345", "Admin");
	   	
	  	entitymanager.persist(emp);
		entitymanager.getTransaction( ).commit( );
		entitymanager.close( );
	}

}
