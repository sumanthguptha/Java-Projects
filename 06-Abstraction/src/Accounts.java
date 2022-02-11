
public class Accounts {
	double balance;
	int typeOfAccount;		// 1 or 2
	char type;
	
	double getIntrestAmount() {
																	// if type=1 35% of balance
																	// if type=2 20% of balance
		double intrestAmount;
		switch(type) {
		case '1':intrest=balance*0.35;
		break;
		case '2':intrest=balance*0.20;
		break;
		default:System.out.println("No intrest will be added");
		}
		
			
		}
		double getInrestAmount() {
			return balance+getInrestAmount();
	}

}
