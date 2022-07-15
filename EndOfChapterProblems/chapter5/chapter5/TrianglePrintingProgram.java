package chapter5;

public class TrianglePrintingProgram {

	public static void main(String[] args) {

		for(int newLine = 1; newLine <= 10; newLine++) {
			for(int stars = 1; stars <=newLine; stars++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int newLine = 1; newLine <= 10; newLine++) {
			for(int stars = 10; stars >= newLine; stars--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int newLine = 0; newLine < 10; newLine++) {
			for(int space = 1; space < newLine+1; space++) {
				System.out.print(" ");
			}
			for(int star = 10; star > newLine; star--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int newLine = 0; newLine < 10; newLine++) {
			for(int space = 10; space > newLine; space--) {
				System.out.print(" ");
			}
			for(int stars = 1; stars < newLine+1; stars++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}









