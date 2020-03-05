package authorization;
/*
package authorization의 클래스는 모두 신동훈이 만들었음
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CallInID {//ID 불러오는 클래스
	private String ID_PW_Line;// ID가 존재하는 텍스트파일의 라인

	public String getID_PW_Line() {// ID가 존재하는 텍스트파일의 라인을 String으로 반환
		return ID_PW_Line;
	}

	public boolean CheckingExistID(String input_ID) throws IOException {
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(".\\텀프회원가입.txt"));
		} catch (FileNotFoundException e) {
			PrintWriter output = new PrintWriter(new FileWriter(".\\텀프회원가입.txt"));// 텍스트파일이 없으면 만들어줌
			br = new BufferedReader(new FileReader(".\\텀프회원가입.txt"));
		}
		
		while (true) {
			String ID = "";
			String textFileLine = br.readLine();// text_File_Line에 텍스트파일의 각 줄이 저장됨.
			if (textFileLine == null) {// 텍스트파일을 끝까지 읽으면 null값이 들어가고, 사용자로가 입력한 아이디는 텍스트 파일에 존재하지 않음. false를 반환
				return false;
			}
			for (int i = 0; i < textFileLine.length(); i++) {
				if (textFileLine.charAt(i) == ' ') {// a의 길이만큼 돌면서 공백이 나오면 멈춤. 공백을 기준으로 전에는 아이디, 뒤에는 비밀번호가 입력되어있음.
					break;
				} // if
				ID += textFileLine.charAt(i);// 결과적으로 ID부분만 ID변수에 저장됨.
			} // for
			if (input_ID.equals(ID)) {// 매개변수로 입력받은 inputID란 사용자에게 입력받은 아이디로서 만약 사용자가 입력한 아이디가 이미 존재한다면 true를 반환.
				this.ID_PW_Line =textFileLine;
				return true;
			}

		} // while
	}
}
