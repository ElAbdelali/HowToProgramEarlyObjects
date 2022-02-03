package chapterExamples;

public class TabularOutput {

	public static void main(String[] args) {
		int number = 1;
		System.out.printf("N\tN2\tN3\tN4%n");
		while(number <= 5) {
			System.out.printf("%d\t%d\t%d\t%d%n",
				(number), (number*number), (number*number*number), (number*number*number*number));
			number++;
			
		}

	}

}
