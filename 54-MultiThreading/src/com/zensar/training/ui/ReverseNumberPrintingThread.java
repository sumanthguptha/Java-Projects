package com.zensar.training.ui;

public class ReverseNumberPrintingThread extends Thread {
	public void run() {
		for (int i =100; i >= 1; i--) {
			System.out.println("Reverse Number : "+ i);
		}

	}
}