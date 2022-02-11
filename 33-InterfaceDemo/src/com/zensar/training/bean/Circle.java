package com.zensar.training.bean;

public class Circle implements Shape {
	private int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void setSize(int size) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}
}
