package chapter5;

public class DiamondPrintingProgram {

	public static void main(String[] args) {
		
		int newLine = 5; 
		
		for(int i = 1; i <= newLine; i++) {
			for(int j = 1; j <= newLine - i; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= 2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = newLine - 1; i >= 1; i--) {
			for(int j = 1; j <= newLine - i; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i*2-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

/* newLine = 1	space = 4 	star = 1
 * newLine = 2 	space = 3	star = 3
 * newLine = 3	space = 2	star = 5
 * newLine = 4	space = 1	star = 7
 * newLine = 5 	space = 0	star = 9
 * 
 */



