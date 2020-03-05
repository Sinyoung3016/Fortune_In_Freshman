package project;
import java.util.Scanner;
public class weather {
public static void main(String[] args) {
	
	int month= 0;
	String weather = null;
	
	Scanner input = new Scanner(System.in);
	System.out.println("월을 입력하세요(1-12) :");
	month = input.nextInt();
	
	System.out.println(month+"월은"+weather+"입니다.");
}
}
