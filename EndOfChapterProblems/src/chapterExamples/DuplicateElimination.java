package chapterExamples;
import java.util.Arrays;
import java.util.Scanner;
public class DuplicateElimination {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] array = new int[10];
		
		Arrays.fill(array, -1);
		
		for(int value = 0; value < array.length; value++) {
			System.out.printf("%d	%d%n", value, array[value]);
		}
		
		for(int inputValue = 0; inputValue < 10; inputValue++) {
			System.out.print("Please enter a value between 10-100:");
			array[inputValue] = input.nextInt();
			//if(input.nextInt() < 10 || input.nextInt() > 100) {
				//System.out.print("Please enter a valid value between 10-100: ");
				//array[inputValue] = input.nextInt();
			//}

		}
		for(int value = 0; value < array.length; value++) {
			System.out.printf("%d	%d%n", value, array[value]);
		}
	}

}
