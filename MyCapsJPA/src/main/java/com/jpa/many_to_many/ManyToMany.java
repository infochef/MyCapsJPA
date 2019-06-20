package com.jpa.many_to_many;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ManyToMany {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("myPersistanceUnit");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		StudentList s1 = new StudentList();
		s1.setSname("Shivani");
		
		StudentList s2 = new StudentList();
		s2.setSname("prakash");
		
		StudentList s3 = new StudentList();
		s3.setSname("Pinki");
		
		Set<StudentList>student = new HashSet<StudentList>();
		student.add(s1);
		student.add(s2);
		student.add(s3);
		
		TrainerList t1 = new TrainerList();
		t1.setTname("Suyash");
		
		TrainerList t2 = new TrainerList();
		t2.setTname("karthik");
		
		TrainerList t3 = new TrainerList();
		t3.setTname("Nagesh DJ");
		
		Set<TrainerList>trainer = new HashSet<TrainerList>();
		trainer.add(t1);
		trainer.add(t2);
		trainer.add(t3);
		
		t1.setStudent(student);
		t2.setStudent(student);
		t3.setStudent(student);
		
		s1.setTrainer(trainer);
		s2.setTrainer(trainer);
		s3.setTrainer(trainer);
		
		
		manager.persist(s1);
		manager.persist(s2);
		manager.persist(s3);

		manager.getTransaction().commit();
		manager.close();
		factory.close();
			
		
	} 
	
}