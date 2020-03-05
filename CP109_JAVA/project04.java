package project;

import java.util.Scanner;

public class project04 {
	public static void main(String[] args) {
		boolean x;
		int input;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 년? :");
		input = sc.nextInt();
		x = (input%400 == 0) ? true : false;
		
		boolean y = ((x||(input % 4 == 0)) && (x||(input % 100 != 0))) 
		? true : false;
		
		System.out.println("윤년여부 : " + y);
	}
}