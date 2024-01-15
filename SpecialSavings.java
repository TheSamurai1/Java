
public class SpecialSavings extends SavingsAccount {
	private int wallet = 0;
	private String bank;
	private int money = 0;
	public SpecialSavings(String name, int savingsBalance) {
		super(name, savingsBalance);

	}
	public void checkBalance() {
		if (getSavingsBalance() > 10000) {
			setAnnualInterestRate(10);
		}
	}
	public void depositNTake(String bank, int money) {
		if (bank == "deposit") {
			setSavingsBalance((getSavingsBalance()-money));
		}
		else {
			setSavingsBalance((getSavingsBalance() + money));
		}
	}

}
