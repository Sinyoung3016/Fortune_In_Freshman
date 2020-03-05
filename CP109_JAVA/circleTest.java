package project02;

import java.util.Scanner;

public class circleTest {
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		circleclass c1 = new circleclass();
		
		c1.setradius(3.6);
		c1.setx(0.0);
		c1.sety(1.5);
		
		System.out.println("¹İÁö¸§ : " + c1.getradius());
		System.out.println("Áß½É ÁÂÇ¥ : " + "(" + c1.getx() + "," + c1.gety() + ")" );
		System.out.printf("³ĞÀÌ : %.2f\n", c1.area());
		
		circleclass c2 = new circleclass();
		
		c2.setradius(-5.0);
		c2.setx(1.0);
		c2.sety(2.2);
		
		System.out.println("¹İÁö¸§ : " + c2.getradius());
		System.out.println("Áß½É ÁÂÇ¥ : " + "(" + c2.getx() + "," + c2.gety() + ")" );
		System.out.printf("³ĞÀÌ : %.2f\n", c2.area());
	}
}
