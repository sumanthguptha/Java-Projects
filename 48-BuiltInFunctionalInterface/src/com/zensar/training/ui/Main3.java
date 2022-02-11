package com.zensar.training.ui;

import java.util.function.Predicate;

import com.zensar.training.bean.Circle;
import com.zensar.training.bean.Gender;
import com.zensar.training.bean.Square;
import com.zensar.training.bean.Student;

public class Main3 {
	
	private static final Gender M = null;





	static void demo1(Predicate<Square> predicate,Square s) {
		System.out.println(predicate.test(s));
		}
	static void demo2(Predicate<Square> predicate,Square s) {
		System.out.println(predicate.test(s));
	}
	static void demo3(Predicate<Student> predicate,Student s) {
		System.out.println(predicate.test(s));
	}
	static void demo4(Predicate<Student> predicate,Student s) {
		System.out.println(predicate.test(s));
	}
	
	

	

	public static void main(String[] args) {
		Predicate<Circle> predicate1;	//predicate is used to test the functions
		predicate1=(Circle c)->c.getRadius()>100? true: false;
		System.out.println(predicate1.test(new Circle(125)));
	
		Predicate<String> predicate2;
		predicate2=(s)-> s.length()>10? true: false;
		System.out.println(predicate2.test("zensar training"));
		
		demo1((s)->s.getSize()>5? true:false, new Square(10));
		demo2((s)->s.calculateArea()>100? true:false, new Square(5));
		demo3((s)->s.getAverageMark()>50? true:false, new Student(1502, "Sumanth", Gender.MALE, 75.0, "CSE"));
		demo4((s)->s.getGender()==M? true:false,new Student(1503, "Harika", Gender.FEMALE, 63.0, "EEE"));
		
	}
	

}
