package com.zensar.training.ui;

import java.time.LocalDate;
import java.util.function.Consumer;

import com.zensar.training.bean.Circle;
import com.zensar.training.bean.Employee;
import com.zensar.training.bean.Gender;
import com.zensar.training.bean.Rectangle;
import com.zensar.training.bean.Square;

public class Main1 {
	public static void main(String[] args) {
		Consumer<String> consumer1;
		consumer1=(String s)->{
			System.out.println(s.length());
		};
		consumer1.accept("zensar");
		
		Consumer<String> consumer2=(s)-> System.out.println(s.toUpperCase());
		consumer2.accept("training");
		
		Consumer<Integer> consumer3=(i)-> System.out.println(i.doubleValue());
		consumer3.accept(new Integer(45));
		
		Consumer<Circle> consumer4=(c)-> System.out.println(c.computeArea());
		consumer4.accept(new Circle(10));

		Consumer<Circle> consumer5=(c)-> System.out.println(c.getDiameter());
		consumer5.accept(new Circle(25));
		
		Consumer<Employee> consumer6=(e)-> System.out.println(e.toString());
		Employee employee=new Employee(5001,"Sumanth", 'A', LocalDate.now(), 1000, Gender.MALE);
		consumer6.accept(employee);

		Consumer<Employee> consumer7=(e)-> System.out.println(e.computeAllowance()+" "+e.getBasicSalary());
		consumer7.accept(employee);

		Consumer<Rectangle> consumer8=(r)-> System.out.println("\nRectangle : "+r.getArea());
		Rectangle rectangle=new Rectangle(15, 25);
		consumer8.accept(rectangle);
		
		Consumer<Square> consumer9=(S)-> System.out.println("\nSquare : "+S.calculateArea());
		Square square=new Square(15);
		consumer9.accept(square);
		
		
		
		

		

	}
}
