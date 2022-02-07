package chapterExamples;
import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Input a digit to get the sum of its values: ");
		int inputNum = input.nextInt();
		
		int SumOfDigits = SumOfDigits(inputNum);
		System.out.printf("The sum of the input value is:  %d", SumOfDigits);
		

	}
	public static int SumOfDigits(int inputNum) {
		int total = 0;
		int remainder = 0;
		
		while(inputNum > 0) {
			remainder = inputNum % 10;
			total += remainder;
			inputNum /= 10;
		}
		return total;
	}
}
