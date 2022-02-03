package chapterExamples;

import java.util.Scanner;

public class TwoLargestNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the amount of numbers you'd like to input: ");
		int counter = input.nextInt();
		int largest = 0;
		int secondLargest = 0;
		System.out.printf("Enter the numbers:%n");

		while (counter > 0) {
			int number = input.nextInt();
			
			if(number > largest) {
				secondLargest = largest;
				largest = number;
			}
			else if(number > secondLargest) {
				secondLargest = number;
			}
			counter--;
		}
		System.out.printf("The largest number input was: %d%n", largest);
		System.out.printf("The second largest number input was: %d", secondLargest);
	}

}
