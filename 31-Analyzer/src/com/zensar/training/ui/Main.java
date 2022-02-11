package com.zensar.training.ui;

import com.zensar.training.bean.NumberProcessing;

public class Main {
	
	public static void main(String[] args) {
		NumberProcessing processing;
		processing=new NumberProcessing(10);
		System.out.println(processing.toString());
		
		processing.add(34);
		processing.add(12);
		processing.add(31);
		processing.add(41);
		processing.add(54);
		processing.add(57);
		processing.add(65);
		processing.add(71);
		processing.add(77);
		processing.add(100);
		
		
		
	}
	

}
