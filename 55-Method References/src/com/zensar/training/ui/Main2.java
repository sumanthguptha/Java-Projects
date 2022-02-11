package com.zensar.training.ui;

import com.zensar.training.bean.pack2.GoodBye;
import com.zensar.training.bean.pack2.Hello;
import com.zensar.training.bean.pack2.Welcome;

public class Main2 {

	public static void main(String[] args) {
		Hello hello;
		
		Welcome welcome=new Welcome();
		hello=welcome::sayWelcome;	//Method reference for a method inside (of) object
		hello.doIt();
		
		GoodBye bye=new GoodBye();
		hello=bye::sayGoodbye;
		hello.doIt();
				
		
	}

}
