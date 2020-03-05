package project02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class tryCatch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int a, b, c;

		while (true) {
			try {
				System.out.println("� ���� �����ðڽ��ϱ�? >>");
				a = input.nextInt();
				System.out.println("� ���� �����ðڽ��ϱ�? >>");
				b = input.nextInt();
				c = (a / b);
				break;
			} catch (ArithmeticException e) {
				System.err.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.");
			} catch (InputMismatchException e) {
				System.err.println("�߸��� �Է��Դϴ�. �ٽ� �Է����ּ���.");
				input.nextLine();
			}
		}
		System.out.println(a + " / " + b + " = " + c);
		input.close();

	}
}

