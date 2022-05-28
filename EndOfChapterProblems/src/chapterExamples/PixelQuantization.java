package chapterExamples;

import java.util.ArrayList;

/*
 * the array index 0 - 20 display a value of 10
 * the array index 21 - 40 display a value of 30
 * the array index 41 - 60 display a value of 50
 * the array index 61 - 80 display a value of 70
 * the array index 81 - 100 display a value of 90
 * the array index 101 - 120 display a value of 110
 * the array index 121 - 140 display a value of 130
 * the array index 141 - 160 display a value of 150
 * the array index 161 - 180 display a value of 170
 * for all other index values, assume 190.

 */

public class PixelQuantization {
	
	public static void main(String[] args) {
		ArrayList<Integer> listOfPixelValue = new ArrayList();
		
		for(int count = 0; count < 20; count++) {
			listOfPixelValue.add(10);
		}
		for(int count = 0; count < 20; count++) {
			listOfPixelValue.add(30);
		}
		for(int count = 0; count <  20; count++) {
			listOfPixelValue.add(50);
		}
		for(int count = 0; count < 20; count++) {
			listOfPixelValue.add(70);
		}
		for(int count = 0; count < 20; count++) {
			listOfPixelValue.add(90);
		}
		for(int count = 0; count < 20; count++) {
			listOfPixelValue.add(110);
		}
		for(int count = 0; count < 20; count++) {
			listOfPixelValue.add(130);
		}
		for(int count = 0; count < 20; count++) {
			listOfPixelValue.add(150);
		}
		for(int count = 0; count < 20; count++) {
			listOfPixelValue.add(170);
		}
		for(int count = 0; count < 20; count++) {
			listOfPixelValue.add(190);
		}
		
		System.out.printf("The total elements in the Array is: %d", listOfPixelValue.size());
		
		for(int counter = 0; counter < listOfPixelValue.size(); counter++) {
			System.out.printf("%nPosition of Element: %4d Element "
					+ "Value: %d", counter, listOfPixelValue.get(counter));
		}
	}
}
