package project;

import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args) {

		int term, n, f = 1;

		Scanner input = new Scanner(System.in);

		do {
			System.out.print("���° �ױ��� ����Ͻðڽ��ϱ�?(n>=3): ");
			term = input.nextInt();

			if (term < 3)
				System.out.println("3�̻��� ���� ������ּ���.");

		} while (term < 3);
		int a = 0, b = 1;
		System.out.print(a + " " + b + " ");
		for (int i = 2; term > i; i++) {
			f = a + b;
			System.out.print(f + " ");
			a = b;
			b = f;
		}

	}
}
