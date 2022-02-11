package com.zensar.training.bean;

public class PrimeNumberDecider {
	
	private int prime;
	public int getPrime() {
		return prime;
	}

	public void setPrime(int prime) {
		this.prime = prime;
	}

	public boolean isPrimeNumber()
    {
    	int m=prime/2;
    	for(int i=2;i<m;i++)
    	{
    		if(prime%i==0)
    			return false;
    	}
    	return true;
    }
}