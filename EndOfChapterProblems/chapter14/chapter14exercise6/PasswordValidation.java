package chapter14exercise6;

import java.util.Scanner;

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
		return password.matches("^([A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,15}$");
	}

}
