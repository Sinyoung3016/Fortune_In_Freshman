package project;
import java.util.Scanner;
import java.lang.Math;
public class functionarea {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	double cut, area_x =0;
	int loop_time = 0;
	
	System.out.print("��� ������ �Է��ϼ��� :");
	cut = input.nextDouble();
	
	for(double x = 0; x <= Math.PI ; x += cut)
	{area_x += cut * Math.sin(x);
	loop_time++;
	}
	
	System.out.println("0���� pi������ sin�Լ��� ���а� :" + area_x);
	System.out.println("�����ݺ� Ƚ�� :" + loop_time);
	
}
}
