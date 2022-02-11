package com.zensar.training.ui;

import com.zensar.training.bean.Gender;

public class Main {

	public static void main(String[] args) {
		
		Gender gender=Gender.Male;
		//gender=Gender.Female;
		
		System.out.println(gender.getAverageHeight());
		System.out.println(gender.getAverageWeight());
		
		
	}

}
