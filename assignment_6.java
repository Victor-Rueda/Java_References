import java.util.Scanner;


public class assignment_6 {
	
	public static void menu() {
		System.out.println( "1. Convert to Kilometers\n2. Convert to Feet\n3. Convert to Inches\n4. Quit the program.");
}
	
	public static void showKilometers( double usermeters ) {
		
		double kilometers;
		kilometers = usermeters * .001;
		System.out.printf( "%.3f converted to Kilometers is %.3f", usermeters, kilometers );
	}
	public static void showInches( double usermeters ) {
		
		double inches;
		inches = usermeters * 39.37;
		System.out.printf( "%.3f converted to Inches is %.3f", usermeters, inches );
	}
	public static void showFeet( double usermeters ) {
	
	double feet;
	feet = usermeters * 3.281;
	System.out.printf( "%.3f converted to Feet is %.3f", usermeters, feet );
}

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner ( System.in );
		double usermeters;
		int sentinel = 4;
		int userinput;
		
		System.out.println( "Please enter the distance in meters:");
		usermeters = scanner.nextDouble();
		
		while(usermeters < 0) {
			System.out.println("Please enter a positive value for your meters:");
			usermeters = scanner.nextDouble();
		}
		
		menu();
		
		System.out.println( "Please enter your choice: ");
		userinput = scanner.nextInt();

 while( userinput != sentinel ) {
	if(userinput == 1 ) {
		showKilometers(usermeters);
	}
	else if( userinput == 2) {
	showFeet(usermeters);
	}
	else if(userinput == 3) {
		showInches(usermeters);
	}
	else {
	System.out.println("Please select an available option.");
	}
	menu();
	System.out.println( "Please enter your choice: ");
	userinput = scanner.nextInt();
	}
 System.out.println("Goodbye!");
	}
			}
	

