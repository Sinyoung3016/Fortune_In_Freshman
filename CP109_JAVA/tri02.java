package project;
import java.util.Scanner;
public class tri02 {
	public static void main(String[] args) {
	
	int x, y, z;//���� ����
	String tri;
	
	Scanner input = new Scanner(System.in);
	System.out.println("�ﰢ���� ù��° ���� ���̸� �Է��ϼ��� :");
	x = input.nextInt();
	System.out.println("�ﰢ���� �ι�° ���� ���̸� �Է��ϼ��� :");
	y = input.nextInt();
	System.out.println("�ﰢ���� ����° ���� ���̸� �Է��ϼ��� :");
	z = input.nextInt();

	{if ((x>y)&&(x>z))
		tri = (((x>y)&&(x>z))&&(x<y+z))? "�ֽ��ϴ�":"�����ϴ�";
	else if ((y>x)&&(y>z))
		tri = (((y>x)&&(y>z))&&(y<x+z))? "�ֽ��ϴ�":"�����ϴ�";
	else
		tri = (((z>y)&&(z>x))&&(z<x+y))? "�ֽ��ϴ�":"�����ϴ�";}
	
	System.out.println("�ﰢ���� ���� �� "+ tri);
		
	
}
}
