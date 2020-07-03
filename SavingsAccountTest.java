package savings_account;

import java.util.Scanner;

public class SavingsAccountTest{
	
	public static void main ( String [] args ) {
		
		Scanner scanner = new Scanner ( System.in );
		
		
		double userannualinterestrate;
		double userstartingbalance;
		int usernumberofmonths;
		double despositedvalue; 
		double withdrawnvalue = 0;
		double totaldeposits = 0;
		double totalwithdraws = 0;
		double totalinterestearned = 0;
		
		System.out.println( "please enter the annual interest rate: ");
		userannualinterestrate = scanner.nextDouble();
		
		System.out.println( "please enter the starting balance: ");
		userstartingbalance = scanner.nextDouble();
		
		System.out.println( "please enter the number of months: ");
		usernumberofmonths = scanner.nextInt();
		//
		savings_account account1 = new savings_account( userstartingbalance );
		account1.annualinterest( userannualinterestrate );
		
		for( int currentmonths = 1; currentmonths<= usernumberofmonths; currentmonths ++ ){
			
			System.out.println( "How much was deposited during this month? " + currentmonths );
			despositedvalue = scanner.nextDouble();
			
			totaldeposits += despositedvalue;
			totalwithdraws += withdrawnvalue;
			
			account1.deposit(despositedvalue);
			
			System.out.println( "How much was withdraw during this month? " + currentmonths );
			withdrawnvalue = scanner.nextDouble();
			
			account1.withdraw(withdrawnvalue);
			
			totalinterestearned += account1.monthlyinterest();
			
		}
		
		System.out.printf( "The final balance at the end of %d months is %f\nThe total amount of deposits: %f\n" +
		"The total amount of withdraws: %f\n The total interest erned: %f", 
				usernumberofmonths, account1.getbalance() , totaldeposits , totalwithdraws ,  totalinterestearned  );
		
	}
	
}
