package chapter14exercise10;

import java.util.Scanner;

public class LongestWord {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a sentence: ");
		
		String inputString = scan.nextLine();
		
		String[] inputStringArray = inputString.split(" ");
		String longestString = "";

		for(int i = 0; i < inputStringArray.length; i++) {
			if(inputStringArray[i].length() > longestString.length()) {
				longestString = inputStringArray[i];
			}
			
		}
		System.out.print(longestString);
		
	}

}
