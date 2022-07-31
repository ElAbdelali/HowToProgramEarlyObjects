package chapter14exercise8;

import java.util.Scanner;

public class TokenizingTelephoneNumbers {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("Please enter a phone number in the following format: (xxx) xxx-xxxx: ");
		String phoneNum = scan.nextLine();
		
		String[] tokenizedPhoneNum = phoneNum.split("[ ()/-/]");
		
		String areaCode = tokenizedPhoneNum[1];
		String restOfPhoneNum = tokenizedPhoneNum[2].concat(tokenizedPhoneNum[3]);
		
		System.out.printf("Your area code is: %s%nThe Remainder is: %s", areaCode, restOfPhoneNum);
		scan.close();
	}
}
