package com.zensar.training.bean;

public class AGradeSalaryCalculator implements SalaryCalculator{

	@Override
	public double computeAllowance(double basicSalary) {
		Calculator calculator=new Calculator();
		return calculator.multiply(basicSalary ,0.40) ;
	}

	@Override
	public double computeTax(double basicSalary) {
		Calculator calculator=new Calculator();
		return calculator.multiply(basicSalary,0.25);
	}

	@Override
	public double computeNetSalary(double basicSalary) {
		Calculator calculator=new Calculator();AGradeSalaryCalculator
		double sum=calculator.add(basicSalary, this.
		return basicSalary+this.computeAllowance(basicSalary)+this.computeTax(basicSalary);
	}

}
