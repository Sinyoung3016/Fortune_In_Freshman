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
		
		System.out.println("�ܰ� ���� ���� ���: " + rich);
		System.out.println("�ܰ� ���� ���� ���: " + poor);
		
		System.out.println(rich.getFirstName() + "�� " + poor.getFirstName() + "���� �ܰ��� ���� �۱�");
		rich.getBankAccount().transfer(rich.getBankAccount().getBalance()/2, poor.getBankAccount());
		
		System.out.println("�۱� �� ��� ���� ����");
		
		for(int i = 0; i < bank.getNumberOfCustomers(); i++) {
			System.out.println(bank.getCustomer(i));
		}

	}
}
