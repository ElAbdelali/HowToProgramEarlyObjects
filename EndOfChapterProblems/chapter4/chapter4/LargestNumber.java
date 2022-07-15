package chapter4;

/*
 * PseudoCode for the following program is as follows:
 * 
 * while the counter is less than or equal to 10,
 * ask user to input a number
 * 
 * if the number is greater than the initial number,
 * the number is now the largest
 * 
 * iterate by 1
 * 
 * output the largest number
 * 
 * 
 * 
 * 
 */
import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int counter = 1;
		int largest = 0;
		
		while (counter <= 10) {
			System.out.print("Enter a number: ");
			int number = input.nextInt();
			
			if(number > largest) {
				largest = number;
			}
			counter++;
		}
		System.out.printf("The largest number input was: %d", largest);
	}

}
