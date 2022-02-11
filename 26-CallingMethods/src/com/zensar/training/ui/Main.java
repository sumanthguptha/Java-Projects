package com.zensar.training.ui;

import java.util.Arrays;

import com.zensar.training.bean.Square;

public class Main {
	
	public static void demo1(long a) {
		Demo obj=new Demo();
		
		System.out.println("During Execution of demo1 "+ a);
		a++;
		System.out.println("During Execution of demo1 "+ a);

		
	}
	
	static void demo2(int [] elements) {
		elements[0]++;
		elements[1]=elements[1]*2;
		elements[2]=1000;
	}
	
	static void demo3(Square s) {
		s.setSize(4000);
	}
	
	public static void main(String[] args) {
		
		long a=80L;
		System.out.println("Before Invocation"+ a);
		
		demo1(a);
		System.out.println("After Invocation"+ a);
		System.out.println("-----------------------------------");
		
		int[] arr=new int[] {1,2,3};
		System.out.println("Before Invocation"+ Arrays.toString(arr));
		demo2(arr);
		System.out.println("After Invocation"+ Arrays.toString(arr));
		
		
	}

}
