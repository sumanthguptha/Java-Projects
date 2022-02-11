package com.zensar.training.bean;

public class Employee {
	
	double basicSalary;
	
	public double computeNetSalary() {
		System.out.println("Manager Compute Net Salary");
		return this.basicSalary+this.basicSalary*0.40;
	}
}




//OVERRIDING CONCEPT
//static methods are also not overriden but can redefining is possible so that it is not considered as overriden
// final methods cannot overriden only instance methods are override
// private methods can't overridden
// overriding the access should not be increased 
//constructors are also not possible in overriden concepts
