package project;
import java.util.Scanner;
public class project05 {
	public static void main(String[] args) {
	 
		int x;
		
		Scanner input = new Scanner(System.in);
		System.out.print("int형 정수를 입력하세요 : ");
		x = input.nextInt();
		
		String s = Integer.toBinaryString(x);
		System.out.println("정수"+ x +"의 이진수 표현은" + s+ "이다.");
	
		int t = 1&(x>>2);
		
		String a = Integer.toBinaryString(t);
		System.out.println("정수"+ x +"의 오른쪽 끝에서 3번째 비트는"+a+"이다.");
		
	    int f = 1&(x>>4);
		
		String b = Integer.toBinaryString(f);
		System.out.println("정수"+ x +"의 오른쪽 끝에서 5번째 비트는"+b+"이다.");
		
       
	}
}
