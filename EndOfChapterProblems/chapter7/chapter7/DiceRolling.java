package chapter7;

import java.security.SecureRandom;

public class DiceRolling {
	
	 public static void main(String[] args) {
	    	// Create a Random object
	    	SecureRandom randomNumbers = new SecureRandom(); 
	    	
	    	// Initialize a couple of variables to hold the values of the two dice
	    	int dice1; // value on the first dice
	    	int dice2; // value on the second dice
	    	
	    	// Initialize the array that will hold the results
	    	int frequency = 13; // frequencies of sums

	    	int total [] = new int [ frequency ]; 
	    	for ( int index = 0; index < frequency; index ++) {
	    		total[index] = 0;
	    	}
	    	
	    	int rolls = 36000000; // number of rolling times
	    	
	    	// tally counts for 36,000,000 rolls of two dices
	    	for ( int t = 0; t <= rolls; t++ ) {
	    		dice1 = randomNumbers.nextInt(6) + 1; 
	    		dice2 = randomNumbers.nextInt(6) + 1;
	    		total[dice1 + dice2]++;
			} // end for loop

	    	// Display the frequencies
	        System.out.println("Results after " + rolls + " rolls");
	        System.out.println("-------------------------");
	        System.out.println("Value\tFrequency");
	        
	        // Loop, displaying the rows for the body of the table, each on its own line.
	        //  The required format for each row is to display the sum, followed by a tab, 
	        //  followed by the number of times that sum came up. Do not include any additional formatting
	        for (int sum = 2; sum < frequency; sum++ ) {
	        	
	        	System.out.printf("%d\t%d\n" , sum, total[sum]);
	        }
	
	 }
}
