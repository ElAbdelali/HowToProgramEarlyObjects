package chapterExamples;

public class PixelQuantization {
	
	public static void main(String[] args) {
		int startingPixel = 10;
		int additionalPixels = 20;
		
		int[] pixelQuantization = new int[201];
		
		for(int index = 1; index < pixelQuantization.length; index++) {
			pixelQuantization[index] = startingPixel;

			if((index) % 20 == 0) {
				startingPixel+=additionalPixels;
			}
		}
		
		System.out.printf("The values of the array are:%n");
		for(int value = 0; value < pixelQuantization.length; value++) { 
		System.out.printf("Index:%d     Array Value:%d%n ", value, pixelQuantization[value]);
		}
		
	}
}
