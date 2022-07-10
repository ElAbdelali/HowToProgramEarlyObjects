package com.eljaouhariali.chapter2;

import java.util.Scanner;

public class LargestAndSmallestInteger {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int largest = 0;
		int smallest = 0;
		
		System.out.println("Please enter the first number: ");
		int first = input.nextInt();
		System.out.println("Please enter the second number: ");
		int second = input.nextInt();
		System.out.println("Please enter the third number: ");
		int third = input.nextInt();
		System.out.println("Please enter the fourth number: ");
		int fourth = input.nextInt();
		System.out.println("Please enter the fifth number: ");
		int fifth = input.nextInt();
		
		if (first > second && first > third && first > fourth && first > fifth) {
			largest = first;
			System.out.println("First number input is the largest!");
		}
		if (first < second && first < third && first < fourth && first < fifth) {
			smallest = first;
			System.out.println("First number input is the smallest!");
		}	
		if (second > first && second > third && second > fourth && second > fifth) {
			largest = second;
			System.out.println("Second number input is the largest!");
		}
		if (second < first && second < third && second < fourth && second < fifth) {
			smallest = second;
			System.out.println("Second number input is the smallest!");
		}		
		if (third > first && third > second && third > fourth && third > fifth) {
			largest = third;
			System.out.println("third number input is the largest!");
		}
		if (third < first && third < second && third < fourth && third < fifth) {
			smallest = third;
			System.out.println("third number input is the smallest!");
		}	
		if (fourth > first && fourth > second && fourth > third && fourth > fifth) {
			largest = fourth;
			System.out.println("fourth number input is the largest!");
		}
		if (fourth < first && fourth < second && fourth < third && fourth < fifth) {
			smallest = fourth;
			System.out.println("fourth number input is the smallest!");
		}	
		if (fifth > first && fifth > second && fifth > third && fifth > fourth) {
			largest = fifth;
			System.out.println("fifth number input is the largest!");
		}
		if (fifth < first && fifth < second && fifth < third && fifth < fourth) {
			smallest = fifth;
			System.out.println("fifth number input is the smallest!");
		}	
		
		
		
	}

}
