package authorization;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class SignUp {
	
	public void SignUp_Program() throws IOException {
		System.out.println("\n-------- [ȸ������ â] --------");
		CallInID loadingID=new CallInID();
		Scanner input=new Scanner(System.in);
		String id,pw;
		boolean bool;
		while(true) {
		do {
		bool=false;

		System.out.print("[���̵� �Է����ּ���(���� ��� �Ұ�)] : ");
		
		id=input.nextLine();
		for (int i=0; i<id.length();i++) {
			if(id.charAt(i)==' ') {
				System.out.println("\n�� ������ ����� �� �����ϴ�. �ٽ� �Է����ּ���.\n");
				bool=true;
				break;
			}
		}
		}while(bool);
		
		if(loadingID.CheckingExistID(id)) {
			System.out.println("\n�� �̹� �����ϴ� ���̵��Դϴ�. �ٸ� ���̵� �Է����ּ���.");
		}
		else
			break;//whileŻ��
		}
		System.out.println("\n�� ��� ������ ���̵��Դϴ�. ��й�ȣ�� �����ϰڽ��ϴ�.");
		
		
		do {
			bool=false;
		System.out.print("\n[��й�ȣ�� �Է����ּ���(���� ��� �Ұ�)] : ");
		pw=input.nextLine();
		for (int i=0; i<pw.length();i++) {
			if(pw.charAt(i)==' ') {
				System.out.println("\n�� ������ ����� �� �����ϴ�. �ٽ� �Է����ּ���.");
				bool=true;
				break;
			}
		}
		}while(bool);
		PrintWriter output=new PrintWriter(new FileWriter(".\\����ȸ������.txt",true));
	
		output.println(id+"  "+pw);
	
		output.close();
}
}
