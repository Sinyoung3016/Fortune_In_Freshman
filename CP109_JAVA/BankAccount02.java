package project02;

class BankAccountclass02{
	
	private String owner;
	private String accountNumber;
	private int balance = 0;
	
	public BankAccountclass02(String owner, String accountNumber){
		this.owner = owner;
		this.accountNumber = accountNumber;
	}
	
	public BankAccountclass02() {
		this.balance = balance;
	}
	
	void deposit(int amount) {
		if (amount<0)
			System.out.println("잘못 입력하셨습니다.");
		else	
			this.balance += amount;
	}
	
	boolean withdraw(int amount) {
		if ((amount<0)||(balance < amount))
			return false;
		else
			{this.balance -= amount;
			return true;}
	}
	
	String getOwner() {
		return owner;
	}
	
	String getAccountNumber() {
		return accountNumber;
	}
	
	void setBalance(int x) {
		balance = x;
	}
	
	int getBalance() {
		return balance;
	}
	
boolean transfer(int amount, BankAccountclass02 otherAccount){
		
		if ((amount<0)||(amount > this.balance))
			return false;
		else	
			{this.balance -= amount; 
			otherAccount.balance += amount;
			return true;}
	}

public String toString() {
	return String.format("%s, %s, 잔액 : %,d", owner, accountNumber, balance);
	}


}