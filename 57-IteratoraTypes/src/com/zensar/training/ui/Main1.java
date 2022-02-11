package com.zensar.training.ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main1 {

	public static void main(String[] args) {
		List<String> names=new ArrayList<>();
		names.add("Vicky");
		names.add("Hari");
		names.add("suresh");
		names.add("naresh");
		
		Iterator<String> it=names.iterator();	//Fail fast iterator
		
		while(it.hasNext()) {
			String str=it.next();
			
			//names.remove("Hari");
			//names.add("Honey");
			names.set(1, "Harshith");
			
		}
		System.out.println(names);
	}

}
