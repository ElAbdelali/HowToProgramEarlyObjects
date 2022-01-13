package chapterExamples;

import java.util.Scanner;

public class HeartRatesTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your first name?");
		String fName = input.nextLine();
		
		System.out.println("What is your last name?");
		String lName = input.nextLine();
		
		System.out.print("Enter Date of birth dd mm yyyy: ");
        int[] tmpdob = new int[3];

        for(int i=0; i<3; i++){
            tmpdob[i] = input.nextInt();
        }
        
        HeartRates user1 = new HeartRates(fName, lName, tmpdob[0], tmpdob[1], tmpdob[2]);
        printInfo(user1);
        input.close();
	}
        private static void printInfo(HeartRates user){
            System.out.printf("%s %s\n%s - %d years of age\nMax HeartRate: %d\n",
                    user.getFirstName(), user.getLastName(), user.getDateOfBirth(),
                    user.getAge(), user.maxHeartRate());

            System.out.printf("Target Heart Rate Range: %s\n", user.targetHeartRate());
	}

}
