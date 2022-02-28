public class CheckingAccount extends Account {

	public CheckingAccount(Client client, Bank bank) {
		super(client, bank);
	}

	@Override
	public void printInfo() {
		System.out.println("[ Checking Account ]");
		super.printDetails();
	}

}
