//Test program is in a public class called SavingsAccountTest
public class SavingsAccountTest {

	public static void main(String[] args) {
		//Test program instantiates two SavingsAccount objects
		SavingsAccount saver1 = new SavingsAccount(2000.00);
		SavingsAccount saver2 = new SavingsAccount(3000.00);
		
		System.out.println("Month          saver1     saver2"); 
		System.out.println("Start Balance: " + String.format("%.2f",saver1.getBalance()) + " " + String.format("%10.2f",saver2.getBalance()) + "\n");
		System.out.println("Table of Monthly balance for 12 months at 4% interest\n");
		//Test program sets the annualInterestRate to 4%
		saver1.modifyInterestRate(0.04);
		saver2.modifyInterestRate(0.04);
		for(int i = 1; i <=12; i++) {
			//Test program calculates the monthly interest for each of the 12 months and prints the monthly balances for both SavingsAccount instances as a table
			System.out.println("Month " + String.format("%5d", i) + " " + String.format("%10.2f",saver1.calculateMonthlyInterest()) + " " + String.format("%10.2f",saver2.calculateMonthlyInterest()));
					
		}
		 //Test program sets the annualInterestRate to 5%
		//Test program calculates the monthly interest for the next month's interest and prints the balances for both SavingsAccount instances.
		System.out.println("\nInterest rate increased to 5 percent...");
		saver1.modifyInterestRate(0.05);
		saver2.modifyInterestRate(0.05);
		System.out.println("\nBalance for both savings account: ");
		System.out.println("Month 13: " + String.format("%12.2f",saver1.calculateMonthlyInterest()) + String.format("%11.2f",saver2.calculateMonthlyInterest()) );

	}
}
