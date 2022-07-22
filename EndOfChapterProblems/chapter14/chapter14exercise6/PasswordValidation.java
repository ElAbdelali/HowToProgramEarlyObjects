package chapter14exercise6;

import java.util.Scanner;

public class PasswordValidation {
	
	Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Please enter a password.");
		System.out.println("The password length should be between "
				+ "8-15 characters. Must start with the alphabet, "
				+ "contain at least one uppercase letter "
				+ "and at least one number");
		

	}
	
	public static boolean validatePassword(String password) {
		return password.matches("\D\S+[a-zA-Z]+\d{8,15}");
	}

}
