
public class floatingliteral {

	public static void main(String[] args) {
		System.out.println(10.66F);
		System.out.println(13.452f);
		System.out.println(12.55);
		System.out.println(13.45d);
		System.out.println(.6);
		System.out.println(0.6);
		System.out.println(123.);//It is not a best practise
		System.out.println(1.0E3);//treated as scientific data (e)
		System.out.println(1.0E-2);//treated as negative scientific data
	}

}
