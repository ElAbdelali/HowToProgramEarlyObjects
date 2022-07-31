package chapter14exercise4;
/*
 * 14.4 (Comparing Portions of Strings) Write an application that uses String method region-Matches to compare 
 * two strings input by the user. 
 * The application should input the number of characters to be compared and the starting index of the comparison. 
 * The application should state
 * whether the compared characters are equal. Ignore the case of the characters when performing the
 * comparison.
 */
import java.util.Scanner;

public class RegionMatches {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("String 1: ");
		String s1 = input.nextLine();

		System.out.print("String 2: ");
		String s2 = input.nextLine();

		if(s1.regionMatches(true, 0, s2, 0, s1.length())){
			System.out.printf("s1 matches s2");
		}else {
			System.out.printf("s1 does not match s2");
		}
		input.close();
	}
}
