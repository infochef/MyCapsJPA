package com.jpa.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import com.jpa.beans.TechnicalBugger;

public class Update {
	
	public static void main(String[] args) {
		
		EntityManagerFactory efm = Persistence.createEntityManagerFactory("myPersistanceUnit");
		EntityManager manager = efm.createEntityManager();
		manager.getTransaction().begin();
		
		TechnicalBugger bugger = manager.find(TechnicalBugger.class, 101);
		
		bugger.setName("Somnath");
		bugger.setSalary(29000);
		
		System.out.println(bugger);
		manager.getTransaction().commit();
		
       		
		
	}

}
