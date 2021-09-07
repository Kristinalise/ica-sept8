public class RetirementCalculator {

	private Portfolio pf;
	private double income;
	private double percent = 0.7;
	private double yearlyContr;
	private int currentAge;
	private int retirementAge;
	private int ageOfDeath;
	
	public RetirementCalculator(Portfolio thePf, double theIncome, double theYearlyContr, int theCurrentAge, int theRetirementAge, int theAgeOfDeath) {
		pf = thePf;
		income = theIncome;
		yearlyContr = theYearlyContr;
		currentAge = theCurrentAge;
		retirementAge = theRetirementAge;
		ageOfDeath = theAgeOfDeath;
	}
	
	private double retirementIncome() {
		return income * percent;
	}
	
	private int yearsToRetirement() {
		return retirementAge - currentAge;
	}
	
	private double moneyNeededForRetirement() {
		int years = ageOfDeath - retirementAge;
		return this.retirementIncome() * years;
	}
	
	public void readyForRetirement() {
		pf.growPortfolio(this.yearsToRetirement(), yearlyContr);
		double balance = pf.getBalance();
		double money = this.moneyNeededForRetirement();
		if(balance >= money) {
			System.out.println("Yes, you're ready! You need $" + money + " and you're on track to make $" + balance);
		}else {
			System.out.println("No, you're not ready! You need $" + money + " and you're on track to make $" + balance);
		}
	}
	
}