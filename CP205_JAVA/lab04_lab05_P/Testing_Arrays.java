package lab04_lab05_P;

import java.util.*;

public class Testing_Arrays {
	private static java.util.Random random = new java.util.Random();

	public static void main(String[] args) {
		int [] a = randomInts(10, 1000);
		int [] aa = a.clone();
		print(a);
		print(aa);
		a[0] = a[1] = a[2] = 888;
		print(a);
		print(aa);
		}
	
	public static int[] randomInts(int n, int range) {
		int [] a = new int[n];
		for(int i = 0; i < n; i++)
			a[i] = random.nextInt(range);
		return a;
	}
	public static void print(int [] a) {
		System.out.print("{" + a[0]);
		for(int i = 1; i < a.length; i++)
			System.out.print("," + a[i]);
		System.out.println("}");
	}
}
