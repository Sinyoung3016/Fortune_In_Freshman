package project;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int choice, deposit = 0, withdraw = 0, left = 0;

		do {
			System.out.println("----------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("----------------------------");
			System.out.print("���� > ");
			choice = input.nextInt();

			if ((choice == 1) || (choice == 2) || (choice == 3) || (choice == 4)) {
				switch (choice) {
				case 1:
					System.out.print("���ݾ� > ");
					deposit = input.nextInt();

					while (deposit < 0) {
						System.out.println("�ݾ��� �߸� �ԷµǾ����ϴ�.(���� �Է�)");
						System.out.println("�ٽ� �Է����ּ���.");
						System.out.print("���ݾ� > ");
						deposit = input.nextInt();
					}
					left += deposit;
					break;

				case 2:
					System.out.print("��ݾ� > ");
					withdraw = input.nextInt();

					while (left < withdraw) {
						System.out.println("�ܰ� �����մϴ�.");
						System.out.println("�ٽ� �Է����ּ���.");
						System.out.print("��ݾ� > ");
						withdraw = input.nextInt();
					}
					left -= withdraw;
					break;

				case 3:
					System.out.println("�ܰ� > " + left);
					break;

				case 4:
					System.out.println("���α׷� ����");
					break;
				}
			}

			else
				System.out.println("�߸��� �Է��Դϴ�.");

		} while (choice != 4);

	}
}
