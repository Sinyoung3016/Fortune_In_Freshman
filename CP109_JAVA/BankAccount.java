package project02;

class Bankaccountclass{
	
	private int balance = 0;
	
	void deposit(int x) {
		if (x<0)
			System.out.println("잘못 입력하셨습니다.");
		else	
			balance += x;
	}
	
	void withdraw(int y) {
		if (y<0)
			System.out.println("잘못 입력하셨습니다.");
		else if (balance < y)
			System.out.println("잔액이 부족합니다.");
		else
			balance -= y;
	}

	int getBalance() {
		return balance;
	}
	
	public Bankaccountclass() {
		this.balance = balance;
	}
		
	public int transfer(int amount,Bankaccountclass otherAccount){
		int balance = 0;
		
		if (amount<0)
			System.out.println("잘못 입력하셨습니다.");
		else if (amount > this.balance)
			System.out.println("잔액이 부족합니다.");
		else	
			{this.balance -= amount; 
			otherAccount.balance += amount;}
		return balance;
	}
}