package project02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class trycatch02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b, c;
		while (true) {
			try {
				System.out.println("� ���� �����ðڽ��ϱ�?>>");
				a = input.nextInt();
				System.out.println("� ���� �����ðڽ��ϱ�?>>");
				b = input.nextInt();
				c = a / b;
				break;
			} catch (ArithmeticException e) {
				System.out.println("0���� ���� �� �����ϴ�.");
			} catch (InputMismatchException e) {
				System.out.println("�߸��� �Է��Դϴ�.");
			}
		}
		System.out.println(a + "/" + b + "=" + c);
		input.close();
	}
}
