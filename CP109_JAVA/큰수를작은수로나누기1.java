package project;
import java.util.Scanner;
import java.lang.Math;
public class ū�����������γ�����1{
	public static void main(String[] args) {
	
		int a,b,c,d,e,f,g;
		
		Scanner input = new Scanner(System.in);
		System.out.print("ù��° ���ڸ� �Է��ϼ��� : ");
	    a =input.nextInt();
	    System.out.print("�ι�° ���ڸ� �Է��ϼ��� : ");
	    b =input.nextInt();
	    
	    c = Math.abs(a-b);
	    
	    d = (a+b+c)/2;
	    e = (a+b-c)/2;
	    
	    f = d/e;
	    g = d%e;
	    		
	    System.out.printf("ū ���� ���� ���� ���� ���� %d�̰� �������� %d�̴�",f,g);
	    
	
	
	}
}