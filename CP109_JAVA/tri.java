package project;
import java.util.Scanner;
public class tri {
	public static void main(String[] args) {
	
	int x, y, z;//���� ����
	
	Scanner input = new Scanner(System.in);
	System.out.println("�ﰢ���� ù��° ���� ���̸� �Է��ϼ��� :");
	x = input.nextInt();
	System.out.println("�ﰢ���� �ι�° ���� ���̸� �Է��ϼ��� :");
	y = input.nextInt();
	System.out.println("�ﰢ���� ����° ���� ���̸� �Է��ϼ��� :");
	z = input.nextInt();
	
	if ((x>y)&&(y>z))
		{if (x<y+z)
			System.out.println("�ﰢ���� ���� �� �ֽ��ϴ�.");
		else
			System.out.println("�ﰢ���� ���� �� �����ϴ�.");}
	
	else if ((x>z)&&(z>y))
		{if (x<y+z)
			System.out.println("�ﰢ���� ���� �� �ֽ��ϴ�.");
		else
			System.out.println("�ﰢ���� ���� �� �����ϴ�.");}
	
	else if ((y>x)&&(x>z))
		{if (y<x+z)
			System.out.println("�ﰢ���� ���� �� �ֽ��ϴ�.");
		else
			System.out.println("�ﰢ���� ���� �� �����ϴ�.");}
	
	else if ((y>z)&&(z>x))
		{if (y<x+z)
		System.out.println("�ﰢ���� ���� �� �ֽ��ϴ�.");
		else
		System.out.println("�ﰢ���� ���� �� �����ϴ�.");}
	
	else if ((z>x)&&(x>y))
		{if (z<x+y)
		System.out.println("�ﰢ���� ���� �� �ֽ��ϴ�.");
		else
		System.out.println("�ﰢ���� ���� �� �����ϴ�.");}
	
	else if ((z>y)&&(y>x))
		{if (z<x+y)
		System.out.println("�ﰢ���� ���� �� �ֽ��ϴ�.");
		else
		System.out.println("�ﰢ���� ���� �� �����ϴ�.");}
	
	

}
}
