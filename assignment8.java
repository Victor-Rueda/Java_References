import java.util.Scanner;


public class assignment8 {
	
	double [] rainfallstats;
	
	public double gettotal() {
		
		double totalrainfall =0;
		
		for(int i=0; i< rainfallstats.length; i++) {
			
			totalrainfall = totalrainfall + rainfallstats[i];
		}
		return totalrainfall;
		
	}
	
	public double getaverage() {
		
		return gettotal() / rainfallstats.length;
		
	}
	
public int getmost() {
		
	double mostrain= rainfallstats[0];
	int mostmonth = 1;
	
	for(int i=0; i< rainfallstats.length; i++) {
		
		if(rainfallstats[i]>mostrain) {
			
			mostrain = rainfallstats[i];
			
			mostmonth = i + 1;
		}
	
	}
	
return mostmonth;
		
	}

public int getleast() {
	
	double leastrain= rainfallstats[0];
	int leastmonth = 1;
	
	for(int i=0; i< rainfallstats.length; i++) {
		
		if(rainfallstats[i]<leastrain) {
			
			leastrain = rainfallstats[i];
			
			leastmonth = i + 1;
		}
	
	}
	
return leastmonth;
		
	}


	
	
	public assignment8(double [] rainfallstatsgiven) {

	rainfallstats = new double [rainfallstatsgiven.length];
	
	for(int i=0; i< rainfallstatsgiven.length; i++) {
		
		rainfallstats[i] = rainfallstatsgiven[i];
		}
	
	

	}

}
