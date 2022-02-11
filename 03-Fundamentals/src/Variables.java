
public class Variables {
		
		int v1; // instance variable
		static int v2; // global variable
		
	public static void main(String[] args) {
		int age; //local variable
		
			
	}

	public void demo(double x) {
		int a=10;// local variables should be declared before use
		System.out.println(a);
		System.out.println(v1);// No need to initialise becz it is a instance variable
		System.out.println(v2);//No need to intialize bcz it is global variable
		System.out.println(x);// we can use it becz it is intialized in scope 
		
		if(a==100) {
			int y=90;
			System.out.println(y);// only here the y value is used but u cannot use other than this  if-block
		}
		System.out.println(y);// here u cannot use the y value bcz it is out side the if block
	}
}
