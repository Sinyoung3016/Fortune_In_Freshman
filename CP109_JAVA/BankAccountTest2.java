package project02;

public class BankAccountTest2 {
	public static void main(String []args) {
		Bankaccountclass tony_account = new Bankaccountclass();
		Bankaccountclass steve_account = new Bankaccountclass();
	
		tony_account.deposit(-2000);
		tony_account.deposit(10000);
		tony_account.withdraw(-2000);
	
		steve_account.deposit(500);
		steve_account.withdraw(2000);
		
		tony_account.transfer(20000, steve_account);
		System.out.println("��� ������ �ܾ� :" + tony_account.getBalance());
		System.out.println("��Ƽ�� ������ �ܾ� :" + steve_account.getBalance());
		
	}
}
