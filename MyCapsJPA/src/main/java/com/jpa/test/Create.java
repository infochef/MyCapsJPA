package com.jpa.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import com.jpa.beans.TechnicalBugger;

public class Create {

	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistanceUnit");
		EntityManager manager = emf.createEntityManager();
		manager.getTransaction().begin();
		
		TechnicalBugger bug = new TechnicalBugger();
		
		bug.setName("Shalini");
		bug.setSalary(51000);
		
		manager.persist(bug);
		manager.getTransaction().commit();
	}
}
