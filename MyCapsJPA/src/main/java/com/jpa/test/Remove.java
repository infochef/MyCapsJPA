package com.jpa.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import com.jpa.beans.TechnicalBugger;

public class Remove {

	public static void main(String[] args) {
		
		EntityManagerFactory ef = Persistence.createEntityManagerFactory("myPersistanceUnit");
		EntityManager manager = ef.createEntityManager();
		manager.getTransaction().begin();
		
		TechnicalBugger rs = manager.find(TechnicalBugger.class, 102);
		
		manager.remove(rs);
		
		manager.getTransaction().commit();
		
		
	}
}
