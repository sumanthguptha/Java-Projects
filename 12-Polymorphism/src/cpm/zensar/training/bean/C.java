package cpm.zensar.training.bean;

public class C {
	
	public void printSum(int... arr) {//ellipsis parameters we can pass multiple parameters in to the array 
		int sum=0;
		for (int element:arr)
			sum+=element;
		System.out.println(sum);
		
	}

}
//method overloading--