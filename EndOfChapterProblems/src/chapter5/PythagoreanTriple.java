package chapter5;

public class PythagoreanTriple {

	public static void main(String[] args) {
		System.out.printf("side1\tside2\thypotenuse%n");
		for(int hypotenuse = 1; hypotenuse <= 500; hypotenuse++) {
			for(int sideLength1 = 1; sideLength1 <= 500; sideLength1++) {
				for(int sideLength2 = 1; sideLength2 <= 500; sideLength2++) {
					if(((Math.pow(sideLength1, 2) == ((Math.pow(hypotenuse, 2)) -
							Math.pow(sideLength2, 2))))){
						System.out.printf("%d\t%d\t%d%n", sideLength1, sideLength2, 
								hypotenuse);
					}
				}
			}
		}	
	}
}
