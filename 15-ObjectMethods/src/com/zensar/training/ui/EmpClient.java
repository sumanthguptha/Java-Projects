package com.zensar.training.ui;

import com.zensar.training.bean.Employee;

public class EmpClient {

	public static void main(String[] args) {
		Employee employee=new Employee(101,"Rahul",10000.00);
		
		Employee employee2=new Employee(102,"Mohan",20000.00);
		
		System.out.println(employee.equals(employee2));
	
	}

}
