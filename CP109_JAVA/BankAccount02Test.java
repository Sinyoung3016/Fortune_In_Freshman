package project02;
import java.util.Scanner;
public class BankAccount02Test {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("ù��° ���� ������ �Է��ϼ���.");
		System.out.print("������ : ");
		String name01 = input.next();
		System.out.print("���� ��ȣ : ");
		String accountNumber01 = input.next();
		System.out.print("�ʱ� �ݾ� : ");
		int balance01 = input.nextInt();
		
		BankAccountclass02 my_acct = new BankAccountclass02(name01, accountNumber01);
		my_acct.setBalance(balance01);
		
		System.out.println("\n�ι�° ���� ������ �Է��ϼ���.");
		System.out.print("������ : ");
		String name02 = input.next();
		System.out.print("���� ��ȣ : ");
		String accountNumber02 = input.next();
		System.out.print("�ʱ� �ݾ� : ");
		int balance02 = input.nextInt();
		
		BankAccountclass02 your_acct = new BankAccountclass02(name02, accountNumber02);
		your_acct.setBalance(balance02);
		
		System.out.println("\nù��° ���¿��� �ι�° ���·� �۱��� �ݾ� : ");
		int money = input.nextInt();
		
		if (my_acct.transfer(money,your_acct))
			System.out.println("�۱ݿϷ�");
		else
			if(money>=0)
				System.out.println("�ܾ׺���");
		
		System.out.println("ù ��° ������ ���� : " + my_acct);
		System.out.println("�� ��° ������ ���� : " + your_acct); 
			
		
	}
}
