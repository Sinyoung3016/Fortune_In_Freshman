package project02;
import java.util.Scanner;
public class BankAccount02Test {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("첫번째 고객의 정보를 입력하세요.");
		System.out.print("예금주 : ");
		String name01 = input.next();
		System.out.print("계좌 번호 : ");
		String accountNumber01 = input.next();
		System.out.print("초기 금액 : ");
		int balance01 = input.nextInt();
		
		BankAccountclass02 my_acct = new BankAccountclass02(name01, accountNumber01);
		my_acct.setBalance(balance01);
		
		System.out.println("\n두번째 고객의 정보를 입력하세요.");
		System.out.print("예금주 : ");
		String name02 = input.next();
		System.out.print("계좌 번호 : ");
		String accountNumber02 = input.next();
		System.out.print("초기 금액 : ");
		int balance02 = input.nextInt();
		
		BankAccountclass02 your_acct = new BankAccountclass02(name02, accountNumber02);
		your_acct.setBalance(balance02);
		
		System.out.println("\n첫번째 계좌에서 두번째 계좌로 송금할 금액 : ");
		int money = input.nextInt();
		
		if (my_acct.transfer(money,your_acct))
			System.out.println("송금완료");
		else
			if(money>=0)
				System.out.println("잔액부족");
		
		System.out.println("첫 번째 계좌의 정보 : " + my_acct);
		System.out.println("두 번째 계좌의 정보 : " + your_acct); 
			
		
	}
}
