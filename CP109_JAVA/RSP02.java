package project;
import java.util.Scanner;
public class RSP02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String SY = null;
		String CY = null;
		int SYa = 0;
		int CYa = 0;
		String Winner;
		
		System.out.println("���������� ��");
		System.out.print("��: ");
		SY = input.next();
		System.out.print("��: ");
		CY = input.next();
		
		if( SY.equals("����"))
			{SYa = 1;
			switch (CY){
				case "����":
					SYa = 0;
					break;
				case "����":
					SYa = 1;
					break;
				case "��":
					SYa = 0;
					break;
			}
			}
		
		else if( SY.equals("����"))
			{SYa = 1;
			switch (CY){
				case "����":
					SYa = 0;
					break;
				case "����":
					SYa = 0;
					break;
				case "��":
					SYa = 1;
					break;
		}
		}
		
		else if( SY.equals("��"))
			{SYa = 1;
			switch (CY){
				case "����":
					SYa = 1;
					break;
				case "����":
					SYa = 0;
					break;
				case "��":
					SYa = 0;
					break;
		}
		}
		
		else
			System.out.println("�ٽ�");
		
	Winner = ((SYa)*(CYa))==1 ? "Win" : "Lose";
		
	System.out.println("�� "+ Winner);
		
	
	}
}