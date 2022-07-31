package chapter14exercise9;

import java.util.Scanner;

public class ReverseWordsInASentence {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("Please enter a sentence: ");
		String input = scan.nextLine();
		
		String[] inputArray = input.split(" ");
		
		// For loop starts at the first word of the sentence and continues
		for(int i = 0; i < inputArray.length; i++) {
			
			StringBuilder reverseString = new StringBuilder(inputArray[i]);
			inputArray[i] = reverseString.reverse().toString();
			
		}
				
		for(String inputs : inputArray) {
			System.out.printf("%s ", inputs);
		}
	}

}
