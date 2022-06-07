package chapter7;

public class VariableLengthArgumentList {

	public static void main(String[] args) {
		System.out.printf("%d%n", average(13,14,15,11,16,19));
		System.out.printf("%d%n", average(13,14,15,11,16,19,20,18));
		System.out.printf("%d%n", average(13,14,15,11,16,19,20,18,20,22));



	}
	public static int average(int... numbers) {
		
		int total = 0;
		
		for(int num : numbers) {
			total += num;
		}
		return total/numbers.length;
	}

}
