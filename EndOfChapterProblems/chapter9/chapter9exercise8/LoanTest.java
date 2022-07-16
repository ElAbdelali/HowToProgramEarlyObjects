package chapter9exercise8;

import java.util.Scanner;

public class LoanTest {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double principal = 0;
		int tenure = 0;
		
		System.out.printf("%s%n%s",
				"Welcome to Loan Installment Calculator!", 
				"Please enter a value (1-3) to specify which loan you'd like to calculate: ");
		int conditional = scan.nextInt();
		
		if(conditional == 1) {
			HomeLoan homeLoan = new HomeLoan(principal, tenure);
			System.out.printf("%n%s%n%s%.2f%n","You've chosen to inquire about a home loan!", 
					"Our rate is the most competitive in the market sitting at: %", homeLoan.getHomeInterest());
			System.out.printf("Please enter the loan amount you are requesting: ");
			homeLoan.setPrincipal(scan.nextDouble());
			System.out.printf("Please enter the tenure in months: ");
			homeLoan.setTenure(scan.nextInt());
			
			System.out.printf("The payments made monthly are: %n");
			System.out.printf("%s%30s%n", "Month", "Installment Payment");
			for(int i = 1; i <= homeLoan.getTenure(); i++) {
				double p = homeLoan.getPrincipal();
				double r = homeLoan.getHomeInterest();
				double emi = (p * ((r * Math.pow((1+r), i)) / (Math.pow((1+r), i)-1)));
				System.out.printf("%5d%30.2f%n", i, emi);
			}
		}
		else if(conditional == 2) {
			VehicleLoan vehicleLoan = new VehicleLoan(principal, tenure);
			System.out.printf("%n%s%n%s%.2f%n","You've chosen to inquire about a Vehicle loan!", 
					"Our rate is the most competitive in the market sitting at: %", vehicleLoan.getVehicleInterest());
			System.out.printf("Please enter the loan amount you are requesting: ");
			vehicleLoan.setPrincipal(scan.nextDouble());
			System.out.printf("Please enter the tenure in months: ");
			vehicleLoan.setTenure(scan.nextInt());
			
			System.out.printf("The payments made monthly are: %n");
			System.out.printf("%s%30s%n", "Month", "Installment Payment");
			for(int i = 1; i <= vehicleLoan.getTenure(); i++) {
				double p = vehicleLoan.getPrincipal();
				double r = vehicleLoan.getVehicleInterest();
				double emi = (p * ((r * Math.pow((1+r), i)) / (Math.pow((1+r), i)-1)));
				System.out.printf("%5d%30.2f%n", i, emi);
			}
		}
		else if(conditional == 3) {
			PersonalLoan personalLoan = new PersonalLoan(principal, tenure);
			System.out.printf("%n%s%n%s%.2f%n","You've chosen to inquire about a Personal loan!", 
					"Our rate is the most competitive in the market sitting at: %", personalLoan.getPersonalInterest());
			System.out.printf("Please enter the loan amount you are requesting: ");
			personalLoan.setPrincipal(scan.nextDouble());
			System.out.printf("Please enter the tenure in months: ");
			personalLoan.setTenure(scan.nextInt());
			
			System.out.printf("The payments made monthly are: %n");
			System.out.printf("%s%30s%n", "Month", "Installment Payment");
			for(int i = 1; i <= personalLoan.getTenure(); i++) {
				double p = personalLoan.getPrincipal();
				double r = personalLoan.getPersonalInterest();
				double emi = (p * ((r * Math.pow((1+r), i)) / (Math.pow((1+r), i)-1)));
				System.out.printf("%5d%30.2f%n", i, emi);
			}
		}
		else {
			throw new IllegalArgumentException("Please enter a valid value (1-3).");
		}
		
	}

}
