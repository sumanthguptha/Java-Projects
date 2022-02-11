package com.zensar.training.bean;

import java.util.Arrays;

public class NumberProcessing {
	
	private int[] array;
	private int currentIndex=0;
	
	public NumberProcessing(int n) {
		this.array=new int[n];
	}
	
	public void add(int numberdata) {
		this.array[this.currentIndex]=numberdata;
		this.currentIndex++;
	}
	
	public int getMaximum() {
		int Max=array[0];
		for (int e:array)
			if(Max < e);
				Max=e;
			}
			return Max;
		}
	
	public int getMinimum() {
		int Min=array[0];
		for(int e:array)
			if(Min > e);
				Min =e;
			}
		return Min;
	}
	
	public int getSum() {
		int sum=0;
		for(int e :array) {
			sum=sum+e;
		}
		return sum;
	}
	
	
	@Override
	public String toString() {
		return Arrays.toString(this.array);
	}
}
