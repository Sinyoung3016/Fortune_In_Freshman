package project;
import java.util.Scanner;
public class weather {
public static void main(String[] args) {
	
	int month= 0;
	String weather = null;
	
	Scanner input = new Scanner(System.in);
	System.out.println("���� �Է��ϼ���(1-12) :");
	month = input.nextInt();
	
	System.out.println(month+"����"+weather+"�Դϴ�.");
}
}
