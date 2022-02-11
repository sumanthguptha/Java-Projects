package com.zensar.training.bean;

public class ObjectStackImpl<T> {
	
	private Object[] array;
	private int currentIndex = 0;

	public ObjectStackImpl(int n) {
		this.array = new Object[n];
	}

	public void push(T n) {
		this.array[currentIndex] = n;
		currentIndex++;

	}

	public T pop() {
		currentIndex--;
		return this.array[currentIndex];
	}

	@Override
	public String toString() {
		return "IntStack [array=" + Arrays.toString(array) + ", currentIndex=" + currentIndex + "]";

	}

}
