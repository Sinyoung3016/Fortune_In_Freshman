package project;
import java.util.Scanner;
import java.lang.Math;
public class random_number {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int random_num = (int)(100 * Math.random() + 1);
	int x;
	int count = 0;
	
	do {
		System.out.println("1���� 100 ������ ���� �� �ϳ��� �����ϼ��� : ");
		x = input.nextInt();
		
		if(random_num > x)
			System.out.println("������ �� ū �� �Դϴ�.");
		
		else if(random_num < x)
			System.out.println("������ �� ���� �� �Դϴ�.");
		
		count++;
		}while(random_num != x);
	
		
	System.out.println("�����Դϴ�.");
	System.out.println("������ �����մϴ�. :" + count);
	
	
			
}
}
