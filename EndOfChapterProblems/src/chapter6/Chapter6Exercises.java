package chapter6;
/*
 	Give the method header for each of the following methods:
	a) Method hypotenuse, which takes two double-precision, floating-point arguments
	side1 and side2 and returns a double-precision, floating-point result.
	b) Method smallest, which takes three integers x, y and z and returns an integer.
	c) Method instructions, which does not take any arguments and does not return a value.
	[Note: Such methods are commonly used to display instructions to a user.]
	d) Method intToFloat, which takes integer argument number and returns a float.
 
 
 */
public class Chapter6Exercises {

	public static void main(String[] args) {
		
		hypotenuse(3,2);
		smallest(1,2,3);
		instructions();
		intToFloat(12);
		double x = Math.ceil(-Math.abs(-3 + Math.floor(-2.5)));
		
		System.out.println(x);
	}
	
	private static double hypotenuse(double side1, double side2) {
		double hypotenuse = Math.sqrt(Math.pow(side1, 2)+Math.pow(side2, 2));
		System.out.println(hypotenuse);
		return hypotenuse;
	}
	private static int smallest(int x, int y, int z) {
		int least = x;
		
		if(y < least) {
			least = y;
		}
		if(z < least) {
			least = z;
		}
		System.out.println(least);
		return least;
	}
	private static void instructions() {
		 System.out.println("Here's an example");
	}
	
	private static float intToFloat(int x) {
		return (float) x;
	}
}
