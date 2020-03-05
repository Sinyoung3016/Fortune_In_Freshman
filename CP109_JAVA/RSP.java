package project;
import java.util.Scanner;
public class RSP {
public static void main(String[] args) {
	
	String cs = null;
	String yh = null;
	String winner=null;
	
	Scanner input = new Scanner(System.in);
	System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요.");
	System.out.print("철수 >> ");
	cs = input.next();
	System.out.print("영희 >> ");
	yh = input.next();
	
	switch(cs) {
	case "가위":
		if (yh.equals("바위"))
			winner = "영희";
		else if (yh.equals("보"))
			winner = "철수";
		else
			winner = "무승부";
		break;
		
	case "바위":
		if (yh.equals("보"))
			winner = "영희";
		else if (yh.equals("가위"))
			winner = "철수";
		else
			winner = "무승부";
		break;
		
	case "보":
		if (yh.equals("가위"))
			winner = "영희";
		else if (yh.equals("주먹"))
			winner = "철수";
		else
			winner = "무승부";
		break;
		}
	
	System.out.println("Winner? "+ winner);
}
}
