package authorization;
/*
package authorization�� Ŭ������ ��� �ŵ����� �������
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CallInID {//ID �ҷ����� Ŭ����
	private String ID_PW_Line;// ID�� �����ϴ� �ؽ�Ʈ������ ����

	public String getID_PW_Line() {// ID�� �����ϴ� �ؽ�Ʈ������ ������ String���� ��ȯ
		return ID_PW_Line;
	}

	public boolean CheckingExistID(String input_ID) throws IOException {
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(".\\����ȸ������.txt"));
		} catch (FileNotFoundException e) {
			PrintWriter output = new PrintWriter(new FileWriter(".\\����ȸ������.txt"));// �ؽ�Ʈ������ ������ �������
			br = new BufferedReader(new FileReader(".\\����ȸ������.txt"));
		}
		
		while (true) {
			String ID = "";
			String textFileLine = br.readLine();// text_File_Line�� �ؽ�Ʈ������ �� ���� �����.
			if (textFileLine == null) {// �ؽ�Ʈ������ ������ ������ null���� ����, ����ڷΰ� �Է��� ���̵�� �ؽ�Ʈ ���Ͽ� �������� ����. false�� ��ȯ
				return false;
			}
			for (int i = 0; i < textFileLine.length(); i++) {
				if (textFileLine.charAt(i) == ' ') {// a�� ���̸�ŭ ���鼭 ������ ������ ����. ������ �������� ������ ���̵�, �ڿ��� ��й�ȣ�� �ԷµǾ�����.
					break;
				} // if
				ID += textFileLine.charAt(i);// ��������� ID�κи� ID������ �����.
			} // for
			if (input_ID.equals(ID)) {// �Ű������� �Է¹��� inputID�� ����ڿ��� �Է¹��� ���̵�μ� ���� ����ڰ� �Է��� ���̵� �̹� �����Ѵٸ� true�� ��ȯ.
				this.ID_PW_Line =textFileLine;
				return true;
			}

		} // while
	}
}
