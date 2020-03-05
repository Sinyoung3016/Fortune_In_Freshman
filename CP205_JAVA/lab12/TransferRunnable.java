package lab12;

import lab12.bank.Bank;

public class TransferRunnable implements Runnable {
	private Bank bank;
	private int fromAccount;
	private double maxAmount;
	private final int DELAY = 10;

	public TransferRunnable(Bank bank, int fromAccount, double maxAmount) {
		this.bank = bank;
		this.fromAccount = fromAccount;
		this.maxAmount = maxAmount;
	}

	@Override
	public void run() {
		try {
			while (true) {
				int a = (int) (Math.random() * (bank.customer.length));
				double b = Math.round(Math.random() * maxAmount);
				bank.transfer(fromAccount, a, b);
				System.out.println(bank.getCustomer(fromAccount).getName() + "���¿��� " + bank.getCustomer(a).getName()
						+ "���·� " + b + "��ŭ �۱�, ������ �� �����ݾ� : " + bank.getTotalBalance());
				Thread.sleep(DELAY);
			}
		} catch (InterruptedException e) {
		}
	}

}
