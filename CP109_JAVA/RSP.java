package project;
import java.util.Scanner;
public class RSP {
public static void main(String[] args) {
	
	String cs = null;
	String yh = null;
	String winner=null;
	
	Scanner input = new Scanner(System.in);
	System.out.println("���������� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���.");
	System.out.print("ö�� >> ");
	cs = input.next();
	System.out.print("���� >> ");
	yh = input.next();
	
	switch(cs) {
	case "����":
		if (yh.equals("����"))
			winner = "����";
		else if (yh.equals("��"))
			winner = "ö��";
		else
			winner = "���º�";
		break;
		
	case "����":
		if (yh.equals("��"))
			winner = "����";
		else if (yh.equals("����"))
			winner = "ö��";
		else
			winner = "���º�";
		break;
		
	case "��":
		if (yh.equals("����"))
			winner = "����";
		else if (yh.equals("�ָ�"))
			winner = "ö��";
		else
			winner = "���º�";
		break;
		}
	
	System.out.println("Winner? "+ winner);
}
}
