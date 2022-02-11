package com.zensar.training.ui;

public class A {
	private int x;
	private static int y;
	
	void test() {
		B obj=new B();
		System.out.println(obj.a);
	}
	
	public A(int x) {
		super();
		this.x = x;
	}

	public class B{
		void m1() {
			System.out.println(x);
			System.out.println(y);
		}
	}
	
	public static class C{
		void m2() {
			System.out.println(y);
		}
		
	}

	public void calc() {
		class Calculator {
			int sum(int a,int b) {
				return a+b;
			}
			int subtract(int a,int b) {
				return a-b;
			}int multiply(int a,int b) {
				return a*b;
			}int divide(int a,int b) {
				return a/b;
			}
			
			Calculatr calculator=new Calculator();
			
		}
	}
}
