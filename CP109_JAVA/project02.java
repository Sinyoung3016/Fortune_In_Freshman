package project;
import java.util.Scanner;
public class project02 {
 public static void main(String[] args) {
 
	 boolean city;
	 int people;
	 int rich;
	 String cap;
	 
	 @SuppressWarnings("resource")
	Scanner input = new Scanner(System.in);
	 System.out.print("�����Դϱ�?(����:1, �����ƴ�:0) : ");
	 city = (input.nextInt() == 1)?  true : false; 
	 System.out.print("�� �α���?(����:��) :");
	 people = input.nextInt();
	 System.out.print("���ҵ��� 1�� �̻��� �α���?(����:��) :");
	 rich = input.nextInt();
	 
	 cap = (city && (people >= 100)) || (city && (rich >= 50))? "�½��ϴ�.": "�ƴմϴ�.";
	 System.out.println("�� ���ô� ��Ʈ���������� " + cap);
	
}
}
