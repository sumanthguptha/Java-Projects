package com.zensar.training.bean;

public class Circle {
	
	int radius;
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "radius="+this.radius;	
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==this)
			return true;
		
		
		if(obj instanceof Circle) {
			
		}
		
		if(obj==null)
			return false;
		
		Circle temp=(Cirlce)obj;
		if(temp.radius==this.radius)
			return true;
		
		return false;
		
	}
}
