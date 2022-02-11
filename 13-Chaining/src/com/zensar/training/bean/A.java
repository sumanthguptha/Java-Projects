package com.zensar.training.bean;

public class A {
	
	private int x;
	private static int y;
	
	public A(){
		this(10);				// This keyword should be used first statement inside the loop and the process is called chaining
		System.out.println("No Argument Constructor");
	}

	public A(int x) {			// these are called as constructors
		this();					// here the abpve constructer is called using this keyword														
		System.out.println("one Argument constructor");
		this.x=x;
		this.test1();
		test2();
	}
	
	public void test1() {
		System.out.println(x);
		System.out.println(y);//an instance variable can also access both instance and static variables data
		test3();
		test4();
	}
	
	public static void test2() {
		//System.out.println(x);
		System.out.println(y);
		
	}
	
	public void test3() {
		System.out.println("test3");
		
		
	}
	
	public static void test4() {
		System.out.println("test4 static");
		
	}
}
