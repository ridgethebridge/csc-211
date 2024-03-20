import static java.lang.System.*;
public class DebitAccount extends Account {


	public DebitAccount(String a, double b) {
		super(a,b);
	}

	public boolean deposit(double amount) {
	
		if(amount <= 0) {
			out.println("enter in a valid amount!");
			return false;
		}
		accountBalance+=amount;
		return true;
	}

	public boolean widthdraw(double amount) {
		if(amount > accountBalance || amount <=0) {
			out.println("you don't have enough money!");
			return false;
		}

		accountBalance-=amount;
		return true;
	}


}
