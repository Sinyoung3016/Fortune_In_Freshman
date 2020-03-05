package project02;

public class pra {
	public static void main(String[] args) {

		Bank bank = new Bank();
		Customer customer1 = new Customer("Tony", "Stark");
		SavingsAccount tonySacc = new SavingsAccount(2000, 0.01);
		CheckingAccount tonyCacc = new CheckingAccount(3000, tonySacc);
		customer1.addAccount(tonySacc);
		customer1.addAccount(tonyCacc);
	}	
}
