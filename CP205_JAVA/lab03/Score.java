package lab03;

import java.util.*;

public class Score {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ArrayList<Character> gradeList = new ArrayList<>();
		GradeToScore sc = new GradeToScore();

		while (true) {
			System.out.print("������ �Է��ϼ���(A, B, C, D, F): ");
			String grade = input.nextLine();
			grade = grade.toUpperCase();

			if (grade.length() == 0)
				break;
			else {
				if (grade.charAt(0) >= 65 && grade.charAt(0) <= 70) {
					if (grade.charAt(0) == 69) {
						System.out.println("�߸��� ���� �Է��Դϴ�.");
						continue;
					} else
						gradeList.add(grade.charAt(0));
				} else {
					System.out.println("�߸��� ���� �Է��Դϴ�.");
					continue;
				}

			}
		}
		System.out.println("_____________________________");

		if (gradeList.size() == 0) {
			System.out.println("����� ������ �����ϴ�.");
		} else 
			  for (Character s : gradeList) 
				System.out.println("����� ����: " + s + " ��ȯ�� ����: " + sc.map.get(s));

	}
}