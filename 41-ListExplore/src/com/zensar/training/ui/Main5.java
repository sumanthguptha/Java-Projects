package com.zensar.training.ui;

import java.util.ArrayList;
import java.util.List;

import com.zensar.training.bean.Square;

public class Main5 {

	public static void main(String[] args) {
		List<Square> allSquare=new ArrayList<>();
		Square s1=new Square(5);
		Square s2=new Square(7);
		Square s3=new Square(8);
		Square s4=new Square(9);
		Square s5=new Square(10);
		
		allSquare.add(s1);
		allSquare.add(s2);
		allSquare.add(s3);
		allSquare.add(s4);
		allSquare.add(s5);
		
		//System.out.println(allSquare.get(2));
		//System.out.println(allSquare.get(allSquare.size()-1));
		
		System.out.println(allSquare);
		allSquare.add(3,new Square(100));
		
		System.out.println(allSquare);
		
		allSquare.set(0,new Square(200));
		System.out.println(allSquare);
		
		System.out.println(allSquare.indexOf(new Square(1000)));
		System.out.println(allSquare.contains(new Square(9)));
		
		for(Square square:allSquare) {
			System.out.println(square.calculateArea());
		}
		allSquare.clear();
		allSquare=null;

	}

}
