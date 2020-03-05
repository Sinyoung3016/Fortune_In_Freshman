package project;
import java.util.Scanner;
public class StringSwitch {
public static void main(String[] args) {
	
	int monthNumber;
	String month;
	
	Scanner input = new Scanner(System.in);
	System.out.println("До :");
	month = input.next();
	
	switch (month) {
	case "january":
		monthNumber = 1;
		break;
	case "feburary":
		monthNumber = 2;
		break;
	default :
		monthNumber = 0;
		break;
	}
	
	System.out.println(monthNumber);
	
}	
}
