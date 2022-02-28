import java.util.List;
import java.util.ArrayList;

public class Bank implements IBank {

	private String name;
	private List<Account> accounts;

	public Bank(String name) {
		this.name = name;
		this.accounts = new ArrayList<Account>();
	}

	@Override
	public Account registerAccount(Client client, String type) {
		Account account = null;
		switch (type) {
			case "checking" :
				account = new CheckingAccount(client, this);
				accounts.add(account);
				break;
			case "savings" :
				account = new SavingsAccount(client, this);
				accounts.add(account);
				break;
			default :
				System.out.println("Unkown account type.");
				break;
		}
		return account;
	}

	public String getName() { return this.name; }

}
