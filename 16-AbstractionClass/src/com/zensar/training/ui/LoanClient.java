package com.zensar.training.ui;

import com.zensar.training.bean.Loan;
public class LoanClient {

	public static void main(String[] args) {
		Loan loan;
		System.out.println(Loan.getIntrestAmount());
		
		loan=new carLoan(300000,24"TS 34-509");
		System.out.println(loan.getIntrestAmount());
		
		
	}

}
