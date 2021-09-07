import java.util.Scanner;

public class PortfolioDriver {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("How much do you have to invest in your portfolio at this time? ");
		double initialBalance = Double.parseDouble(in.nextLine());
		
		System.out.println("What is your expected annual rate of return? A typical rate is 0.07.");
		double rateReturn = Double.parseDouble(in.nextLine());
		
		System.out.println("How many years will you let your portfolio grow?");
		int years = Integer.parseInt(in.nextLine());
		
		System.out.println("How much will you contribute every year to your portfolio?");
		double contr = Double.parseDouble(in.nextLine());
		
		System.out.print("After " + years + " years your portfolio will contain: $");
		
		Portfolio myPortfolio = new Portfolio(rateReturn, initialBalance);
		myPortfolio.growPortfolio(years, contr);
		System.out.println(myPortfolio.getBalance());
	}
}