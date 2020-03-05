package project02;
import java.util.Scanner;
public class reverseString {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("거꾸로 출력할 문자열 : ");
	String S = input.nextLine();
	
	System.out.print("거꾸로 출력한 문자열 : ");
	for(int a = 0; a< S.length(); a++)
		System.out.print(S.charAt(S.length() -(a+1) ));	
	}
}
