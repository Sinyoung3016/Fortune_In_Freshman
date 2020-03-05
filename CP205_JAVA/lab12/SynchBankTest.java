package lab12;

import lab12.bank.*;

public class SynchBankTest {
	public static final int NCUSTOMERS = 100;
	public static final double INITIAL_BALANCE = 1000;
	int count;

	public static void main(String[] args) {
		Bank bank = new Bank(NCUSTOMERS);
		for(int i = 0; i < NCUSTOMERS; i++) {
			bank.addCustomer("CNU" + i);
			bank.customer[i].addAccount(new CheckingAccount(INITIAL_BALANCE));
		}
		
		for(int i = 0; i < NCUSTOMERS; i++) {
			Thread thread = new Thread(new TransferRunnable(bank, i, INITIAL_BALANCE));
			thread.start();
		}
	}
}
