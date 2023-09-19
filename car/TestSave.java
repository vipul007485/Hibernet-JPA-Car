package com.jsp.car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vipul");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
	    Car car = new Car();
	    
//	    car.setId(1);
	    car.setName("thar");
	    car.setBrand("mahindra");
	    car.setPrice(2100000.0);
	   
	    entityTransaction.begin();
	    entityManager.persist(car);
	    entityTransaction.commit();
		
	}

}
