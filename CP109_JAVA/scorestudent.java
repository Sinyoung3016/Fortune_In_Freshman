package project;
import java.util.Scanner;
public class scorestudent {
 public static void main(String[] args) {
	
	 Scanner input = new Scanner(System.in);
	 
	 System.out.print("몇명의 성적을 입력하겠습니까? : ");
	 int num = input.nextInt();
	 
	 double score = 0;
	 
	 int [] student = new int [num];
	 
	 for(int a = 0; a < num; a++)
	 {System.out.print("성적을 입력하세요 : ");
	  student[a] = input.nextInt();
	  score += student[a] ;
	 }
	 
	 double ave = score/num;
	 
	 System.out.printf("\n총점은 %.2f점이고, 평균 성적은 %.2f입니다.",score,ave);
}
}
