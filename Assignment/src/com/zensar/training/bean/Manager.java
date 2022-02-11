package com.zensar.training.bean;

public class Manager extends Employee {
	
	private double incentive;

	public Manager(double salary, double incentive) {
		super(salary);
		this.incentive = incentive;
	}

	public double getIncentive() {
		return incentive;
	}

	public void setIncentive(double incentive) {
		this.incentive = incentive;
	}
	@Override
	public double computeTotalSalary() {
		return this.getSalary()+incentive;
	}

}
