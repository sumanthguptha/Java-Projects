package com.zensar.training.ui;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main2 {

	public static void main(String[] args) {
		List<String> names=new CopyOnWriteArrayList<>();
		names.add("Vicky");
		names.add("Hari");
		names.add("suresh");
		names.add("naresh");
		
		Iterator<String> it=names.iterator();	//Fail safe iterator
		while(it.hasNext()) {
			System.out.println(it.next());
			names.add("Jackson");
		}
		System.out.println(names);
		
		//concurrenthashmao is fail safe version of hashmap
		
	}

}
