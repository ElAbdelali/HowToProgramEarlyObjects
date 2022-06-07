package chapter6;
import java.util.Scanner;


public class SportsRecommender {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		
		System.out.printf("Enter the degrees in Celsius: " );
		int degrees = input.nextInt();
		weather(degrees);
		
		
	}
	public static int weather(int degreesCelsius) {
		if(degreesCelsius <= 30 && degreesCelsius >= 20) {
			System.out.println("It's lovely weather for sports today!");
		}else if(degreesCelsius >= 10 && degreesCelsius <= 40) {
			System.out.println("It's reasonable for sports today");
		}else{
			System.out.println("Please exercise with care today, watch out for the weather!");
		}
		return degreesCelsius;
	}

}
