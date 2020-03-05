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
				System.out.println(bank.getCustomer(fromAccount).getName() + "계좌에서 " + bank.getCustomer(a).getName()
						+ "계좌로 " + b + "만큼 송금, 은행의 총 보유금액 : " + bank.getTotalBalance());
				Thread.sleep(DELAY);
			}
		} catch (InterruptedException e) {
		}
	}

}
