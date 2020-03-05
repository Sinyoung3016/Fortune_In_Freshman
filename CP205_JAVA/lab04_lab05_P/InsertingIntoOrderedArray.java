package lab04_lab05_P;

public class InsertingIntoOrderedArray {
	public static void insert(int[] a, int n, int x) {
		// precon : 오름차순, and n < a.length;
		int i = 0;
		while(i < n && a[i] <= x)
			++i;
		System.arraycopy(a, i, a, i+1, n-i);
		a[i] = x;
	}
}
