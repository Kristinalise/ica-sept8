public class Portfolio {

	private double annualRateReturn;
	private double balance;
	private double initialBalance;
	
	public Portfolio(double theAnnualReturn, double theInitialBalance) {
		annualRateReturn = theAnnualReturn;
		balance = theInitialBalance;
		initialBalance = theInitialBalance;
	}
	
	public void growPortfolio(int years, double yearlyContribution) {
		for(int i = 0; i < years; i++) {
			balance += yearlyContribution;
			balance *= (annualRateReturn + 1);
		}
	}
		
	public double getBalance() {
		return balance;
	}

	public double getRate() {
		return annualRateReturn;
	}

	public void setBalance(double theNewBalance){
		balance = theNewBalance;
	}	

	public void setRate(double theNewRate){
		annualRateReturn = theNewRate;
	}

	public void resetBalance() {
		balance = initialBalance;
	}
}
