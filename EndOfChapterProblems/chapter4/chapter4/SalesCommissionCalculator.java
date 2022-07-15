package chapter4;
import java.util.Scanner;
public class SalesCommissionCalculator {

	public static void main(String[] args) {
		int basePay = 200;
		double commission  = .09;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the number of Item One sold: ");
		int itemOneSold = input.nextInt();
		System.out.print("Please enter the number of Item Two sold: ");
		int itemTwoSold = input.nextInt();
		System.out.print("Please enter the number of Item Three sold: ");
		int itemThreeSold = input.nextInt();
		System.out.print("Please enter the number of Item Four sold: ");
		int itemFourSold = input.nextInt();
		
		SalesCommission sally = new SalesCommission("Sally GoodSon", 239.99, 129.75, 99.95,
				350.89);
		double commissionPay = (((itemOneSold * sally.getItemOnePrice()) + (itemTwoSold * sally.getItemTwoPrice()) +
				 (itemThreeSold * sally.getItemThreePrice()) + (itemFourSold * sally.getItemFourPrice())
				) * commission);
		double totalPay = ( commissionPay + ((double)(basePay)));
		
		System.out.printf("Item\tNumber Sold%n"
				       +  "One\t%d%n"
				       +  "Two\t%d%n"
				       +  "Three\t%d%n"
				       +  "Four\t%d%n", 
				       itemOneSold, itemTwoSold, itemThreeSold, itemFourSold);
		System.out.printf("The amount %s made on commission was: $%.2f%n", sally.getName(),commissionPay);
		System.out.printf("The total amount %s made for the week was: $%.2f", sally.getName(), totalPay);
	}
	
}
