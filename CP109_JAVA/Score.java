package project;
import java.util.Scanner;
public class Score {
	public static void main(String[] args) {
		
		float x,y,z;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("국어점수 :");
		x = input.nextInt();
		System.out.print("수학점수 :");
		y = input.nextInt();
		System.out.print("영어점수 :");
		z = input.nextInt();
		
		float total = x+y+z;
		System.out.println("총점 :" + total);
		
		float mean = (x+y+z)/3;
		System.out.printf("평균 : %.2f\n", mean);
		
		if (90<=mean)
			System.out.print("학점 : A");
		else if ((80<=mean)&&(90>=mean))
			System.out.print("학점 : B");
		else if ((70<=mean)&&(80>=mean))
			System.out.print("학점 : C");
		else if ((60<=mean)&&(70>=mean))
			System.out.print("학점 : D");
		else 
			System.out.print("학점 : F");
	
	}
}
