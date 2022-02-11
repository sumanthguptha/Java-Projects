package com.zensar.training.bean;

public class Employee {
	private String name;
	private double salary;
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double computeAllowance() {
		return this.salary*0.35;
	}
	public double computeNetsalary() {
		return this.salary+this.computeAllowance();	
		}

}
