package chapter4;

import java.util.Scanner;

public class TwoLargestNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int counter = 10;
		int largest = 0;
		int secondLargest = 0;
		System.out.printf("Enter the 10 numbers:%n");

		while (counter > 0) {
			int number = input.nextInt();
			
			if(number > largest) {
				secondLargest = largest; // secondLargest = 0, 1, 2, 3
				largest = number; // largest = 1, 2, 3, 4
			}
			else if(number > secondLargest) {
				secondLargest = number; // 1, 2, 3, 4
			}
			counter--;
		}
		System.out.printf("The largest number input was: %d%n", largest);
		System.out.printf("The second largest number input was: %d", secondLargest);
	}

}
