package chapterExamples;

public class TrianglePrintingProgram {

	public static void main(String[] args) {
		int s = 0;

		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int k = 1; k <= 10; k++) {
			for(int l = 10; l>=k; l--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		while(s <= 10) {
			for(int spaces = 0; spaces <= 9; spaces++) {
				for(int stars = 1; stars <= 10-s; stars--){
					System.out.print("*");
				}
				System.out.print(" ");
			}
			System.out.println();
			s++;
		}
		/*for(int p = 1; p <= 10; p++) {
			for(int q = 9; q >= p; q--) {
				for(int r = 1; r <= 10; r++) {
					System.out.print("*");
				}
				System.out.print(" ");
			}
			System.out.println();
		}*/
	}

}

	/* m = println, n = star, o = space
	 * m = 1 	n = 10 	o = 0
	 * m = 2 	n = 9 	o = 1
	 * m = 3 	n = 8 	o = 2
	 * m = 4 	n = 7	o = 3
	 * m = 5 	n = 6 	o = 4
	 * m = 6 	n = 5	o = 5
	 * m = 7 	n = 4	o = 6
	 * m = 8 	n = 3	o = 7
	 * m = 9 	n = 2	o = 8
	 * m = 10 	n = 1	o = 9
	 * */