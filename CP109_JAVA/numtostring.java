package project;
import java.util.Scanner;
public class numtostring {
 public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	String total = null; 
	System.out.print("16진수 문자열을 입력하세요 : ");
	String S = input.next();
	
	String[] bi = {"0000 ","0001 ","0010 ","0011 ","0100 ","0101 ","0110 ",
			"0111 ","1000 ","1001 ","1010 ","1011 ","1100 ","1101 ","1110 ","1111 "};
	char[] hexa = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
	
	for(int a = 0; a<16; a++) {
		for(int i = 0; i< S.length(); i++) {
			if (S.charAt(i) == hexa[a])
				total += bi[a];
		}
	}
	System.out.printf("16진수 %s에 대한 2진수는 %s입니다.",S, total);
}
}
