package project;
import java.util.Scanner;
public class scorestudent {
 public static void main(String[] args) {
	
	 Scanner input = new Scanner(System.in);
	 
	 System.out.print("����� ������ �Է��ϰڽ��ϱ�? : ");
	 int num = input.nextInt();
	 
	 double score = 0;
	 
	 int [] student = new int [num];
	 
	 for(int a = 0; a < num; a++)
	 {System.out.print("������ �Է��ϼ��� : ");
	  student[a] = input.nextInt();
	  score += student[a] ;
	 }
	 
	 double ave = score/num;
	 
	 System.out.printf("\n������ %.2f���̰�, ��� ������ %.2f�Դϴ�.",score,ave);
}
}
