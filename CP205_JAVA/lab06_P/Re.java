package lab06_P;

public class Re {
	public static void main(String[] args) {
		System.out.println(fac(10));
		System.out.println(power(Math.PI, 3));
		System.out.println(reverseStr("JAVA"));
		int[] arr = { 1, 3, 4, 5, 3, 2, 11, 10, 7 };
		System.out.println(maxArr(arr, 0, arr.length - 1));
	}

	public static int fac(int n) {
		if (n == 0)
			return 1;
		else
			return n * fac(n - 1);
	}

	public static double power(double num, int exp) {
		if (exp == 0)
			return 1.0;
		else
			return num * power(num, exp - 1);
	}

	public static int maxArr(int[] arr, int begin, int end) {
		/*
		 * if(begin >= end) return arr[begin]; else { int max = maxArr(arr, begin+1,
		 * end); if(arr[begin] >= max) return arr[begin]; else return max; }
		 */
		int max = arr[begin];
		while (begin < end) {
			begin++;
			if (max < arr[begin])
				max = arr[begin];
		}
		return max;
	}

	public static String reverseStr(String str) {
		if (str.length() == 1)
			return "" + str.charAt(0);
		else
			return reverseStr(str.substring(1)) + str.charAt(0);
	}
}
