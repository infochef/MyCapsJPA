package com.jpa.one_to_one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestOnetoOne {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("myPersistanceUnit");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		User us = new User();
		us.setUid(1001);
		us.setUname("Abdul");
		us.setPassword("qwerty");
		
		Passport p1 = new Passport();
		p1.setPid(101);
		p1.setPname("Abdul");
		p1.setUs(us);
		
		manager.persist(p1);
		manager.getTransaction().commit();
		manager.close();
		factory.close();
			
		
		
	}
}