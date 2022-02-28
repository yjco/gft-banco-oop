public class Main {

	public static void main(String[] args) {

		Client c = new Client("Nome");

		Bank bdp = new Bank("Banco do País");
		Bank sta = new Bank("Santa Ander");

		Account ca = bdp.registerAccount(c, "checking"); 
		Account sa = sta.registerAccount(c, "savings");

		if (ca == null || sa == null) {
			System.out.println("Failed to create one or more accounts.");
			System.exit(1);
		}

		ca.deposit(100);
		ca.transfer(50, sa);

		ca.printInfo();
		System.out.println("");
		sa.printInfo();

	}

}
