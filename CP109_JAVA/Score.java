package project;
import java.util.Scanner;
public class Score {
	public static void main(String[] args) {
		
		float x,y,z;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("�������� :");
		x = input.nextInt();
		System.out.print("�������� :");
		y = input.nextInt();
		System.out.print("�������� :");
		z = input.nextInt();
		
		float total = x+y+z;
		System.out.println("���� :" + total);
		
		float mean = (x+y+z)/3;
		System.out.printf("��� : %.2f\n", mean);
		
		if (90<=mean)
			System.out.print("���� : A");
		else if ((80<=mean)&&(90>=mean))
			System.out.print("���� : B");
		else if ((70<=mean)&&(80>=mean))
			System.out.print("���� : C");
		else if ((60<=mean)&&(70>=mean))
			System.out.print("���� : D");
		else 
			System.out.print("���� : F");
	
	}
}
