package chapterExamples;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to Guess the Number!");
		System.out.printf("%nPlease guess a number 1 - 1000: ");
		int input = scan.nextInt();
		int numToBeGuessed = random.nextInt(1000) + 1;
		
			if(scan.nextInt() != numToBeGuessed) {
				if( input < numToBeGuessed) {
					System.out.print("Too low, try again: ");
					input = scan.nextInt();
					}
				if( input > numToBeGuessed) {
					System.out.print("Too High, try again: ");
					input = scan.nextInt();
					}
				else{
					System.out.print("Congratulations. You guessed the number!");
					}
				}
			
		}
}