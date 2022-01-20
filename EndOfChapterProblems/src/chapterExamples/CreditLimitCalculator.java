package chapterExamples;

public class CreditLimitCalculator {
	
	private int accNumber, beginBal, totalCharge, totalCredit, allowedCredit;
	
	public CreditLimitCalculator(int accNumber, int beginBal, int totalCharge, int totalCredit, int allowedCredit) {
		this.accNumber = accNumber;
		this.beginBal = beginBal;
		this.totalCharge = totalCharge;
		this.totalCredit = totalCredit;
		this.allowedCredit = allowedCredit;
	}

}
