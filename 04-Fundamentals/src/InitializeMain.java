
public class InitializeMain {

	public static void main(String[] args) {
		int a=30;
		
		float b=40.0F;
		float c;
		c=a+b;
		
		byte b1=90;
		byte b2=100;
		short s1=200;
		
		int res=b1+b2+s1;
		
		byte b3=10+20;// here we can store the value in the range otherwise it shows the error 
		
		final int f;
		f=25;
		
		f++;// we cannot modify the value throughout its life time 
		// But we can read the variable and arthematic operations can be done 
		// Final can be used to fix the value and no need to change (constant value)
		
	}

}
//Any expression that have value we have to store the value in int type datatype it's the rule
//byte+byte should be in int datatype
//short+short should be in the INt datatype [THESE ARE THE RULES]