package chapterExamples;

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

}
