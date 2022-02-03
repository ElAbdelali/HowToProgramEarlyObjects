package chapterExamples;

public class TabularOutput {

	public static void main(String[] args) {
		System.out.printf("N\tN2\tN3\tN4%n");
		for (int number = 1; number <= 5; number++) {
			System.out.printf("%d\t%d\t%d\t%d%n",
					(number), (number*number), (number*number*number), (number*number*number*number));
			
		}

	}

}
