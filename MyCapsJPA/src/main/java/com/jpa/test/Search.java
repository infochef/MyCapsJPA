package com.jpa.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import com.jpa.beans.TechnicalBugger;

public class Search {
 
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("myPersistanceUnit");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		TechnicalBugger bugger = manager.find(TechnicalBugger.class, 102);
		
		System.out.println(bugger);
		manager.getTransaction().commit();
	}
}
