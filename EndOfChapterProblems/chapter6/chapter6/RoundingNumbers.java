package chapter6;

public class RoundingNumbers {

	public static void main(String[] args) {
		roundToInteger(893);
		roundToTenths(23);
		roundToHundreths(439);
		roundToThousandths(34833);

	}
	
	public static double roundToInteger(int x) {
		double y = Math.floor(x + 0.5);
		System.out.printf("Original value: %d Rounded value: %f", x, y);
		return y;
	}
	public static double roundToTenths(int x) {
		double y = Math.floor((x * 10 + 0.5) / 10);
		System.out.printf("%nOriginal value: %d Rounded value: %f", x, y);
		return y;
	}
	public static double roundToHundreths(int x) {
		double y = Math.floor((x * 100 + 0.5) / 100);
		System.out.printf("%nOriginal value: %d Rounded value: %f", x, y);
		return y;
	}
	public static double roundToThousandths(int x) {
		double y = Math.floor((x * 1000 + 0.5) / 1000);
		System.out.printf("%nOriginal value: %d Rounded value: %f", x, y);
		return y;
	}

}
