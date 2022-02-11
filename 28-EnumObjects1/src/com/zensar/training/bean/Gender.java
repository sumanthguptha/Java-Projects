package com.zensar.training.bean;

public class Gender {
	
	private int averageHeight;
	private int averageWeight;
	
	public static final Gender Male=new Gender(170,60);
	public static final Gender Female=new Gender(160,50);
	
	public int getAverageHeight() {
		return averageHeight;
	}
	public void setAverageHeight(int averageHeight) {
		this.averageHeight = averageHeight;
	}
	public int getAverageWeight() {
		return averageWeight;
	}
	public void setAverageWeight(int averageWeight) {
		this.averageWeight = averageWeight;
	}
	
	

}
