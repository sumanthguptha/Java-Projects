
public class Empclient {

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.basicSalary=10000.00;
		e1.grade='A';
		System.out.println("Allowances "+e1.getAllowance());
		System.out.println("Netsalary "+e1.getNetSalary());
		
		Employee e2=new Employee();
		e2.basicSalary=2000.00;
		e2.grade='B';
		System.out.println("Allowances "+e2.getAllowance());
		System.out.println("Netsalary "+e2.getNetSalary());
		
		Employee e3=new Employee();
		e3.basicSalary=25000.00;
		e3.grade='D';
		System.out.println("Allowances "+e3.getAllowance());
		System.out.println("Netsalary "+e3.getNetSalary());
	}

}
