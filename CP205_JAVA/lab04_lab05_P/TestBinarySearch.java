package lab04_lab05_P;

public class TestBinarySearch {
	public static void main(String[] args) {
		int a [] = {22,33,44,55,66,77,88,99};
		System.out.println("search(a,55) :" + search(a,55));
		System.out.println("search(a,50) :" + search(a,60));

	}

	public static int search(int[] a, int target) {
		int p = 0; int q = a.length - 1;
		while(p <= q) {
			int i = (p+q)/2;
			if(a[i] == target)
				return i;
			
			if(a[i] < target)
				p = i + 1;
			else
				q = i - 1;
		}
		return -p-1;
	}
}
