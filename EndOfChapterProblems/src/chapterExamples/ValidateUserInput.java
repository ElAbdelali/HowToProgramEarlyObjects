package chapterExamples;

import java.util.Scanner;

public class ValidateUserInput {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int counterPass = 0;
		int counterFail = 0;
		int counter = 1;
		int grade;
		
		while(counter <= 10) {
			System.out.printf("Please enter a 1 for passing grade and 2 for failing grade: ");
			grade = input.nextInt();
			if(grade == 1) {
				counterPass++;
				counter++;
			}
			else if(grade == 2) {
				counterFail++;
				counter++;
			}
			else if(grade != 1 || grade != 2){
				System.out.printf("Please enter a correct value.%n");
			}
		}
		if(counterPass >= 8) {
			System.out.println("Instructor deserves a raise!");
		}
		System.out.printf("Passes: %d Fails: %d", counterPass, counterFail);
	}

}
