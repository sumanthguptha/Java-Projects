package com.zensar.training.ui;

import java.util.LinkedList;
import java.util.List;

public class Main3 {

	public static void main(String[] args) {
		List<String> names=new LinkedList<>();
		names.add("pushpa");
		names.add("srivalli");
		names.add("macha");
		
		names.stream().map(String::toUpperCase).forEach((s)->System.out.println(s));
			// method reference for a method in arbitary objectd of particular type(string)

		
	}

}
