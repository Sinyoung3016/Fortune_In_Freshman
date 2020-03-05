package project;
import java.util.Scanner;
public class WorldOfSuccess03 {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	int total;
	
	System.out.println("a=1/b=2/c=3/.../z=26점 입니다.");
	
	char [] alpha = {'A','B','C','D','E','F','G','H','I','J','K',
			'L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	int [] score = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};
	
	do{ total = 0;
		System.out.print("단어를 입력하세요 :");
		String S = input.next();
		S = S.toUpperCase();
		
		for(int aa = 0; aa < 26; aa++) {
			for(int ii =0; ii< S.length(); ii++) {
				if(S.charAt(ii) != alpha[aa])
					continue;
					total += score[aa];}
		}
	
			if (total == 0)
			System.out.println("Wrong word! please try again!");
			else
			System.out.println(total + "점 입니다.");
	
	} while (total != 100);
		
	System.out.println("***End of Program***");
}
}
