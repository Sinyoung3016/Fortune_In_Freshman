package project;
import java.util.Scanner;
public class project05 {
	public static void main(String[] args) {
	 
		int x;
		
		Scanner input = new Scanner(System.in);
		System.out.print("int�� ������ �Է��ϼ��� : ");
		x = input.nextInt();
		
		String s = Integer.toBinaryString(x);
		System.out.println("����"+ x +"�� ������ ǥ����" + s+ "�̴�.");
	
		int t = 1&(x>>2);
		
		String a = Integer.toBinaryString(t);
		System.out.println("����"+ x +"�� ������ ������ 3��° ��Ʈ��"+a+"�̴�.");
		
	    int f = 1&(x>>4);
		
		String b = Integer.toBinaryString(f);
		System.out.println("����"+ x +"�� ������ ������ 5��° ��Ʈ��"+b+"�̴�.");
		
       
	}
}
