package com.zensar.training.bean;

public class Employee {
	private double salary;

	public Employee(double salary) {
		super();
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double computeTotalSalary() {
		return this.salary;
	}
	
}
