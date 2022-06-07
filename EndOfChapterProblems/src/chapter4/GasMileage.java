/*
 * Chapter 4 Exercise 17: 
 * 
 * Drivers are concerned with the mileage their automobiles get. One driver has kept track of several trips by recording the miles driven and gallons used for each tank-full. 
 * Develop a Java application that will input the miles driven and gallons used (both as integers) for each trip. The program should calculate and display the miles per gallon 
 * obtained for each trip and print the combined miles per gallon obtained for all trips up to this point. 
 * All averaging calculations should produce floating-point results. Use class Scanner and sentinel-controlled iteration to obtain the data from the user.
 *  
 *  
 *  variables to keep track of: milesDriven, gallonsUsed, avgMilesPerGallon
 *  need to display both the miles per gallon for each trip and the combined miles per gallon for all trips
 *  ask user to input both values and use scanner input to record values need to type cast double value for average
 *  
 *  
 *  
 *  
 *  
 */
package chapter4;

import java.util.Scanner;

public class GasMileage {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // constructing new scanner object to take values input by application users
		
		int totalGallonsUsed = 0;
		int totalMilesDriven = 0;
		double avgMilesPerGallon;
		int numOfTrips = 0;
		
		System.out.print("Please enter Miles driven or -1 to exit application: ");
		int milesDriven = input.nextInt();

		while ( milesDriven != -1 ) {

			totalMilesDriven += milesDriven;
			numOfTrips++;
			
			System.out.printf("Enter Gallons used: ");
			int gallonsUsed = input.nextInt();
			System.out.print("Enter Miles Driven or -1 to calculate Average: ");
			milesDriven = input.nextInt();
			
			totalGallonsUsed += gallonsUsed;
			
			
		}
		
		avgMilesPerGallon = (double) totalMilesDriven / totalGallonsUsed;
		
		if (numOfTrips != 0) {
			
			System.out.printf("%nThe total number of Trips is: %d%n", numOfTrips);
			System.out.printf("The total number of Gallons used is: %d%n", totalGallonsUsed);
			System.out.printf("The total number of Miles driven is: %d%n", totalMilesDriven);
			System.out.printf("The Average Miles per Gallon is: %.2f", avgMilesPerGallon);
					
		}

			input.close();

	}

}
