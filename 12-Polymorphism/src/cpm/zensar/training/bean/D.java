package cpm.zensar.training.bean;

public class D {

	public static void main(String[] args) {
		C obj=new C();
		int[] ages= {24,21,56,33,67,77,88};
		obj.printSum(ages);
		
		obj.printSum(new int[10]);
		obj.printSum(new int[] {});// valid array
		
		obj.printSum(new int[10]);
		
		

}

}