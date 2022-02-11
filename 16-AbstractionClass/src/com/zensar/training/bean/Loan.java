package com.zensar.training.bean;

import java.util.Objects;

abstract public class Loan {
	double loanAmount;
	double tenureInMonths;
	public Loan(double loanAmount, double tenuewInMonths) {
		super();
		this.loanAmount = loanAmount;
		this.tenureInMonths = tenuewInMonths;
	}
	public Loan() {
		super();
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public double getTenuewInMonths() {
		return tenureInMonths;
	}
	public void setTenuewInMonths(double tenuewInMonths) {
		this.tenureInMonths = tenuewInMonths;
	}
	@Override
	public String toString() {
		return "Loan [loanAmount=" + loanAmount + ", tenuewInMonths=" + tenuewInMonths + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(loanAmount, tenureInMonths);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Loan other = (Loan) obj;
		return Double.doubleToLongBits(loanAmount) == Double.doubleToLongBits(other.loanAmount)
				&& Double.doubleToLongBits(tenureInMonths) == Double.doubleToLongBits(other.tenuewInMonths);
	}

}
