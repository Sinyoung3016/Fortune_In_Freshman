package project02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class trycatch02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b, c;
		while (true) {
			try {
				System.out.println("어떤 수를 나누시겠습니까?>>");
				a = input.nextInt();
				System.out.println("어떤 수로 나누시겠습니까?>>");
				b = input.nextInt();
				c = a / b;
				break;
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다.");
			} catch (InputMismatchException e) {
				System.out.println("잘못된 입력입니다.");
			}
		}
		System.out.println(a + "/" + b + "=" + c);
		input.close();
	}
}
