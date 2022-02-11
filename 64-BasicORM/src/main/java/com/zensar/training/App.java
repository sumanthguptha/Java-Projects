package com.zensar.training;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.zensar.training.bean.Employee;
import com.zensar.training.bean.Gender;
import com.zensar.training.util.HibernateUtil;

public class App {
	static void insert() {
		Employee employee = new Employee(1, "Sumanth", LocalDate.of(1999, 3, 01), 3000, Gender.MALE);
		Employee employee1 = new Employee(2, "Harini", LocalDate.of(1959, 5, 01), 3000, Gender.FEMALE);
		Employee employee2 = new Employee(1, "Sai", LocalDate.of(1999, 4, 02), 3000, Gender.MALE);
		Employee employee3 = new Employee(1, "Sneha", LocalDate.of(1998, 7, 01), 3000, Gender.FEMALE);

		HibernateUtil.init();

		Session session = HibernateUtil.getSession();

		Transaction tx = session.beginTransaction();

		session.save(employee);

		tx.commit();

		HibernateUtil.cleanUp();
	}

	static void read() {
		HibernateUtil.init();

		Session session = HibernateUtil.getSession();
		Employee employee = session.load(Employee.class, 4);
		System.out.println(employee);

		HibernateUtil.cleanUp();
	}

	static void readAll() {
		HibernateUtil.init();

		Session session = HibernateUtil.getSession();
		String str = "from Employee";

		Query query = session.createQuery(str);
		List<Employee> allEmployees = query.list();
		System.out.println(allEmployees);

		HibernateUtil.cleanUp();
	}

	static void update() {
		HibernateUtil.init();

		Session session = HibernateUtil.getSession();
		Employee employee = session.load(Employee.class, 15);
		//employee.setName(employee.getName().toUpperCase());
		
		employee.setGender(Gender.FEMALE);
		employee.setName("Harinin");
		
		employee.setBasicSalary(26000);

		Transaction tx = session.beginTransaction();
		session.update(employee);
		tx.commit();

		HibernateUtil.cleanUp();

	}

	static void delete() {
		HibernateUtil.init();

		Session session = HibernateUtil.getSession();

		Employee employee = session.load(Employee.class, 15);

		Transaction tx = session.beginTransaction();
		session.delete(employee);
		tx.commit();
		HibernateUtil.cleanUp();

	}

	public static void main(String[] args) {
		// insert();
		// read();
		// readAll();
		//update();
		 delete();
	}
}
