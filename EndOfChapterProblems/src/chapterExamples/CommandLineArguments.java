package chapterExamples;

public class CommandLineArguments {

	public static void main(String[] args) {
		int arrayLength = args.length;
		int[] array = new int[arrayLength];
		
		for(int i = 0; i < arrayLength; i++) {
			array[i] = Integer.parseInt(args[i]);
		}
		int maximum = getMaximum(array);
		int minimum = getMinimum(array);
		int average = getAverage(maximum,minimum);
		
		System.out.printf("The average of %d and %d is: %d", maximum, minimum, average);
		
		}
	public static int getAverage(int x, int y) {
		int average = x+y/2;
		return average;
	}
	public static int getMaximum(int[] array) {
		int maximum = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(maximum < array[i]) {
				maximum = array[i];
			}
		}
		return maximum;
	}
	public static int getMinimum(int[] array) {
		int minimum = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(minimum > array[i]) {
				minimum = array[i];
			}
		}
		return minimum;
	}
}
/*
 * Input values taken in
 * 
 * need to get the maximum of the values passed in the commandline
 * need to get the minimum of the values passed in the commandline
 * 
 * need to compute the average of both values
 */