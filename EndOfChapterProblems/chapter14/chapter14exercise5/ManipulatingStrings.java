package chapter14exercise5;

import java.util.Scanner;

public class ManipulatingStrings {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] listOfStrings = new String[0];
		
		System.out.printf("%s", "Enter a String: ");
		String input = scan.nextLine();
		
		while(input != "#") {
			int i = 0;
			listOfStrings[i] = input;
			i++;
			System.out.printf("%s%n%s", "Please enter another String,", "or \"#\" to exit the application: ");
			input = scan.nextLine();
		}
		
	
	
	
	}

}
