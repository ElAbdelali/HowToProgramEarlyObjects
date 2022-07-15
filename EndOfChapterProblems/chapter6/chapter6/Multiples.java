package chapter6;
import java.util.Scanner;
public class Multiples {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Please enter a Integer: ");
		int firstInt = input.nextInt();
		System.out.printf("Please enter a second Integer: ");
		int secondInt = input.nextInt();
		
		isMultiple(firstInt, secondInt);

	}
	public static void isMultiple(int firstInt, int secondInt) {
		
		if(firstInt % secondInt == 0) {
			System.out.printf("%d is a multiple of %d.", secondInt, firstInt);
		}else {
			System.out.printf("%d is not a multiple of %d.", secondInt, firstInt);
		}
		
	}
}
