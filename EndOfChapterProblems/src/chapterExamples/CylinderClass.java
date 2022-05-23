package chapterExamples;
import java.math.BigDecimal;

public class CylinderClass {
	
	public static double volume(int radius, int height) {
		double volume = (double) ((radius * radius) * Math.PI * height);
		return volume;
	}

	
	public static void main(String[] args) {
		double volume = volume(3,3);
		
		System.out.printf("The volume is: %.02f", volume);
	}

}
