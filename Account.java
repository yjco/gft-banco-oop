public abstract class Account implements IAccount {

	private int DEFAULT_AGENCY = 1;
	private static int COUNT = 0;

	protected int agency;
	protected int number;
	protected double cash;
	protected Client client;
	protected Bank bank;

	public Account(Client client, Bank bank) {
		this.agency = DEFAULT_AGENCY;
		this.number = ++COUNT;
		this.client = client;
		this.bank = bank;
	}

	@Override
	public void withdraw(double value) { this.cash -= value; }

	@Override
	public void deposit(double value) { this.cash += value; }

	@Override
	public void transfer(double value, Account destiny) {
		if (this.bank.getName() != destiny.bank.getName()) {
			this.withdraw(value + this.bank.crossTransferTariff);
		} else {
			this.withdraw(value);
		}
		destiny.deposit(value);
	}

	protected void printDetails() {
		System.out.println(String.format(
			"Bank: %s\nOwner: %s\nAgency: %d\nNumber: %d\nCash: %.2f",
			this.bank.getName(), this.client.getName(),
			this.agency, this.number, this.cash
		));
	}

	public int getAgency() { return this.agency; }
	public int getNumber() { return this.number; }
	public double getCash() { return this.cash; }

	public void setCash(double cash) { this.cash = cash; }

}
