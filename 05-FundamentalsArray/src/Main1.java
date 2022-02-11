
public class Main1 {

	public static void main(String[] args) {
		int[] marks;	// Arrays concepts
		int marks1[];
		marks=new int[3];
		int n=
		
		// here the memory allocation is created for the 3 values in heap memory to store the data
		// The Address is created for the memory allocation also called as reference variable 
		// which is pointing to the memory allocated area
		
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		// here 0,1,2 are known as index values and the values in the index are going to be printed
		
		marks[0]=80;
		marks[1]=40;
		marks[2]=70;// Here we are rewriting the values 
		
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks.length);// used to know the length of the marks
		
		for(int i=0;i< marks.length;i++) {
			System.out.println(marks[i]);
		}//Here the values we get in Ascending manner
		

		for(int i=marks.length;i>=0;i--) {
			System.out.println(marks[i]);
		}//Here the values we get in Descending manner
		// Its the old and traditional for loop
		
		for(int value:marks) {			// Modern for loop
			System.out.println(value);
		}
		
		
		marks=null;//when we assign null the address will be removed and the heap memory is known as garbage value
		
		marks=new int[] {10,20,30,40,50};//Reassigning value to the marks element
		// Insteading of creating zero values directly we can assign values in the decleartion itself
		
		float [] arr= {10.0F,20.0F,30.0F,40.0F};
		
		//Index starts from 0 to infinity
		// Lower boundary starts from zero and the Higher boundary is length-1
		
		for(float v:arr) {
			System.out.println(v);// Modern for each loop
		}
		
		
	}

}


