package com.zensar.training.ui;

import java.util.Arrays;
public class Main3 {

	public static void main(String[] args) {
		String[]cities =new String[] {"Delhi","pune","kolkata","mumbai"};
		String str=Arrays.toString(cities);
		System.out.println(str);
	
	Arrays.sort(cities);
	String str1=Arrays.toString(cities);
	System.out.println(str1);
	System.out.println(Arrays.binarySearch(cities,"pune"));
	}

}
