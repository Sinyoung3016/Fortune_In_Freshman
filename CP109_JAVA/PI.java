package project;

import java.util.Scanner;
import java.lang.Math;

public class PI {
	public static void main(String[] args) {

		double divisor, divident, sum, error = 0; 
		int loop_count = 0;

		Scanner input = new Scanner(System.in);
		divisor = 1;
		divident = 4;
		sum = 0;
		System.out.print("��� ���� :");
		error = input.nextDouble();

		do {
			sum = sum + divident / ((divisor * 2) * (divisor * 2 + 1) * (divisor * 2 + 2));
			divident = -1 * divident;
			divisor = divisor + 1;
			loop_count++;
		} while (error < Math.abs(Math.PI - (sum + 3)));

		System.out.println("���� ���̰� =" + (sum + 3));
		System.out.println("Math.PI =" + Math.PI);
		System.out.println("�ݺ�Ƚ��: " + loop_count);

	}
}