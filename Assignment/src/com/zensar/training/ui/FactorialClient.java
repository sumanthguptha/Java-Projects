package com.zensar.training.ui;
import com.zensar.training.bean.*;
public class FactorialClient {

	public static void main(String[] args) {
	
		Factorial f=new Factorial();
		f.setNum(5);
		System.out.println(f.fact());
	}

}