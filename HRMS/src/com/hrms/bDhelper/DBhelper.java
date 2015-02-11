package com.hrms.bDhelper;


import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBhelper {
	
	private static final EntityManagerFactory emf = createEntity();

	private static EntityManagerFactory createEntity() {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("persistence");
		
		return emf;		
		
	}
	
	public static EntityManagerFactory provideEntity(){
		
		return emf;
		
	}

}
