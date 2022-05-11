package chapterExamples;

public class DepartmentStoreCustomers {

	public static void main(String[] args) {
		CreditLimitCalculator Jacob = new CreditLimitCalculator(1, 0, 7500, 1500, 5000);
		CreditLimitCalculator Evelyn = new CreditLimitCalculator(1, 2300, 3000, 5000, 5000);

		CreditLimitCalculator.CreditLimitStatus(Jacob);
		CreditLimitCalculator.CreditLimitStatus(Evelyn);

		
	}


}
