package project;
import java.util.Scanner;
public class project01 {
	public static void main(String[] args) {
	int x = 0;
	
	String s = Integer.toBinaryString(x);
	
	Scanner input = new Scanner(System.in);
	System.out.println("정수를 입력하시오 :");
	x = input.nextInt();
	 
	System.out.println(x+"의 2배수는"  );
	
		
	}
}
