package com.zensar.training.bean;

public class Square implements Shape{
	private int size;

	public Square(int size) {
		super();
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public double computeArea() {
		return this.size*this.a
	}

	@Override
	public double getArea() {
		
		return this.computeArea();
	}

}
