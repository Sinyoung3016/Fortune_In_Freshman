package project;
import java.util.Scanner;
public class RSP02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String SY = null;
		String CY = null;
		int SYa = 0;
		int CYa = 0;
		String Winner;
		
		System.out.println("가위바위보 ㄱ");
		System.out.print("나: ");
		SY = input.next();
		System.out.print("너: ");
		CY = input.next();
		
		if( SY.equals("가위"))
			{SYa = 1;
			switch (CY){
				case "가위":
					SYa = 0;
					break;
				case "바위":
					SYa = 1;
					break;
				case "보":
					SYa = 0;
					break;
			}
			}
		
		else if( SY.equals("바위"))
			{SYa = 1;
			switch (CY){
				case "가위":
					SYa = 0;
					break;
				case "바위":
					SYa = 0;
					break;
				case "보":
					SYa = 1;
					break;
		}
		}
		
		else if( SY.equals("보"))
			{SYa = 1;
			switch (CY){
				case "가위":
					SYa = 1;
					break;
				case "바위":
					SYa = 0;
					break;
				case "보":
					SYa = 0;
					break;
		}
		}
		
		else
			System.out.println("다시");
		
	Winner = ((SYa)*(CYa))==1 ? "Win" : "Lose";
		
	System.out.println("나 "+ Winner);
		
	
	}
}