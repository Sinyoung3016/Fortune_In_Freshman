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
		System.out.println("(제한 횟수는 " + count + "번 입니다.)");
		System.out.println("현재상태 : " + print(answer));

		while (!compare(answer).equals(s)) {
			System.out.print("문자를 입력해주세요(한글자) : ");
			String a = input.next();
			if (a.length() != 1)
				System.out.println("한글자만 입력가능 합니다.");
			else {
				String sc = s.toLowerCase();
				a = a.toLowerCase();
				for (int i = 0; i < s.length(); i++)
					if (sc.charAt(i) == a.charAt(0))
						answer[i] = s.charAt(i);
			}
			count--;
			System.out.println("현재상태 : " + print(answer));
			if (count == 0) {
				System.out.println("정답을 맞추지 못했습니다.");
				System.out.println("정답 : " + s);
				break;
			}
		}
		if (count > 0)
			System.out.println("정답을 맟췄습니다.");

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
