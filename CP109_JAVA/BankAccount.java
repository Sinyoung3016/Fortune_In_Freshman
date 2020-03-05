package project02;

class Bankaccountclass{
	
	private int balance = 0;
	
	void deposit(int x) {
		if (x<0)
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		else	
			balance += x;
	}
	
	void withdraw(int y) {
		if (y<0)
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		else if (balance < y)
			System.out.println("�ܾ��� �����մϴ�.");
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
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		else if (amount > this.balance)
			System.out.println("�ܾ��� �����մϴ�.");
		else	
			{this.balance -= amount; 
			otherAccount.balance += amount;}
		return balance;
	}
}