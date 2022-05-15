package chapterExamples;

public class PerfectNumber {

	public static void main(String[] args) {
				
		for(int i = 1; i <= 1000; i++) {
			perfectNumber(i);
		}
	

	} 
	public static int perfectNumber(int isPerfectNumber) {
		int sum = 0;
		for(int i = 1; i <= isPerfectNumber; i++) {
			if(isPerfectNumber % i == 0 && isPerfectNumber != i) {
				sum+=i;
			}
		}
		if(sum == isPerfectNumber) {
			System.out.printf("%d is a Perfect Number!%n", sum);
		}
		return sum;
	}
}

/*
 * Check to see if a number in between 1-1000 is a perfect number
 * 
 * 
 * 
 * 				System.out.print(i);

 * 
 * 
 */