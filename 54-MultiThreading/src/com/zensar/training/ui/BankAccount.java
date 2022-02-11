package com.zensar.training.ui;



public class BankAccount {
	private int balance;
	boolean maxReached;
	boolean minReached;



	public BankAccount(int balance) {
		super();
		this.balance = balance;
	}



	public synchronized void withdraw(int amt) {
		for (int i = 1; i <= amt; i++) {
			if(this.balance<=5) {
				minReached=true;
				try {
					notify();
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			this.balance = this.balance - 1;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+":");
			System.out.println("Amount Withdrawn " + i + " Balance:" + this.balance);
		}
		notify();



	}



	public synchronized void deposit(int amt) {
		for (int i = 1; i <= amt; i++) {
			if(this.balance>=25) {
				maxReached=true;
				try {
					notify();
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			this.balance = this.balance + 1;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+":");
			System.out.println("Amount Deposited " + i + " Balance:" + this.balance);
		}
		notify();



	}
}

