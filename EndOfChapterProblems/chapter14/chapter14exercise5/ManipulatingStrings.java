package chapter14exercise5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ManipulatingStrings {
	public static boolean checkContainsSpecial(String item){
		Pattern regex = Pattern.compile("[^A-Za-z0-9]");
		Matcher matcher = regex.matcher(item);
        return matcher.find();
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		int specialCharacters = 0;
		int withoutSpecialCharacters = 0;
		
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
		ArrayList<String> with = new ArrayList<>();
		ArrayList<String> without = new ArrayList<>();
		
		for(int i = 0; i < stringArray.length; i++) {
			if(checkContainsSpecial(stringArray[i])) {
				with.add(stringArray[i].replace(stringArray[i].substring(0, 1), stringArray[i].substring(0, 1).toUpperCase()) );
				specialCharacters++;
			}
			else {
				without.add(stringArray[i].replace(stringArray[i].substring(0, 1), stringArray[i].substring(0, 1).toUpperCase()));
				withoutSpecialCharacters++;
				
			}
		}
		;
		System.out.printf("%n%s: %d%n%s %n%s: %d%n%s", "Strings with Special Characters", specialCharacters, with.toString(), "Strings with no Special Characters", withoutSpecialCharacters, without.toString());

	}

}
