package project;

import java.util.Scanner;

public class Worldofsuccess02 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("a=1/b=2/c=3/.../z=26점 입니다.");

		int Score = 0;
		
		do {Score = 0;
			System.out.print("단어를 입력하세요 :");
			String SS = input.next();
			SS = SS.toUpperCase();

			for (int ii = 0; ii < SS.length(); ii++) {
				if (SS.charAt(ii) != 'A')
					continue;
				Score += 1;
			}
			for (int ii = 0; ii < SS.length(); ii++) {
				if (SS.charAt(ii) != 'B')
					continue;
				Score += 2;
			}
			for (int ii = 0; ii < SS.length(); ii++) {
				if (SS.charAt(ii) != 'C')
					continue;
				Score += 3;
			}
			for (int ii = 0; ii < SS.length(); ii++) {
				if (SS.charAt(ii) != 'D')
					continue;
				Score += 4;
			}
			for (int ii = 0; ii < SS.length(); ii++) {
				if (SS.charAt(ii) != 'E')
					continue;
				Score += 5;
			}
			for (int ii = 0; ii < SS.length(); ii++) {
				if (SS.charAt(ii) != 'F')
					continue;
				Score += 6;
			}
			for (int ii = 0; ii < SS.length(); ii++) {
				if (SS.charAt(ii) != 'G')
					continue;
				Score += 7;
			}
			for (int ii = 0; ii < SS.length(); ii++) {
				if (SS.charAt(ii) != 'H')
					continue;
				Score += 8;
			}
			for (int ii = 0; ii < SS.length(); ii++) {
				if (SS.charAt(ii) != 'I')
					continue;
				Score += 9;
			}
			for (int ii = 0; ii < SS.length(); ii++) {
				if (SS.charAt(ii) != 'J')
					continue;
				Score += 10;
			}
			for (int ii = 0; ii < SS.length(); ii++) {
				if (SS.charAt(ii) != 'K')
					continue;
				Score += 11;
			}
			for (int ii = 0; ii < SS.length(); ii++) {
				if (SS.charAt(ii) != 'L')
					continue;
				Score += 12;
			}
			for (int ii = 0; ii < SS.length(); ii++) {
				if (SS.charAt(ii) != 'M')
					continue;
				Score += 13;
			}
			for (int ii = 0; ii < SS.length(); ii++) {
				if (SS.charAt(ii) != 'N')
					continue;
				Score += 14;
			}
			for (int ii = 0; ii < SS.length(); ii++) {
				if (SS.charAt(ii) != 'O')
					continue;
				Score += 15;
			}
			for (int ii = 0; ii < SS.length(); ii++) {
				if (SS.charAt(ii) != 'P')
					continue;
				Score += 16;
			}
			for (int ii = 0; ii < SS.length(); ii++) {
				if (SS.charAt(ii) != 'Q')
					continue;
				Score += 17;
			}
			for (int ii = 0; ii < SS.length(); ii++) {
				if (SS.charAt(ii) != 'R')
					continue;
				Score += 18;
			}
			for (int ii = 0; ii < SS.length(); ii++) {
				if (SS.charAt(ii) != 'S')
					continue;
				Score += 19;
			}
			for (int ii = 0; ii < SS.length(); ii++) {
				if (SS.charAt(ii) != 'T')
					continue;
				Score += 20;
			}
			for (int ii = 0; ii < SS.length(); ii++) {
				if (SS.charAt(ii) != 'U')
					continue;
				Score += 21;
			}
			for (int ii = 0; ii < SS.length(); ii++) {
				if (SS.charAt(ii) != 'V')
					continue;
				Score += 22;
			}
			for (int ii = 0; ii < SS.length(); ii++) {
				if (SS.charAt(ii) != 'W')
					continue;
				Score += 23;
			}
			for (int ii = 0; ii < SS.length(); ii++) {
				if (SS.charAt(ii) != 'X')
					continue;
				Score += 24;
			}
			for (int ii = 0; ii < SS.length(); ii++) {
				if (SS.charAt(ii) != 'Y')
					continue;
				Score += 25;
			}
			for (int ii = 0; ii < SS.length(); ii++) {
				if (SS.charAt(ii) != 'Z')
					continue;
				Score += 26;
			}
			
			if (Score == 0)
				System.out.println("Wrong word! please try again!");
			else
				System.out.println(Score + "점 입니다.");

		} while (Score != 100);

		System.out.println("***End of Program***");

	}
}
