package com.zensar.training.bean;

public class Manager extends Employee{
	
	public double incentive;
	
	
	public double computeNetSalary() {
		return super.computeNetSalary()+incentive;
	

}
}