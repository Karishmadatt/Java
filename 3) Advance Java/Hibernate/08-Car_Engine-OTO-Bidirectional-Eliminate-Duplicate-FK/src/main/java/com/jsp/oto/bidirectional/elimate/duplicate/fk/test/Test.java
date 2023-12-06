package com.jsp.oto.bidirectional.elimate.duplicate.fk.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.oto.bidirectional.eliminate.duplicate.fk.model.Car;
import com.jsp.oto.bidirectional.eliminate.duplicate.fk.model.Engine;



public class Test {
 public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgadmin");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	
//	Controller controller = new Controller();
	Car car = new Car();
//	car.setId(2);
//	car.setCar_name("Thar");
//	car.setChasis("343sd");
//	car.setCost(1500000);
//	
//	Engine engine = new Engine();
//	engine.setId(2);
//	engine.setNo_of_cylinder(2);
//	engine.setCc(343);
//	
//	car.setEng(engine);
//	engine.setCar(car);
//	Car find_car = controller.find_car(car, 1);
//	Engine find_engine = controller.find_engine(engine,1);
//	if(find_car!=null) {
//		   Engine eng = find_car.getEng();
//		   Car attachedEngine = entityManager.getReference(Car.class, 1);
//		   Engine eng2 = attachedEngine.getEng();
//		   Car car2 = find_engine.getCar();
//			entityTransaction.begin();
//			entityManager.persist(engine);
//			entityManager.persist(car);
//			entityTransaction.commit();
			
			Car find = entityManager.find(Car.class, 2);
//			System.out.println("car id: "+find.getId());
//			System.out.println("car name: "+find.getCar_name());
//			System.out.println("car chasis: "+find.getChasis());
//			System.out.println("car cost: "+find.getCost());
//			
//			Engine eng = find.getEng();
//			System.out.println("engine id: "+eng.getId());
//			System.out.println("engine cc: "+eng.getCc());
//			System.out.println("engine no of cylinder: "+eng.getNo_of_cylinder());
	       entityTransaction.begin();
	       entityManager.remove(find111);
	       entityTransaction.commit();
			
//			
//		
//	}
	
	
}
}
