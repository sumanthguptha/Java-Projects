package com.zensar.training.ui;

public class Main5 {

	public static void main(String[] args) {
		
		Integer i1=125;	// Auto boxing
		Integer i2=125;
		Integer i3=new Integer(125);
		
		System.out.println(i1==i3);			 // used to compare addresses b/w variables
		System.out.println(i1.equals(i3));  // used to compare values in the variables
		
	}

}
