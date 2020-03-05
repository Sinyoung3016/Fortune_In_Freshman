package banking;

public class TestAccountTransfer {
	public static void main(String[] args) {
		CheckingAccount tony_account = new CheckingAccount(3000);
		CheckingAccount steve_account = new CheckingAccount(2000);
		
		try {
//			tony_account.transfer(5000, steve_account);
			tony_account.transfer(2000, null);
			System.out.println("송금 성공!");
		} catch (NullPointerException e) {
			System.out.println("해당하는 계좌가 없습니다.");
			System.out.println("송금 실패!");
		} catch(IllegalArgumentException e) {
			System.out.println("해당하는 금액을 보낼 수 없습니다.");
			System.out.println("송금 실패!");
		}

	}

}