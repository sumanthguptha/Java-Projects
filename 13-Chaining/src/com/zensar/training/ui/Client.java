package com.zensar.training.ui;
import com.zensar.training.bean.A;

public class Client {

	public static void main(String[] args) {
		A obj;
		obj=new A(10);
		obj.test1();
		//obj.test2();	// Here we can't access so the below statement is created to access
		A.test2(); 		//using a name we can use static constructor
		
	}

}
