package com.zensar.training.bean;

public class Student {
	public String name;
	public int mark;
	public char grade;
	@Override
	public String toString() {
		return "Student [name=" + this.name + ", mark=" + this.mark + ", grade=" + this.grade + "]";
	}
	public int hashcode() {
		int result=name.length()*20;
		return result;
		
	}
	
	public boolean equals(Object obj) {
		Student other=(Student) obj;
		if(this.name.equals(other.name))
			return true;
		return false;
		
	}
	
}


