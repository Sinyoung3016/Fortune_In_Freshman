package project;
import java.util.Scanner;
import java.lang.Math;
public class ū�����������γ�����2{
	public static void main(String[] args) {
	
		int a,b,c,d;
		
		Scanner input = new Scanner(System.in);
		System.out.print("ù��° ���ڸ� �Է��ϼ��� : ");
	    a =input.nextInt();
	    System.out.print("�ι�° ���ڸ� �Է��ϼ��� : ");
	    b =input.nextInt();
	    
	    c = (a>b) ? (a/b) : (b/a);
	    d = (a>b) ? (a%b) : (b%a);
	   
	    System.out.printf("ū ���� ���� ���� ���� ���� %d�̰� �������� %d�̴�",c,d);

}
}
