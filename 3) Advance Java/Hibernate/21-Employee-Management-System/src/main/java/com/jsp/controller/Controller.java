package com.jsp.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.jsp.model.Department;
import com.jsp.model.Employee;
import com.jsp.model.Project;

public class Controller {


   static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgadmin");
   static EntityManager entityManager = entityManagerFactory.createEntityManager();
   static EntityTransaction entityTransaction = entityManager.getTransaction();
   
   public static boolean addEmployee(Employee employee) {
	   if(employee!=null) {
		   entityTransaction.begin();
		   entityManager.persist(employee);
		   entityTransaction.commit();
         return true;
	   }
	   	   return false;
   }
	
   public static boolean addDepartment(Department department) {
	   if(department!=null) {
		   entityTransaction.begin();
		   entityManager.persist(department);
		   entityTransaction.commit();
         return true;
	   }
	   	   return false;
   }
   
   public static boolean addProject(Project project) {
	   if(project!=null) {
		   entityTransaction.begin();
		   entityManager.persist(project);
		   entityTransaction.commit();
         return true;
	   }
	   	   return false;
   }
   
   public static Employee findEmployee(Employee employee,int key) {
	   return entityManager.find(Employee.class, key);
   }
   
   public static Department findDepartment(Department deparment,int key) {
	   return entityManager.find(Department.class, key);
   }
   
   public static Project findProject(Project project,int key) {
	   return entityManager.find(Project.class, key);
   }
   
   public static List<Employee> fetchAllEmployee(){
	   String jpql = "SELECT e FROM Employee e";
		TypedQuery<Employee> createNamedQuery = entityManager.createQuery(jpql, Employee.class);
		List<Employee> resultList = createNamedQuery.getResultList();
		return resultList;
   }
   
   public static List<Department> fetchAllDepartment(){
	   String jpql = "SELECT d FROM Department d";
		TypedQuery<Department> createNamedQuery = entityManager.createQuery(jpql, Department.class);
		List<Department> resultList = createNamedQuery.getResultList();
		return resultList;
   }
   
   public static List<Project> fetchAllProject(){
	   String jpql = "SELECT e FROM Project e";
		TypedQuery<Project> createNamedQuery = entityManager.createQuery(jpql, Project.class);
		List<Project> resultList = createNamedQuery.getResultList();
		return resultList;
   }
   
   public static boolean deleteEmployee(Employee employee,int key) {
	   if(employee!=null) {
		   Employee findEmployee = findEmployee(employee, key);
		   if(findEmployee!=null) {
			   entityTransaction.begin();
			   entityManager.remove(findEmployee);
			   entityTransaction.commit();
			   return true;
		   }else {
			   System.out.println("Employee does not exist");
			   return false;
		   }
	   }
	   return false;
   }
   
   public static boolean deleteDepartment(Department department,int key) {
	   if(department!=null) {
		   Department findDepartment = findDepartment(department, key);
		   if(findDepartment!=null) {
			   entityTransaction.begin();
			   entityManager.remove(findDepartment);
			   entityTransaction.commit();
		   }else {
			   System.out.println("Employee does not exist");
		   }
	   }
	   return false;
   }

   
   public static boolean deleteProject(Project project,int key) {
	   if(project!=null) {
		   Project findProject = findProject(project, key);
		   if(findProject!=null) {
			   entityTransaction.begin();
			   entityManager.remove(findProject);
			   entityTransaction.commit();
		   }else {
			   System.out.println("Employee does not exist");
		   }
	   }
	   return false;
   }
   
   public static boolean updateEmployeeDetail(int e_id ,Object update,Employee employee,int ch3) {
	   Employee findEmployee = findEmployee(employee,e_id);
	   if(findEmployee!=null) {
		   entityTransaction.begin();
		   if(ch3==1) {
			   findEmployee.setName((String)update);
			   entityManager.merge(findEmployee);
			   entityTransaction.commit();
			   }else if(ch3==2) {
			   findEmployee.setPosition((String)update);;
			   entityManager.merge(findEmployee);
			   entityTransaction.commit();
		   }else if(ch3==3) {
			   findEmployee.setSalary((double)update);
			   entityManager.merge(findEmployee);
			   entityTransaction.commit();
		   }
		   return true;
		   
	   }else {
		   System.out.println("Employee does not exit");
		   return false;
	   }
   }
   
   public static boolean updateDepartment(Department department,String name,int key) {
	   Department findDepartment = findDepartment(department, key);
	   System.out.println(findDepartment.getId());
	   System.out.println(findDepartment.getName());
	   if(department!=null && findDepartment!=null) {
		   entityTransaction.begin();
		    findDepartment.setName(name);
		   entityManager.merge(findDepartment);
		   entityTransaction.commit();
		   return true;
	   }
	   return false;
   }
   
   public static boolean updateProjectDetail(int e_id ,Object update,Project project,int ch3) {
	   Project findProject = findProject(project,e_id);
	   if(findProject!=null) {
		   entityTransaction.begin();
		   if(ch3==1) {
			   findProject.setName((String)update);
			   entityManager.merge(findProject);
			   entityTransaction.commit();
			   }
		   else if(ch3==2) {
			   findProject.setDescription((String)update);
			   entityManager.merge(findProject);
			   entityTransaction.commit();
		   }
		   return true;
		   
	   }else {
		   System.out.println("Project does not exit");
		   return false;
	   }
   
   }
   
   public static boolean assignDepartment(int d_id,int e_id,Department department,Employee employee) {
	   Department findDepartment = findDepartment(department, d_id);
	   List<Employee> employee_list = findDepartment.getEmployee();
	   Employee findEmployee=findEmployee(employee, e_id);
	   if(employee_list!=null && findEmployee!=null && findDepartment!=null) {
		   findEmployee.setDepartment(findDepartment);
		   employee_list.add(findEmployee);
		   findDepartment.setEmployee(employee_list);
		   entityTransaction.begin();
		   entityManager.persist(findEmployee);
		   entityManager.persist(findDepartment);
		   entityTransaction.commit();
		   return true;
	   }
	   return false;
   }
   
   public static boolean assignProject(Employee employee ,int e_id,int d_id,int p_id,Project project) {
	   Employee findEmployee = findEmployee(employee, e_id);
	   Department department = findEmployee.getDepartment();
	   int check_department = department.getId();
	   Project findProject = findProject(project, p_id);
	   if(findProject!=null && (check_department==d_id) && findEmployee!=null) {
		   List<Employee> employee2 = findProject.getEmployee();
		   List<Project> project2 = findEmployee.getProject();
		   employee2.add(findEmployee);
		   project2.add(findProject);
		   findProject.setEmployee(employee2);
		   findEmployee.setProject(project2);
		   entityTransaction.begin();
		   entityManager.persist(findEmployee);
		   entityManager.persist(findProject);
		   entityTransaction.commit();
		   return true;
	   }
	   
	   return false;
   }

}














