package project02;

class Bank {
	private Customer[] customers;
	private int numberOfCustomers;

	Bank() {
		numberOfCustomers = 0;
		customers = new Customer[10];
	}

	public void addCustomer(Customer a) {
		customers[numberOfCustomers] = a;
		numberOfCustomers++;
	}

	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}

	public Customer getCustomer(int a) {
		return customers[a - 1];
	}
}

class Customer {
	private String firstName;
	private String lastName;
	private BankAccount[] account;
	int numberOfAccounts;

	Customer(String fN, String lN) {
		this.firstName = fN;
		this.lastName = lN;
		account = new BankAccount[5];
		numberOfAccounts = 0;
	}

	public void addAccount(BankAccount a) {
		account[numberOfAccounts] = a;
		numberOfAccounts++;
	}

	BankAccount getAccount(int a) {
		return account[a - 1];
	}

	public int getNumOfAccounts() {
		return numberOfAccounts;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setBankAccount(BankAccount a) {
		account[numberOfAccounts] = a;
	}

	public BankAccount getBankAccount() {
		return account[numberOfAccounts];
	}

	public String toString() {
		return String.format("고객의 이름: %s, 계좌의 개수 : %d", firstName + lastName, numberOfAccounts);
	}
}

class BankAccount {
	protected int balance;

	BankAccount(int balance) {
		this.balance = balance;
	}

	public String toString() {
		return "잔액 : " + balance;
	}

	public void deposit(int amount) {
		if (amount < 0)
			System.out.println("잘못 입력하셨습니다.");
		else
			this.balance += amount;
	}

	public boolean withdraw(int amount) {
		if ((amount < 0) || (balance < amount))
			return false;
		else {
			this.balance -= amount;
			return true;
		}
	}

	public int getBalance() {
		return balance;
	}

	public boolean transfer(int amount, BankAccount otherAccount)
			throws IllegalArgumentException, NullPointerException {

		if (this.balance < amount || amount < 0)
			throw new IllegalArgumentException();

		this.balance -= amount;
		otherAccount.balance += amount;
		return true;

	}

	/**
	 * public boolean transfer(int amount, BankAccount otherAccount){
	 * 
	 * if (this.balance < amount || amount < 0) return false;
	 * 
	 * else{ this.balance -= amount; otherAccount.balance += amount; return true; }
	 * }
	 * 
	 */
}

class CheckingAccount extends BankAccount {
	SavingsAccount protectedBy;

	public CheckingAccount(int balance) {
		super(balance);
	}

	public CheckingAccount(int balance, SavingsAccount psa) {
		super(balance);
		this.protectedBy = psa;
	}

	@Override
	public boolean withdraw(int amount) {
		if (balance < amount) {
			int a = amount - balance;
			balance = 0;
			protectedBy.balance = this.protectedBy.balance - a;
			return true;
		} else
			return false;
	}
}

class SavingsAccount extends BankAccount {
	double interestRate = 0;

	public SavingsAccount(int balance, double interestRate) {
		super(balance);
		this.interestRate = interestRate;
	}

	public void updateBalance(int period) {
		balance += balance * interestRate * period;
	}
}