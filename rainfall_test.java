import javax.swing.JOptionPane;

public class rainfall_test {

	
	public static void fillarray( double [] arraygiven) {
		
		String userinput;
		double userrainfallfigure;
		
		for(int i=0; i < arraygiven.length; i++) {
			
			userinput = JOptionPane.showInputDialog( "Please enter rainfall figures for month " + (i+1) );
			userrainfallfigure = Double.parseDouble( userinput );
			arraygiven[i] = userrainfallfigure;
			}
		
	}
	
	
	public static void main(String[] args) {

		final int month_a_year =12;
		double[] rainfallstats = new double [month_a_year];
		String useroutput;
		
		fillarray(rainfallstats);
		
		assignment8 rainfalldata = new assignment8(rainfallstats);
		
		useroutput = String.format("Total rainfall: %.2f\n Average monthly rainfall"+
									": %.2f\nMonth with most rain: %d\nMonth with least rain: %d",
									rainfalldata.gettotal(),
									rainfalldata.getaverage(),
									rainfalldata.getmost(),
									rainfalldata.getleast());
		
		JOptionPane.showMessageDialog( null, useroutput );
				
				System.exit(0);
				
				
		
		
		
		

	}

}
