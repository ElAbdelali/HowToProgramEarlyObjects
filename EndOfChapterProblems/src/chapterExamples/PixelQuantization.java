package chapterExamples;

public class PixelQuantization {
	
	public static void main(String[] args) {
		int startingPixel = 10;
		int additionalPixels = 20;
		
		int[] pixelQuantization = new int[200];
		
		for(int index = 0; index < pixelQuantization.length; index++) {
			pixelQuantization[index] = startingPixel;

			if((index + 1) % 20 == 0) {
				startingPixel+=additionalPixels;
			}
		}
		
		System.out.printf("The values of the array are:%n");
		for(int value = 0; value < pixelQuantization.length; value++) { 
		System.out.printf("Index:     Array Value:%n%5d%10d%n ", value+1, pixelQuantization[value]);
		}
		
	}
}
