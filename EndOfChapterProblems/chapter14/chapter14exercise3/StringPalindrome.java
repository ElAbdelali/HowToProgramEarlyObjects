package chapter14exercise3;

import java.util.Scanner;

public class StringPalindrome {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a String: ");
		StringBuilder string = new StringBuilder(scan.next());
		String inputVal = string.toString();
	
		StringBuilder reverseString = string.reverse();
		
		String palindromeOrNot = reverseString.toString();
		
		if(inputVal.equals(palindromeOrNot)) {
			System.out.println("The String you entered is a palindrome.");
		}
		else{
			System.out.println("The String you entered is not a palindrome.");
		}
	}
		
}
	
