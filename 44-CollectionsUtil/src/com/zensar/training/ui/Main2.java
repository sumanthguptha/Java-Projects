package com.zensar.training.ui;

import java.util.Collections;
import java.util.List;

import com.zensar.training.bean.CollectionFactory;
import com.zensar.training.bean.Employee;
import com.zensar.training.bean.comparator.EmployeeNameComparator;

public class Main2 {

	public static void main(String[] args) {
		List<Employee> allEmp=CollectionFactory.getEmployeeList();
		System.out.println(allEmp);
		
		Collections.sort(allEmp);
		System.out.println(allEmp);
		
		System.out.println(Collections.max(allEmp));
		System.out.println(Collections.min(allEmp));
		System.out.println(Collections.binarySearch(allEmp,new Employee(3004)));
		
		EmployeeNameComparator enc=new EmployeeNameComparator();
		Collections.sort(allEmp,enc);
		System.out.println(allEmp);
		System.out.println(Collections.binarySearch(allEmp, new Employee(3004)));
		System.out.println(Collections.max(allEmp,enc));
		System.out.println(Collections.min(allEmp,enc));

		

	}

}
