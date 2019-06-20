package com.jpa.one_to_many;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestOneToMany {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("myPersistanceUnit");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		EmpAccount a1 = new EmpAccount();
		a1.setBank_name("ICICI");
		
		EmpAccount a2 = new EmpAccount();
		a2.setBank_name("SBI");
		
		EmpAccount a3 = new EmpAccount();
		a3.setBank_name("Axis");
		
		List<EmpAccount> list = new ArrayList<EmpAccount>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		
		EmpDetails p1 = new EmpDetails();
		p1.setName("Rahul");
        p1.setAcc(list);
        
        manager.persist(p1);
        manager.getTransaction().commit();
        manager.close();
        factory.close();
      	
		
	}
}