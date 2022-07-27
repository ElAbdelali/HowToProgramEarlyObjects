package chapter14exercise6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.printf("Please follow the following:%n"
				+ "The password length should be between"
				+ " 8-15 characters.%nMust start with the alphabet,%n"
				+ "contain at least one uppercase letter%n"
				+ "and at least one number%n%n"
				+ "Please enter a password: ");
		
		String password = scan.nextLine();
		
		if(validatePassword(password)) {
			System.out.println("The Password you've input meets the criteria.");
		}else {
			System.out.println("Invalid input.");
		}
	}
	
	public static boolean validatePassword(String password) {
		Pattern regex = Pattern.compile("^[A-Za-z][a-zA-Z\\d\\w\\W]{8,15}$");
		Matcher matcher = regex.matcher(password);
		return matcher.find();
	}

}
