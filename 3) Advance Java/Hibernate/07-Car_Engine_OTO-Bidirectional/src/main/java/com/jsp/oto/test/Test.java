package com.jsp.oto.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.oto.controller.Controller;
import com.jsp.oto.model.Car;
import com.jsp.oto.model.Engine;

public class Test {
 public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgadmin");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	Car car = new Car();
	Engine engine = new Engine();
	Controller controller = new Controller();
//	car.setId(1);
//	car.setCar_name("BMW");
//	car.setChasis("343sd");
//	car.setCost(1500000);
//	
//	Engine engine = new Engine();
//	engine.setId(1);
//	engine.setNo_of_cylinder(2);
//	engine.setCc(343);
//	
//	car.setEng(engine);
	Car find_car = controller.find_car(car, 1);
	Engine find_engine = controller.find_engine(engine,1);
	if(find_car!=null) {
		   Engine eng = find_car.getEng();
		   Car car2 = find_engine.getCar();
			entityTransaction.begin();
			entityManager.remove(eng);
			entityManager.remove(find_car);
			entityTransaction.commit();
			
		
	}
	
	
}
}
