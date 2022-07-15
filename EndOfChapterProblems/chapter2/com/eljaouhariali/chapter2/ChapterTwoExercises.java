package com.eljaouhariali.chapter2;

import java.util.Scanner;

public class ChapterTwoExercises {
	
	/*
	 * Fill in the blanks in each of the following statements:
	 * 
	 * A(n) "left brace and a(n) right brace" begin and end the body of every method.
	 * You can use the "if" statement to make decisions.
	 * "//" begins an end-of-line comment.
	 * "tabs, spaces, newlines" are called white space.
	 * "keywords" are reserved for use by Java.
	 * Java applications begin execution at method "main".
	 * Methods "printf, println, and print" display information in a command window"
	 * 
	 * State whether each of the following is true or false. If false, explain why.
	 * 
	 * Comments cause the computer to display the text after the // on the screen when the program executes.
	 * False. The computer does not display the text after the //. The text are comments that help guide the programmer/reviewer in navigating the code.
	 * 
	 * All variables must be given a type when they are declared.
	 * True.
	 * 
	 * Java considers the variables "number" and "NuMbEr" to be identical.
	 * False. The byte code for the variables are different. Also, variables, unless constants, should not be capitilized, just camelcased.
	 * 
	 * The remainder operator (%) can be used only with integer operands.
	 * False. The remainder operator can be used with a variety of operands.
	 * 
	 * The arithmetic operators *, /, %, + and - all have the same level of precedence. 
	 * False. *, / and % have a higher precedence over + and -.
	 * 
	 * The identifier _ (underscore) is valid in Java 9. 
	 * False. 
	 *  
	 */
	
	public static void main(String[] args) {
		int c = 0;
		int thisIsAVariable = 0;
		int q76354 = 0;
		int number = 0;
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a number: ");
		int value = input.nextInt();
		
		System.out.println("This is a Java program");
		
		System.out.printf("%s%n%s%n", "This is a Java", "program");
		
		if(number != 7) {
			System.out.println("The variable is not equal to 7");
		}
		
		if (c < 7) {
			System.out.println("c is less than 7");
		}
		
		if (c >= 7) {
			System.out.println("C is greater than or equal to 7");
		}
		
		System.out.println("This program will calculate the product of three Integers!");
		System.out.printf("%nPlease enter the first integer: ");
		int x = input.nextInt();
		System.out.printf("Please enter the second integer: ");
		int y = input.nextInt();
		System.out.printf("Please enter the third integer: ");
		int z = input.nextInt();
		int result = x * y * z;
		System.out.printf("%nThe product of all three integers is: %d", result);

		
	}

}
