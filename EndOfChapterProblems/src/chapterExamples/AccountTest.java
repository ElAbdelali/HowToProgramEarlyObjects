package chapterExamples;

import java.util.Scanner;

public class AccountTest {
public static void main(String[] args) {
   Account account1 = new Account("Jane Green", 50.00);
   Account account2 = new Account("John Blue", 7.53); 

   Account.displayAccount(account1);
   Account.displayAccount(account2);

   // create a Scanner to obtain input from the command window
   Scanner input = new Scanner(System.in);

   System.out.print("Enter deposit amount for account1: "); // prompt
   double depositAmount = input.nextDouble(); // obtain user input
   System.out.printf("%nadding %.2f to account1 balance%n%n", 
      depositAmount);
   account1.deposit(depositAmount); // add to account1's balance

   // display balances
   Account.displayAccount(account1);
   Account.displayAccount(account2);

   System.out.print("Enter deposit amount for account2: "); // prompt
   depositAmount = input.nextDouble(); // obtain user input
   System.out.printf("%nadding %.2f to account2 balance%n%n", 
      depositAmount);
   account2.deposit(depositAmount); // add to account2 balance

   // display balances
   Account.displayAccount(account1);
   Account.displayAccount(account2);

   System.out.printf("Enter withdraw amount for account1: ");
   double withdrawAmount = input.nextDouble();
   System.out.printf("%nsubtracting %.2f from account1 balance%n%n", withdrawAmount);
   account1.withdraw(withdrawAmount);

   // display balances
   Account.displayAccount(account1);
   Account.displayAccount(account2);

   System.out.printf("Enter withdraw amount for account2: ");
   withdrawAmount = input.nextDouble();
   System.out.printf("%nSubtracting %.2f from account2 balance%n%n", withdrawAmount);
   account2.withdraw(withdrawAmount);

   // display balances
   Account.displayAccount(account1);
   Account.displayAccount(account2);
      
   
   
	} 	
} 

