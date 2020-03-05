package lab04_lab05_P;

public class TestJavaUtilArrays {
	public static void main(String[] args) {
		int [] a = {77,44,55,22,99,66,33,88};
		print(a);
		java.util.Arrays.sort(a);
		print(a);
		test(a, 66);
		test(a, 60);
		test(a, 88);
		test(a, 90);
		
	}
	public static void print(int [] a) {
		System.out.print("{" + a[0]);
		for(int i = 1; i < a.length; i++)
			System.out.print("," + a[i]);
		System.out.println("}");
	}
	public static void test(int [] a, int target) {
		int i = java.util.Arrays.binarySearch(a, target);
		System.out.print("target = " + target + ", i = " + i);
		if(i >= 0)
				System.out.println("\ta[" + i + "]=" + a[i]);
		else
			System.out.println("\tinsert " + target + " at a[" + (-i-1) + "]");
	}
}
