
public class CustomerClient {

	public static void main(String[] args) {
		Customer c=new Customer();
		c.setBalance(10000);
		c.setId(110);
		c.setName("Munna");
		System.out.println(c.isGoodCustomer());
		}

}
