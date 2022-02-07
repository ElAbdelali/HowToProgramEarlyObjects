
package chapterExamples;
import java.util.Scanner;

public class FloorAndCeil {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int intFloorInput = 0;
		int intCeilInput = 0;
		System.out.printf("Please enter a number: ");
		double doubleInput = input.nextDouble();
		
		intFloorInput = (int) myFloor(doubleInput);
		intCeilInput = (int) myCeil(doubleInput);
		
		System.out.printf("The Floor for the number you entered is: %d%n", intFloorInput);
		System.out.printf("The Ceiling for the number you entered is: %d", intCeilInput);

		
		
		
	}
	public static double myFloor(double doubleInput) {
		int floorInput = ((int) doubleInput);
		
		return floorInput;
	}
	public static double myCeil(double doubleInput) {
		int ceilInput = ((int) doubleInput);
		
		return ceilInput + 1;
	}
}
