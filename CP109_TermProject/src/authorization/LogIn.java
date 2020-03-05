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

	public String getID() {//회원의 아이디를 보여주기 위함
		return this.ID;
	}
	public boolean CheckID() throws IOException {
		System.out.println("\n-------- [로그인 창] --------");
		
		String inputID;
		do {
			bool = false;
			System.out.print("\n[아이디를 입력하세요(공백 사용 불가)] : ");
			inputID = sc.nextLine();
		
			for (int i = 0; i < inputID.length(); i++) {
				if (inputID.charAt(i) == ' ') {
					System.out.println("※ 공백을 사용할 수 없습니다. 다시 입력해주세요.");
					bool = true;
					break;
				} // if
			} // for
		} while (bool);
		
		if(loadID.CheckingExistID(inputID)) {//아이디가 존재하는 아이디라면
			this.ID=inputID;//로그인 할 아이디를 저장
			return true;
		}
		else {
			System.out.println("\n※ 존재하지 않는 아이디입니다.");
			return false;
		}

	}
	public boolean CheckingPassWord(String str) throws IOException {
	
		String inputPW, PW = "";//PW는 비밀번호를 거꾸로 저장해 줄 변수임
		do {
			bool = false;
			System.out.print("[비밀번호를 입력하세요(공백 사용 불가)] : ");
			inputPW = sc.nextLine();
			for (int i = 0; i < inputPW.length(); i++) {
				if (inputPW.charAt(i) == ' ') {
					System.out.println("\n※ 공백을 사용할 수 없습니다. 다시 입력해주세요.");
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
			RealPw += PW.charAt(PW.length() - i - 1);//비밀번호가 거꾸로 저장되어있는 PW를 마지막부터 돌려 원상태로 되돌림.
		}
		if (inputPW.equals(RealPw)) {//입력받은 비밀번호가 비밀번호와 일치하다면
			return true;
		}
		else {
			System.out.println("\n※ 로그인에 실패하셨습니다.");
			return false;
		}

	}
}
