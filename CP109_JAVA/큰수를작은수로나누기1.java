package project;
import java.util.Scanner;
import java.lang.Math;
public class 큰수를작은수로나누기1{
	public static void main(String[] args) {
	
		int a,b,c,d,e,f,g;
		
		Scanner input = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요 : ");
	    a =input.nextInt();
	    System.out.print("두번째 숫자를 입력하세요 : ");
	    b =input.nextInt();
	    
	    c = Math.abs(a-b);
	    
	    d = (a+b+c)/2;
	    e = (a+b-c)/2;
	    
	    f = d/e;
	    g = d%e;
	    		
	    System.out.printf("큰 수를 작은 수로 나눈 몫은 %d이고 나머지는 %d이다",f,g);
	    
	
	
	}
}