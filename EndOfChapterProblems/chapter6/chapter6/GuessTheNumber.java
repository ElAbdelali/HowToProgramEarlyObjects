package chapter6;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to Guess the Number!");
		System.out.printf("%nPlease guess a number between 1 - 1000: ");
		int input = scan.nextInt();
		int numToBeGuessed = random.nextInt(1000) + 1;
		int exitTheGame = (-1);
		int continueTheGame = (-2);
		int counter = 0;
		
		/*
		 * We want the code to display 2 things if input != numtobeguessed
		 * 1. output "too high. Try again" if input > numTobeGuessed
		 * 2. output "too low. Try again" if input < numToBeGuessed
		 * 
		 * if num == numtobeguessed then display:
		 * 1. output "congratulations. You guessed the number!" 
		 * 2. an option to play again or exit
		 */
		
		while(input != exitTheGame) {
			if(input < numToBeGuessed) {
				System.out.printf("Too low.%nTry again: ");
				input = scan.nextInt();
				counter++;
			}
			if(input > numToBeGuessed) {
				System.out.printf("Too high.%nTry again: ");
				input = scan.nextInt();
				counter++;
			}
			if(input == numToBeGuessed) {
				System.out.printf("Congratulations. You guessed the number!");
				counter++;
				System.out.printf("%nEnter (-1) if you'd like to leave "
						+ "the game or (-2) if you'd like to continue: ");
				input = scan.nextInt();
				if(input == continueTheGame) {
					counter = 0;
					numToBeGuessed = random.nextInt(1000) + 1;
					System.out.print("Welcome back to the Game!"
							+ " Please guess a number between 1 - 1000: ");
					input = scan.nextInt();
				}
			}
		}
		if(counter <= 10) {
			System.out.printf("You guessed the number in %d tries. "
					+ "Either you know the Secret or got Lucky!", counter);
		}
		if(counter == 10) {
			System.out.printf("%nYou guessed the number in %d tries. Aha! You know the secret!", counter);
		}
		if(counter > 10) {
			System.out.printf("You guessed the number in %d tries. You should be able to do better!", counter);
		}

				
			
		}
}