package chapter5;
import java.util.Scanner;

public class ModifiedDiamondPrintingProgram {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a value between 1-19: ");
		int value = input.nextInt();
		
		if(value > 19 || value < 1) {
			System.out.print("Please enter a valid value between 1-19: ");
			value = input.nextInt();
		}
		
		for(int i = 1; i <= value - 1; i++) { //newlines
			for(int j = 1; j <= value - i; j++){ //spaces
				System.out.print(" ");			
				}
			for(int k = 1; k <= 2*i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = value - 2; i >= 1; i--) {
			for(int j = 1; j <= value-i; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= 2*i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
