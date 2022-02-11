package com.zensar.training.ui;

public class RangedNumberSumTask implements Runnable {

	int start;	//10
	int end;	//20
	
	@Override
	public void run() {
		int start=10;
		int end=20;
		int sum=0;
		for(int i=start;i<=end;i++) {
			sum+=i;
		}
		System.out.println(Thread.currentThread().getName()+":"+sum);
	}

}
