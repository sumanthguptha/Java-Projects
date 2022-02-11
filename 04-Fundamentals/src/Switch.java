
public class Switch {

	public static void main(String[] args) {
		char grade='F';
		
		switch (grade) {
		case 'A':System.out.println("Hi switch case");
		break;
		case 'B':System.out.println("Hello Zensar");
		break;
		case 'C':System.out.println("Hello ");
		break;
		case 'D': System.out.println("party ledha pushpa....");
		break;
		default:System.out.println("fireuuuuuu");
		}
	}

}
// we can use byte int char short type of datatypes are used in switch case
// boolean,long,double and float are not used in switch statments
// for each case a value should be assigned
// default is an optional value
// 