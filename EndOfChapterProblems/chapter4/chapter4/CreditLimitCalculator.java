package chapter4;

public class CreditLimitCalculator {
	int accountNum;
	int begBal;
	int totalMonthCharge;
	int totalCreditCharge;
	int creditLimit;
	
	public CreditLimitCalculator(int accountNum, int begBal, int totalMonthCharge, int totalCreditCharge, int creditLimit){
		this.accountNum = accountNum;
		this.begBal = begBal;
		this.creditLimit = creditLimit;
		this.totalCreditCharge = totalCreditCharge;
		this.totalMonthCharge = totalMonthCharge;
	}

	public int getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}

	public int getBegBal() {
		return begBal;
	}

	public void setBegBal(int begBal) {
		this.begBal = begBal;
	}

	public int getTotalMonthCharge() {
		return totalMonthCharge;
	}

	public void setTotalMonthCharge(int totalMonthCharge) {
		this.totalMonthCharge = totalMonthCharge;
	}

	public int getTotalCreditCharge() {
		return totalCreditCharge;
	}

	public void setTotalCreditCharge(int totalCreditCharge) {
		this.totalCreditCharge = totalCreditCharge;
	}

	public int getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(int creditLimit) {
		this.creditLimit = creditLimit;
	}
	public static void CreditLimitStatus(CreditLimitCalculator creditStatus) {
		double availableCredit = (creditStatus.getBegBal() + creditStatus.getTotalMonthCharge() - creditStatus.getTotalCreditCharge());
		if(creditStatus.getCreditLimit() > availableCredit) {
			System.out.printf("You're in good standing.%n");
		}
		else {
			System.out.printf("You are not in good standing, Credit limit exceeded by: $%.2f%n", availableCredit);
		}
	}

}
