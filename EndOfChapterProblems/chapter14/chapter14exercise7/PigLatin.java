package chapter14exercise7;

import java.util.Scanner;

public class PigLatin {
	
	public static String printLatinWord(String input) {
		String[] tokenizedInput = input.split(" ");
		
		StringBuilder englishToPigLatin = new StringBuilder();
		
		for(int i = 0; i < tokenizedInput.length; i++) {
			englishToPigLatin.append(String.format("%s ", tokenizedInput[i]
					.substring(1, tokenizedInput[i].length()) + (tokenizedInput[i].charAt(0) + "ay")));
		
		}
		String output = englishToPigLatin.toString();
		System.out.printf(output);
		return output;
	}
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("Enter the String you would like to convert into Pig-Latin: ");
		String input = scan.nextLine();
		
		printLatinWord(input);
		scan.close();

		
	}

}

