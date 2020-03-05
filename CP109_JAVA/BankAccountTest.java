package project02;

public class BankAccountTest {
	public static void main(String [] args){
	
		Bankaccountclass tony_account = new Bankaccountclass();
		Bankaccountclass steve_account = new Bankaccountclass();
	
		tony_account.deposit(10000);
		steve_account.deposit(500);
	
		tony_account.transfer(4500, steve_account);
		
		System.out.println("Åä´Ï °èÁÂÀÇ ÀÜ¾× :" + tony_account.getBalance());
		System.out.println("½ºÆ¼ºê °èÁÂÀÇ ÀÜ¾× :" + steve_account.getBalance());
	
	
	}
}
