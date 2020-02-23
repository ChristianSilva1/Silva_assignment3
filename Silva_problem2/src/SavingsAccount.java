//SavingsAccount is a public class
public class SavingsAccount {
//annualInterestRate is a private class variable
	private static double annualInterestRate;
	//savingsBalance is a private instance variable
	private double savingsBalance;  

	public double calculateMonthlyInterest() {
		//calculateMonthlyInterest is a public instance method
		savingsBalance = savingsBalance+(savingsBalance * annualInterestRate)/12;
		return savingsBalance;
	}
	
	public void modifyInterestRate(double newInterestRate) {
		// modifyInterestRate is a public class method
		annualInterestRate = newInterestRate;
	}
	
	public SavingsAccount(double originalBalance) {
		this.savingsBalance = originalBalance;
	}
	
	public double getBalance() {
		return savingsBalance;
	}
	
}
