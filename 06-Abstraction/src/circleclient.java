
public class circleclient {

	public static void main(String[] args) {
		
		circle c1;
		c1=new circle();
		c1.radius=10;
		double area=c1.getArea();
		System.out.println(area);
		
		circle c2;
		c2=new circle();
		c2.radius=15;
		System.out.println(c2.getArea());
		
		circle c3;
		c3=new circle();
		c3.radius=8;
		System.out.println(c3.getArea());
		
	}

}
