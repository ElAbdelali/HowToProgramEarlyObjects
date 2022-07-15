package chapter6;
public class ParkingCharges {
	public static double threeHourCharge = 2.0;
	public double hourlyCharge = .5;
	public static double maximumCharge = 10.0;

	public static void main(String[] args) {
		
		double owe = calculateCharges(1);
		double owe2 = calculateCharges(4);
		double owe3 = calculateCharges(19);
		double owe4 = calculateCharges(24);

		
		System.out.printf("You owe: $%.2f", owe);
		System.out.printf("%nYou owe: $%.2f", owe2);
		System.out.printf("%nYou owe: $%.2f", owe3);
		System.out.printf("%nYou owe: $%.2f", owe4);

		
	}
	
	public static double calculateCharges(double hours){
		if(hours <= 3) {
			hours = threeHourCharge;
		}
		if(hours > 3 && hours <= 19) {
			double remainingHoursCharge = (hours - 3) * .5;
			hours = threeHourCharge + remainingHoursCharge;
		}
		if(hours >= 20) {
			return maximumCharge;
		}
		return hours;
		
	}


}
