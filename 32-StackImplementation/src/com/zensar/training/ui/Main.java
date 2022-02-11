package com.zensar.training.ui;

import com.sun.org.apache.xml.internal.utils.IntStack;
import com.zensar.training.bean.IntStack;
public class Main {
	
	public static void main(String[] args) {
		IntStack intStack=new IntStack(10);
		
		intStack.push(10);
		intStack.push(25);
		intStack.push(26);
		intStack.push(27);
		intStack.push(29);
		intStack.push(35);

		System.out.println(intStack.toString());
		System.out.println(intStack.pop());
		
		System.out.println(intStack.pop());
		
		System.out.println(intStack.pop());
		
		System.out.println(intStack.toString());
		
		
		
		
		
	}

}
