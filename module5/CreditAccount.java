
import static java.lang.System.*;

public class CreditAccount extends Account {

	private double creditLimit;

	public CreditAccount(String a, double b) {
		super(a,0);
		creditLimit = b;
	}

	public boolean deposit(double amount) {
		if(amount <=0 || accountBalance - amount < 0 ) {
			out.println("wrong amount you owe " + accountBalance + " pay this exactly!");
			return false;
		}

		accountBalance -=amount;
		return true;

	}


	public boolean widthdraw(double amount) {

		if(accountBalance + amount > creditLimit || amount <=0) {
			out.println("you are exceeding limit!");
			return false;
		}

		accountBalance +=amount;
		return true;
	}
}
