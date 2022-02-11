package com.zensar.training.ui;

import java.util.function.Supplier;

import com.zensar.training.bean.Circle;
import com.zensar.training.bean.Gender;
import com.zensar.training.bean.Rectangle;
import com.zensar.training.bean.Student;

public class Main2 {

	public static void main(String[] args) {
		Supplier<Integer> supplier1;
		supplier1=()->new Integer(100);
		System.out.println(supplier1.get());
		
		Supplier<Circle> supplier2=()->new Circle(25);
		System.out.println(supplier2.get().getRadius());
		
		Supplier<Rectangle> supplier3=()->new Rectangle(15, 20);
		System.out.println(supplier3.get().getHeight());
		
	
	}

}
