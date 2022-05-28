package chapterExamples;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class DuplicateElimination {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] array = new int[10];
		System.out.printf("The initilized Array values:%n%n");
		for(int value = 0; value < array.length; value++) {
			array[value] = -1;
			System.out.printf("Index: %d Element: %d%n", value, array[value] );

		}
		System.out.printf("%nProgram asking user to input values: %n%n");
		for(int value = 0; value < array.length; value++) {
			System.out.printf("Please enter a number between 10-100: ");
			array[value] = input.nextInt();
			if(array[value] <= 10 || array[value] >= 100) {
				System.out.printf("The number (%d) you entered is not between 10-100.%n"
						+ "Please enter a valid number between 10-100: ", array[value]);
				array[value] = input.nextInt();
			}
		}
		System.out.printf("%nValues input into Array:%n%n");
		for(int value = 0; value < array.length; value++) {
			System.out.printf("Index: %d Element: %d%n", value, array[value] );

		}
		System.out.println();
		Arrays.sort(array);
		System.out.printf("%nSorted Array values:%n%n");
		for(int value = 0; value < array.length; value++) {
			System.out.printf("Index: %d Element: %d%n", value, array[value] );

		}
		int length = array.length;
		System.out.printf("%nArray Values after Duplicate values are removed:%n%n");
		length = removeDuplicateInArray(array, array.length); // setting the array length to the returned length of the method 
		for(int value = 0; value < length; value++) {
			System.out.printf("Index: %d Element: %d%n", value, array[value] );

		}
	}
	public static int removeDuplicateInArray(int[] array, int length) {
		int lengthOfArray = length;
		if(lengthOfArray == 0 || lengthOfArray == 1) {
			return lengthOfArray;
		}
		int[] tempArray = array;
		int j = 0; // will hold array values
		for(int i = 0; i < lengthOfArray - 1; i++) {
			if(array[i] != array[i+1]) {
				tempArray[j++] = array[i];
			}
		}
		tempArray[j++] = array[length - 1];
		for(int i = 0; i < j; i++) {
			array[i] = tempArray[i];
		}
		return j;
		
	}

}

 