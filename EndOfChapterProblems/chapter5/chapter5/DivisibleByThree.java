package chapter5;

public class DivisibleByThree {

	public static void main(String[] args) {
		int sum = 0;
		System.out.print("The following numbers (1-30) are divisisble by three:");
		for(int i = 1; i<=30; i++) {
			if(i%3 == 0) {
				sum+=i;
				System.out.print(" " + i);
			}
		}
		System.out.printf("%nThe total sum is: %d", sum);

	}

}
