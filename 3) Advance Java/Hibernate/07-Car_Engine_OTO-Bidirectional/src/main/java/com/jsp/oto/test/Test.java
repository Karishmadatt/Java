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
	Controller controller = new Controller();
//	car.setId(2);
//	car.setCar_name("Thar");
//	car.setChasis("343sd");
//	car.setCost(1500000);
//	
	Engine engine = new Engine();
//	engine.setId(2);
//	engine.setNo_of_cylinder(2);
//	engine.setCc(343);
//	
//	car.setEng(engine);
//	engine.setCar(car);
	Car find_car = controller.find_car(car, 1);
//	Engine find_engine = controller.find_engine(engine,1);
	if(find_car!=null) {
//		   Engine eng = find_car.getEng();
		   Car attachedEngine = entityManager.getReference(Car.class, 1);
		   Engine eng2 = attachedEngine.getEng();
//		   Car car2 = find_engine.getCar();
			entityTransaction.begin();
			entityManager.remove(eng2);
			entityManager.remove(attachedEngine);
			entityTransaction.commit();
//			
//		
	}
	
	
}
}
