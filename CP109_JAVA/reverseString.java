package project02;
import java.util.Scanner;
public class reverseString {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("�Ųٷ� ����� ���ڿ� : ");
	String S = input.nextLine();
	
	System.out.print("�Ųٷ� ����� ���ڿ� : ");
	for(int a = 0; a< S.length(); a++)
		System.out.print(S.charAt(S.length() -(a+1) ));	
	}
}
