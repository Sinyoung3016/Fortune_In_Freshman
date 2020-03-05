package project02;
public class BankAccount03Test {

	public static void main(String[] args) {
		Bank bank = new Bank();
		Customer tony = new Customer("Tony", "Stark");
		Customer petter = new Customer("Peter", "Parker");
		Customer thor = new Customer("Thor", "Odinson");
		
		bank.addCustomer(tony);
		bank.addCustomer(petter);
		bank.addCustomer(thor);
		
		tony.setBankAccount(new BankAccount(100000));
		petter.setBankAccount(new BankAccount(100));
		thor.setBankAccount(new BankAccount(30000));
		
		Customer rich,poor;
		rich = tony;
		poor = tony;
		
		for(int i = 0; i < bank.getNumberOfCustomers(); i++) {
			if(rich.getBankAccount().getBalance() < bank.getCustomer(i).getBankAccount().getBalance())
				rich = bank.getCustomer(i);
			if(poor.getBankAccount().getBalance() > bank.getCustomer(i).getBankAccount().getBalance())
				poor = bank.getCustomer(i);
		}
		
		System.out.println("잔고가 가장 많은 사람: " + rich);
		System.out.println("잔고가 가장 적은 사람: " + poor);
		
		System.out.println(rich.getFirstName() + "가 " + poor.getFirstName() + "에게 잔고의 반을 송금");
		rich.getBankAccount().transfer(rich.getBankAccount().getBalance()/2, poor.getBankAccount());
		
		System.out.println("송금 후 모든 고객의 정보");
		
		for(int i = 0; i < bank.getNumberOfCustomers(); i++) {
			System.out.println(bank.getCustomer(i));
		}

	}
}
