package com.zensar.training.bean;

public class D extends C{
	
	public D(int x) {
		super(x);
		
	}
	
	public D() {
		this(100);
		//super(); 	Here we cannot pass 2 arguements at once only a single this or super should be used
		}

}
