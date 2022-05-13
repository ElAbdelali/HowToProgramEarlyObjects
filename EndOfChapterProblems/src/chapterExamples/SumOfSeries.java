package chapterExamples;

public class SumOfSeries {

	public static void main(String[] args) {
		
		long sum = 0;
		
		for(long i = 1; i <= 100; i++) {
			sum += i;
		}
		
		System.out.printf("The total summation of the sequence of numbers ranging from 1-100 is: %d", sum);

	}
// The problem that one runs into when finding the product of (1-100) is that it is larger than the value long can store.
}
