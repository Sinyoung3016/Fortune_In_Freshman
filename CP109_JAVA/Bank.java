package project;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int choice, deposit = 0, withdraw = 0, left = 0;

		do {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택 > ");
			choice = input.nextInt();

			if ((choice == 1) || (choice == 2) || (choice == 3) || (choice == 4)) {
				switch (choice) {
				case 1:
					System.out.print("예금액 > ");
					deposit = input.nextInt();

					while (deposit < 0) {
						System.out.println("금액이 잘못 입력되었습니다.(음수 입력)");
						System.out.println("다시 입력해주세요.");
						System.out.print("예금액 > ");
						deposit = input.nextInt();
					}
					left += deposit;
					break;

				case 2:
					System.out.print("출금액 > ");
					withdraw = input.nextInt();

					while (left < withdraw) {
						System.out.println("잔고가 부족합니다.");
						System.out.println("다시 입력해주세요.");
						System.out.print("출금액 > ");
						withdraw = input.nextInt();
					}
					left -= withdraw;
					break;

				case 3:
					System.out.println("잔고 > " + left);
					break;

				case 4:
					System.out.println("프로그램 종료");
					break;
				}
			}

			else
				System.out.println("잘못된 입력입니다.");

		} while (choice != 4);

	}
}
