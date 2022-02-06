package chapterExamples;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter a number: ");
		int inputNum = input.nextInt();
		
		int palindrome = palindrome(inputNum);
		if (inputNum == palindrome) {
			System.out.println("The number input is a palindrome.");
		}else {
			System.out.println("The number input is not a palindrome.");
		}
	}
	public static int palindrome(int inputNum) {
		int palindrome = 0;
		int remainder = 0;
		while (inputNum > 0) {
			remainder = inputNum % 10;
			palindrome = (palindrome * 10) + remainder;
			inputNum/=10;
			}
		return palindrome;
	}
}

