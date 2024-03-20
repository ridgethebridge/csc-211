
public abstract class Account {
	protected String accountType;

	protected double accountBalance;

	public Account(String a, double b) {
		accountType = a;
		accountBalance = b;
	}

	public abstract boolean deposit(double amount);
	public abstract boolean widthdraw(double amount);

	public String toString() {
		return accountType + " " + accountBalance;
	}

}
