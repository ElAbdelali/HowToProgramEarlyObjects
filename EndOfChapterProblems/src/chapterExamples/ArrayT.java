package chapterExamples;

public class ArrayT {

	public static void main(String[] args) {
		
		int[][] t = {{1,2,3}, {4,5,6}}; // Creating a 2 by 3 Array that consists of 2 columns with 3 rows and 6 elements in total
	      System.out.println("Values in array1 by row are");
	      
	      t[0][0] = 2; // Changing the element in row 1 column 1 using array access expressions
	      t[0][1] = 3; // Changing the element in row 1 column 2 using array access expressions
	      t[0][2] = 4; // Changing the element in row 1 column 3 using array access expressions
	      t[0][1] = 600; // Changing the element in row 1 column 2 using array access expressions
	      t[1][1] = 1200; // Changing the element in row 2 column 2 using array access expressions
	      t[0][1] = 0; //Write a single statement that sets the element of t in row 0 and column 1 to zero.
	      outputArray(t);
		
	}
	 public static void outputArray(int[][] t) {                           
		 for (int row = 0; row < t.length; row++) {                                   
			 for (int column = 0; column < t[row].length; column++) {
				 System.out.printf("%d  ", t[row][column]);           
				 }
			 System.out.println();
			 }
		 }
	}
