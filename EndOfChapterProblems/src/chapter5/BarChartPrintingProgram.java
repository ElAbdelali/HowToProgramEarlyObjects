package chapter5;
import java.util.Scanner;

public class BarChartPrintingProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		int[] inputs = new int[5];
		System.out.println("Welcome to the Bar Chart Printing Program!");
	
		for(int x = 0; x < 5; x++) {
			System.out.printf("Please enter a value between 1-30: ");
				inputs[x] = input.nextInt();
				}
		for(int x = 0; x < inputs.length; x++) {
			for(int y = 0; y <= inputs[x] - 1; y++){
				System.out.print("*");
			}
			System.out.println();
		}
			
	}

}
