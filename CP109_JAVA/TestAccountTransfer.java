package banking;

public class TestAccountTransfer {
	public static void main(String[] args) {
		CheckingAccount tony_account = new CheckingAccount(3000);
		CheckingAccount steve_account = new CheckingAccount(2000);
		
		try {
//			tony_account.transfer(5000, steve_account);
			tony_account.transfer(2000, null);
			System.out.println("�۱� ����!");
		} catch (NullPointerException e) {
			System.out.println("�ش��ϴ� ���°� �����ϴ�.");
			System.out.println("�۱� ����!");
		} catch(IllegalArgumentException e) {
			System.out.println("�ش��ϴ� �ݾ��� ���� �� �����ϴ�.");
			System.out.println("�۱� ����!");
		}

	}

}