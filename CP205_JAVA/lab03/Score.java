package lab03;

import java.util.*;

public class Score {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ArrayList<Character> gradeList = new ArrayList<>();
		GradeToScore sc = new GradeToScore();

		while (true) {
			System.out.print("학점을 입력하세요(A, B, C, D, F): ");
			String grade = input.nextLine();
			grade = grade.toUpperCase();

			if (grade.length() == 0)
				break;
			else {
				if (grade.charAt(0) >= 65 && grade.charAt(0) <= 70) {
					if (grade.charAt(0) == 69) {
						System.out.println("잘못된 학점 입력입니다.");
						continue;
					} else
						gradeList.add(grade.charAt(0));
				} else {
					System.out.println("잘못된 학점 입력입니다.");
					continue;
				}

			}
		}
		System.out.println("_____________________________");

		if (gradeList.size() == 0) {
			System.out.println("저장된 학점이 없습니다.");
		} else 
			  for (Character s : gradeList) 
				System.out.println("저장된 학점: " + s + " 변환한 점수: " + sc.map.get(s));

	}
}