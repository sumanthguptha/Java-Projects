package com.zensar.training.ui;

import com.zensar.training.bean.Loan;

public class Main1 {

	public static void main(String[] args) {
		Loan loan;
		loan=new Loan() {
			
			@Override
			public double getIntrestRate() {
				// TODO Auto-generated method stub
				return 0.05;
			}
		};
		
		System.out.println(loan.getIntrestRate());
		
		loan=new Loan() {
			
			@Override
			public double getIntrestRate() {
				// TODO Auto-generated method stub
				return 0.03;
			}
		};
		System.out.println(loan.getIntrestRate());
		loan=new Loan() {
			
			@Override
			public double getIntrestRate() {
				// TODO Auto-generated method stub
				return 0.07;
			}
		};
		System.out.println(loan.getIntrestRate());
	}
}

