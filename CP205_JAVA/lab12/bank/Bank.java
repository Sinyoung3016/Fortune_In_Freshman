package lab12.bank;

public class Bank {
	public Customer[] customer;
	private int numOfCustomer;
	// private Lock bankLock;

	public Bank(int ncus) {
		customer = new Customer[ncus];
		numOfCustomer = 0;
		// bankLock = new ReentrantLock();
	}

	public void addCustomer(String name) {
		customer[numOfCustomer] = new Customer(name);
		numOfCustomer++;
	}

	public int getNumofCustomers() {
		return numOfCustomer;
	}

	public Customer getCustomer(int index) {
		return customer[index];
	}

	public synchronized void transfer(int from, int to, double amount) {
		double fromBal = customer[from].getAccount(0).getBalance();
		while (fromBal < amount)
			try {
				wait();
			} catch (InterruptedException e) {
			}
		customer[from].getAccount(0).withdraw(amount);
		customer[to].getAccount(0).deposit(amount);
		notify();
	}

	public synchronized double getTotalBalance() {
		double total = 0;
		for (int i = 0; i < customer.length; i++)
			total += customer[i].getAccount(0).getBalance();
		return total;
	}

}
