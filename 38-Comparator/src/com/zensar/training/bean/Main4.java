package com.zensar.training.bean;

public class Main4 {

	public static void main(String[] args) {
		
		Customer customer=new Customer();
		customer.setId(12);
		customer.setName("Johnny");
		try {
			customer.setBalance(1000);
		}catch(RuntimeException e) {
			System.out.println();
		}
		System.out.println(customer);
	}

}
/*run time --unchecked exceptions

 */
