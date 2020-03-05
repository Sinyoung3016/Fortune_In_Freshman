package authorization;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class SignUp {
	
	public void SignUp_Program() throws IOException {
		System.out.println("\n-------- [회원가입 창] --------");
		CallInID loadingID=new CallInID();
		Scanner input=new Scanner(System.in);
		String id,pw;
		boolean bool;
		while(true) {
		do {
		bool=false;

		System.out.print("[아이디를 입력해주세요(공백 사용 불가)] : ");
		
		id=input.nextLine();
		for (int i=0; i<id.length();i++) {
			if(id.charAt(i)==' ') {
				System.out.println("\n※ 공백을 사용할 수 없습니다. 다시 입력해주세요.\n");
				bool=true;
				break;
			}
		}
		}while(bool);
		
		if(loadingID.CheckingExistID(id)) {
			System.out.println("\n※ 이미 존재하는 아이디입니다. 다른 아이디를 입력해주세요.");
		}
		else
			break;//while탈출
		}
		System.out.println("\n※ 사용 가능한 아이디입니다. 비밀번호를 설정하겠습니다.");
		
		
		do {
			bool=false;
		System.out.print("\n[비밀번호를 입력해주세요(공백 사용 불가)] : ");
		pw=input.nextLine();
		for (int i=0; i<pw.length();i++) {
			if(pw.charAt(i)==' ') {
				System.out.println("\n※ 공백을 사용할 수 없습니다. 다시 입력해주세요.");
				bool=true;
				break;
			}
		}
		}while(bool);
		PrintWriter output=new PrintWriter(new FileWriter(".\\텀프회원가입.txt",true));
	
		output.println(id+"  "+pw);
	
		output.close();
}
}
