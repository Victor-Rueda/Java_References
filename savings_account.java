package savings_account;

public class savings_account {
	private double interest;
	private double balance;
	private double totalinterest = 0;
	

	public void withdraw( double UserAmount)  {
		balance -= UserAmount;
	}

	public void deposit( double UserAmount)  {
		balance += UserAmount;
	}
	
	public double getbalance() {
		
		return balance;
	}
	
	public double monthlyinterest() {
		double monthlyrate = (( interest / 12 ) * balance);
		
		balance += monthlyrate;
		
		return monthlyrate;
	}
	
	public void annualinterest( double newinterest) {
		
	interest = newinterest;
	}
	
	public savings_account( double startingbalance ) {
		balance = startingbalance;
		interest = 0;
	}
	

}

