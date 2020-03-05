package authorization;

import java.io.IOException;
import java.util.Scanner;

public class LogIn {
	Scanner sc = new Scanner(System.in);
	CallInID loadID=new CallInID();
	private boolean bool;
	private String ID;
	
	public CallInID getLoadID() {
		return loadID;
	}

	public String getID() {//ȸ���� ���̵� �����ֱ� ����
		return this.ID;
	}
	public boolean CheckID() throws IOException {
		System.out.println("\n-------- [�α��� â] --------");
		
		String inputID;
		do {
			bool = false;
			System.out.print("\n[���̵� �Է��ϼ���(���� ��� �Ұ�)] : ");
			inputID = sc.nextLine();
		
			for (int i = 0; i < inputID.length(); i++) {
				if (inputID.charAt(i) == ' ') {
					System.out.println("�� ������ ����� �� �����ϴ�. �ٽ� �Է����ּ���.");
					bool = true;
					break;
				} // if
			} // for
		} while (bool);
		
		if(loadID.CheckingExistID(inputID)) {//���̵� �����ϴ� ���̵���
			this.ID=inputID;//�α��� �� ���̵� ����
			return true;
		}
		else {
			System.out.println("\n�� �������� �ʴ� ���̵��Դϴ�.");
			return false;
		}

	}
	public boolean CheckingPassWord(String str) throws IOException {
	
		String inputPW, PW = "";//PW�� ��й�ȣ�� �Ųٷ� ������ �� ������
		do {
			bool = false;
			System.out.print("[��й�ȣ�� �Է��ϼ���(���� ��� �Ұ�)] : ");
			inputPW = sc.nextLine();
			for (int i = 0; i < inputPW.length(); i++) {
				if (inputPW.charAt(i) == ' ') {
					System.out.println("\n�� ������ ����� �� �����ϴ�. �ٽ� �Է����ּ���.");
					bool = true;
					break;
				} // if
			} // for
		} while (bool);

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(str.length() - i - 1) == ' ') {
				break;
			} // if
			PW += str.charAt(str.length() - i - 1);
		} // for
		String RealPw = "";
		for (int i = 0; i < PW.length(); i++) {
			RealPw += PW.charAt(PW.length() - i - 1);//��й�ȣ�� �Ųٷ� ����Ǿ��ִ� PW�� ���������� ���� �����·� �ǵ���.
		}
		if (inputPW.equals(RealPw)) {//�Է¹��� ��й�ȣ�� ��й�ȣ�� ��ġ�ϴٸ�
			return true;
		}
		else {
			System.out.println("\n�� �α��ο� �����ϼ̽��ϴ�.");
			return false;
		}

	}
}
