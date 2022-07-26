package chapter14exercise5;

import java.util.ArrayList;
import java.util.Scanner;

public class ManipulatingStrings {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int specialCharacters = 0;
		int withoutSpecialCharacters = 0;
		String[] without = new String[0];
		String[] with = new String[0];
		ArrayList<String> inputs = new ArrayList<>();
		String input = "";
		

		while(!input.equals("#")) {
			System.out.print("Please enter a String or # to exit: ");
			input = scan.next();
			
			if(!input.equals("#")) {
				inputs.add(input);
			}
			
		}
		scan.close();
		String[] stringArray = inputs.toArray(new String[0]);

		
		for(int i = 0; i < stringArray.length; i++) {
			if(stringArray[i].matches("\\d\\w\\s")) {
				
				withoutSpecialCharacters++;
			}
			else {
				specialCharacters++;
			}
		}

	}
}
