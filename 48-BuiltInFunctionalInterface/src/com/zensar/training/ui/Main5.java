package com.zensar.training.ui;

import java.time.LocalDate;
import java.util.function.ToDoubleFunction;

import com.zensar.training.bean.Circle;
import com.zensar.training.bean.Employee;
import com.zensar.training.bean.Gender;
import com.zensar.training.bean.Student;

public class Main5 {

	public static void main(String[] args) {
		ToDoubleFunction<Student> function1;
		function1=(s)->s.getAverageMark();
		System.out.println(function1.applyAsDouble(new Student(121, "Sumanth", Gender.MALE, 35.0, "CSE")));
		

		ToDoubleFunction<Circle> function2;
		function2 = (c) -> c.computeArea();
		System.out.println(function2.applyAsDouble(new Circle(5))); ToDoubleFunction<Employee> function3;
		
		ToDoubleFunction<Employee> function4;
		function4 = (e) -> e.computeAllowance();
		System.out.println(function4.applyAsDouble(new Employee(101, "Jhon", 'A', LocalDate.now(), 10000, Gender.MALE)));


				
	


	}

}
