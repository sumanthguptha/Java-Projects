package com.zensar.training.bean;

public class Processing<T> {
	Object data;
	
	public void setData(T obj) {
		this.data = obj;
	}
	
	public Object getData() {
		return(T) this.data;
	}

}
