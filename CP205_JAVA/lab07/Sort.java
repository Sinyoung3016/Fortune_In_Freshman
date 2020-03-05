package lab07;

import java.util.*;

public class Sort {

	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void BubbleSort(int[] a) {
		for (int i = a.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++)
				if (a[j] > a[j + 1])
					swap(a, j, j + 1);
		}
	}

	public static void InsertionSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j <= i; j++) {
				if (a[j] >= a[i]) {
					int temp = a[i];
					for (int p = i; p > j; p--)
						a[p] = a[p - 1];
					a[j] = temp;
				}
			}
		}
	}

	public static void SelectionSort(int[] a) {
		for (int j = a.length - 1; j >= 0; j--) {
			int max = 0;
			int p = 0;
			for (int i = 0; i <= j; i++)
				if (a[i] > max) {
					max = a[i];
					p = i;
				}
			a[p] = a[j];
			a[j] = max;
		}
	}

	public static void RadixSort(int[] a) { // 값이 양수 일때만 가능
		Queue<Integer>[] bucket = new Queue[10];
		for (int i = 0; i < 10; i++)
			bucket[i] = new LinkedList<>();

		int n = 0;
		while (true) {
			for (int j = 0; j < a.length; j++)
				bucket[a[j] / (int) (Math.pow(10, n)) % 10].add(a[j]);

			int p = 0;
			for (int j = 0; j < 10; j++)
				while (!bucket[j].isEmpty())
					a[p++] = bucket[j].remove();

			int k = 0;
			for (int j = 0; j < a.length; j++)
				if (a[j] / (int) (Math.pow(10, n + 1)) == 0)
					k++;

			if (k == a.length)
				break;
			else
				n++;
		}
	}

	public static int[] makeRandArr(int n, int low, int high) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = (int) (Math.random() * (high-low+1) + low);
		// 위와 같은 방법으로 최대값 최솟값 구하기 가능
		return a;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		//랜덤
		//int[] arr = makeRandArr(n, 1, 100000);
		//내림차순
		int [] arr = new int [n];
		for(int i = 0; i < 30; i++)
			arr[i] = 5000 * (i);
		
		int[][] copy = new int[4][n];
		for (int i = 0; i < 4; i++)
			System.arraycopy(arr, 0, copy[i], 0, n - 1);

		long start = System.nanoTime();
		BubbleSort(copy[0]);
		long end = System.nanoTime();
		System.out.println("bubble sort : " + (end - start)  + " nano seconds");

		start = System.nanoTime();
		SelectionSort(copy[1]);
		end = System.nanoTime();
		System.out.println("selection sort : " + (end - start)  + " nano seconds");
		
		start = System.nanoTime();
		InsertionSort(copy[2]);
		end = System.nanoTime();
		System.out.println("insertion sort : " + (end - start)  + " nano seconds");

		start = System.nanoTime();
		RadixSort(copy[2]);
		end = System.nanoTime();
		System.out.println("radix sort : " + (end - start)  + " nano seconds");
	/*
	 * 1. 랜덤 정수 배열인 경우, n의 크기가 작으면 선택정렬이 가장 빠르고 계수정렬이 매우 느리다.
	 *  하지만 크키가 커지면 반대로 다른 정렬에 비해 계수정렬의 속도는 빠르고 다른 정렬은 매우 느린 속도를 가진다.
	 *  특히 버블 정렬의 속도가 매우 느리다.
	 * 2. 이미 정렬이 되어 있는 경우, n의 크기가 작으면 다은 정렬에 비해 계수정렬의 속도가 유독 느리지만
	 * 크면 삽입 정렬의 속도가 가장 느리며 계수정렬의 속도가 가장 빠르다는 것을 알 수 있다.
	 * 3. 역순으로 정렬이 되어 있는 경우, n의 크기가 작으면 계수정렬의 속도가 유독 느리지만
	 *  크키가 클 때는 선택 정렬이 매우 느리고 계수 정렬이 매우 빠른 것을 알 수 있다.
	 */
	
	}
}
