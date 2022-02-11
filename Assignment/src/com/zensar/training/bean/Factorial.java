package com.zensar.training.bean;

public class Factorial {
     private int num;
     private int fact=1;
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
     public int fact()
     {
    	 for(int i=1;i<=num;i++)
    	 {
    		 fact=fact*i;
    	 }
    	 return fact;
     }
}