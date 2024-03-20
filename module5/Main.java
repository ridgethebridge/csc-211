import static java.lang.System.*;
public class Main {

	public static void main(String args[]) {

	DebitAccount a = new DebitAccount("debit",700);
	CreditAccount c = new CreditAccount("credit",2000);


	a.widthdraw(900);

	out.println(a);

	a.widthdraw(400);

	out.println(a);

	a.deposit(-34);



	}
}
