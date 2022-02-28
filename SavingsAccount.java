public class SavingsAccount extends Account {

	public SavingsAccount(Client client, Bank bank) {
		super(client, bank);
	}

	@Override
	public void printInfo() {
		System.out.println("[ Savings Account ]");
		super.printDetails();
	}

}
