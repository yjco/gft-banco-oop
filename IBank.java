public interface IBank {
	double crossTransferTariff = 1.00;
	Account registerAccount(Client client, String type);
}
