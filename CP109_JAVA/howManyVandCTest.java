package project02;
import java.util.Scanner;
public class howManyVandCTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Howmany How = new Howmany();
		
		String A = input.nextLine();
		How.HowmanyCount(A);
	}
}
