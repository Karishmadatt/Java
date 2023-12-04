package com.jsp.oto.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.oto.model.Car;
import com.jsp.oto.model.Engine;

public class Controller {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgadmin");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
    
	public boolean insert_car_and_engine(Car car,Engine engine) {
		if(car!=null && engine!=null) {
			entityTransaction.begin();
			entityManager.persist(car);
			entityManager.persist(engine);
			entityTransaction.commit();
			return true;
		}
		return false;
	}
	public Car find_car(Car car,int car_id) {
		return entityManager.find(Car.class, car_id);
	}
	public Engine find_engine(Engine engine,int engine_id) {
		return entityManager.find(Engine.class, engine_id);
	}
   

}
