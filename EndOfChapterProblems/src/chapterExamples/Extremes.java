package chapterExamples;
import java.util.Scanner;
public class Extremes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int maximum = 0;
		int minimum = 0;
		int sum = 0;
	
		System.out.printf("Please enter 10 integer values %n");
		for (int counter = 1; counter <= 10; counter++) { // for iteration till counter reaches 10
			System.out.printf("Please enter the %d value: ", counter); // asks user to enter 10 values
			int inputValue = input.nextInt(); // assigns values input to int var inputValue
			if(inputValue >= maximum){ // if the inputValue >= maximum (0) maximum = 
				maximum = inputValue;
			}
			if(minimum == 0 /*|| inputValue <= minimum*/) {
				minimum = inputValue;
			}
			if(inputValue <= minimum) {
				 minimum = inputValue;
			}
			sum = minimum + maximum;
		}
		System.out.printf("The sum of the maximum number input, %d, and "
				+ "minimum number input, %d, is: %d", maximum, minimum, sum);
	}

}
