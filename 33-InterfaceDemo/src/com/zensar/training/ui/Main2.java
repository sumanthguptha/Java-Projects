package com.zensar.training.ui;

import com.zensar.training.bean.Circle;
import com.zensar.training.bean.Shape;
import com.zensar.training.bean.Square;

public class Main2 {

	public static void main(String[] args) {
		Circle circle = new Circle(10);
		System.out.println(circle.getRadius());
		System.out.println(Circle.calculateArea());
		
		Square square=new Square(10);
		System.out.println(circle.getsize());
		System.out.println(Circle.calculateArea());
		
		Shape shape=new Circle(25);
		shape.setSize(25);
		System.out.println(shape.getArea());
	}

}
