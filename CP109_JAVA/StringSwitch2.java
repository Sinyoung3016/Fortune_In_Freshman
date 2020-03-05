package project;
import java.util.Scanner;
public class StringSwitch2 {
public static void main(String[] args) {
	
	String monthNumber;
	int month;
	
	Scanner input = new Scanner(System.in);
	System.out.println("До :");
	month = input.nextInt();
	
	switch (month) {
	case 1:
		monthNumber = "january";
		break;
	case 2:
		monthNumber = "february";
		break;
	default :
		monthNumber = "?";
		break;
	}
	
	System.out.println(monthNumber);
}
}