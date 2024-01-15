
public class SavingsAccount {
	private static double annualInterestRate = 0;
	private double savingsBalance;
	private double interestInput;
	private String name;
	public SavingsAccount(String name, int savingsBalance) {
		this.setSavingsBalance(savingsBalance);
		this.name = name;
	}
	public double calculateMonthlynterest() {
		setSavingsBalance(getSavingsBalance() + (getSavingsBalance() * (getAnnualInterestRate()/12)));
		return getSavingsBalance();
	}
	public static void modifyInterestRate(double interestInput) {
		 setAnnualInterestRate(interestInput);
	}
	public double getModifyInterestRate() {
		return getAnnualInterestRate();
	}
	public double getSavingsBalance() {
		return savingsBalance;
	}
	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public static void setAnnualInterestRate(double annualInterestRate) {
		SavingsAccount.annualInterestRate = annualInterestRate;
	}
	public void print() {
		System.out.printf("Current Balance for %10s :%10.3f\n", name, );
	}
}
