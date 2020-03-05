package lab13;

import java.io.*;
import java.util.*;

class Hangman_Game {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new FileReader("./src/lab13/test.txt"));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String s = "";
		while(Math.random() < 0.5 || s.length() == 0) {
			s = st.nextToken();
		}
		
		int count = s.length() * 2;

		Scanner input = new Scanner(System.in);
		char[] answer = new char[s.length()];
		for (int i = 0; i < s.length(); i++)
			answer[i] = '_';

		System.out.println("HangManGame");
		System.out.println("(���� Ƚ���� " + count + "�� �Դϴ�.)");
		System.out.println("������� : " + print(answer));

		while (!compare(answer).equals(s)) {
			System.out.print("���ڸ� �Է����ּ���(�ѱ���) : ");
			String a = input.next();
			if (a.length() != 1)
				System.out.println("�ѱ��ڸ� �Է°��� �մϴ�.");
			else {
				String sc = s.toLowerCase();
				a = a.toLowerCase();
				for (int i = 0; i < s.length(); i++)
					if (sc.charAt(i) == a.charAt(0))
						answer[i] = s.charAt(i);
			}
			count--;
			System.out.println("������� : " + print(answer));
			if (count == 0) {
				System.out.println("������ ������ ���߽��ϴ�.");
				System.out.println("���� : " + s);
				break;
			}
		}
		if (count > 0)
			System.out.println("������ ������ϴ�.");

	}

	private static String print(char[] a) {
		String s = "";
		for (int i = 0; i < a.length; i++)
			s += (a[i] + " ");
		return s;
	}

	private static String compare(char[] a) {
		String s = "";
		for (int i = 0; i < a.length; i++)
			s += a[i];
		return s;
	}
}
