package com.zensar.training.bean;

public class HomeLoan extends Loan {
	
	String propertyLocation;

	public HomeLoan(double loanAmount, double tenuewInMonths, String propertyLocation) {
		super(loanAmount, tenuewInMonths);
		this.propertyLocation = propertyLocation;
	}

	public HomeLoan() {
		super();
	}

	public String getPropertyLocation() {
		return propertyLocation;
	}

	public void setPropertyLocation(String propertyLocation) {
		this.propertyLocation = propertyLocation;
	}

}
