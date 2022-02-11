package com.zensar.training.ui;
import com.zensar.training.bean.*;
public class PrimeNumberDeciderClient {

	public static void main(String[] args) {
       PrimeNumberDecider prime=new PrimeNumberDecider();
		prime.setPrime(10);
		System.out.println(prime.isPrimeNumber());
		
	}

}