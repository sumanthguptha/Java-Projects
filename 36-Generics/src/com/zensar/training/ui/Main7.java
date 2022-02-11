package com.zensar.training.ui;

import com.zensar.training.bean.Circle;
import com.zensar.training.bean.ObjectStackImpl;
import com.zensar.training.bean.Square;

public class Main7 {

	public static void main(String[] args) {
		ObjectStackImpl<Circle> impl=new ObjectStackImpl<Circle>(10);
		
		impl.push(new Circle(25));
		impl.push(new Circle(15));
		impl.push(new Circle(20));
		
		System.out.println(impl);
		
		ObjectStackImpl<String> impl=new ObjectStackImpl<String>(10);
		impl1.push("Welcome");
		impl1.push("Good bye");
		impl1.push("Hello");
		
		String s1=impl1.pop();
		System.out.println(s1.toUpperCase());

		ObjectStackImpl<Square> impl2=new ObjectStackImpl<Square>(10);
		impl2.push(new Square(25));
		impl2.push(new Square(24));
		impl2.push(new Square(23));
		impl2.push(new Square(22));
		impl2.push(new Square(21));
		
		Square s=impl2.pop();
		System.out.println(s.getSize()+","+s.computeArea());
		
		ObjectStackImpl<Double>impl3=new ObjectStackImpl<Double>(10);
		impl3.push(new Double(25.0));
		impl3.push(30.0);
		impl3.push(40.0);
		
		Double d=impl3.pop();
		System.out.println(d.intValue());
	}

}
