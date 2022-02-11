package com.zensar.training;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import com.zensar.training.bean.Employee;
import com.zensar.training.util.JPAUtil;

public class Main1 {
	
	static void insert() {
		EntityManager em=JPAUtil.createEntityManager("JPAIntro");
		Employee employee=new Employee("Chinna", 'A', 20000.00, LocalDate.of(2022, 04, 25));
		em.getTransaction().begin();
		em.persist(employee);
		em.getTransaction().commit();
		JPAUtil.shutDown();
		
		
	}
	
	static void load() {
		EntityManager em=JPAUtil.createEntityManager("JPAIntro");
		Employee employee=em.find(Employee.class, 1);
		System.out.println(employee);
		JPAUtil.shutDown();

	}
	static void update() {
		EntityManager em=JPAUtil.createEntityManager("JPAIntro");
		
		Employee employee=em.find(Employee.class, 5);
		
		//System.out.println(contact);
		employee.setName(employee.getName().toUpperCase());
		em.getTransaction().begin();
		em.merge(employee);
		em.getTransaction().commit();
		JPAUtil.shutDown();

	}
	
	static void delete() {
		EntityManager em=JPAUtil.createEntityManager("JPAIntro");

		
		Employee contact=em.find(Employee.class, 1);
		
		//System.out.println(contact);
		contact.setName(contact.getName().toUpperCase());
		em.getTransaction().begin();
		em.remove(contact);
		em.getTransaction().commit();
		
		JPAUtil.shutDown();

	}
		
	public static void main(String[] args) {
		//insert();
		//load();
		update();
		//delete();
	}

}
