package com.zensar.training.bean;

public class Labour extends Employee {
	
	private int overtime;

	public Labour(double salary, int overtime) {
		super(salary);
		this.overtime = overtime;
	}

	public double getOvertime() {
		return overtime;
	}

	public void setOvertime(int overtime) {
		this.overtime = overtime;
	}

	@Override
	public double computeTotalSalary() {
		return this.getSalary()+this.getOvertime()*500;
}
	
}
