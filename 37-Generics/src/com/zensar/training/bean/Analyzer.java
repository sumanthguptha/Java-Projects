package com.zensar.training.bean;

public class Analyzer<A,B> {
	
	Object object1;
	Object object2;
	
	public void setData1(Object obj) {
		this.object1=obj;
	}
	public void setData2(Object obj) {
		this.object2=obj;
	}
	public A getData1() {
		return(A) this.object1;
	}
	public B getData2() {
		return(B) this.object2;
	}
	
}
