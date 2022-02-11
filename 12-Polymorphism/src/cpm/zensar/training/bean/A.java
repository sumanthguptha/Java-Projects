package cpm.zensar.training.bean;

public class A {
	public void m1(double a) {
		
	}
	
	public void m1(int a) {
		System.out.println("A class m1 with 1 parameter" +a);
	}
	
	public void m1(int a , int b) {
		System.out.println("A class m1 with 2 parameter "+a+","+b);
	}
	
	public void m1(byte a) {
		System.out.println("A class m1 with 1 parameter" +a);
	}
	
	public void m1(float f, boolean b) {
		
	}
	
	public void m1(boolean f,float b) {
		return 0;
	}

}


// defining a method with different names and same parameters is known as method overloading 
