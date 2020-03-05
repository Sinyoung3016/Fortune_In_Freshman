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

	public static void RadixSort(int[] a) { // ���� ��� �϶��� ����
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
		// ���� ���� ������� �ִ밪 �ּڰ� ���ϱ� ����
		return a;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		//����
		//int[] arr = makeRandArr(n, 1, 100000);
		//��������
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
	 * 1. ���� ���� �迭�� ���, n�� ũ�Ⱑ ������ ���������� ���� ������ ��������� �ſ� ������.
	 *  ������ ũŰ�� Ŀ���� �ݴ�� �ٸ� ���Ŀ� ���� ��������� �ӵ��� ������ �ٸ� ������ �ſ� ���� �ӵ��� ������.
	 *  Ư�� ���� ������ �ӵ��� �ſ� ������.
	 * 2. �̹� ������ �Ǿ� �ִ� ���, n�� ũ�Ⱑ ������ ���� ���Ŀ� ���� ��������� �ӵ��� ���� ��������
	 * ũ�� ���� ������ �ӵ��� ���� ������ ��������� �ӵ��� ���� �����ٴ� ���� �� �� �ִ�.
	 * 3. �������� ������ �Ǿ� �ִ� ���, n�� ũ�Ⱑ ������ ��������� �ӵ��� ���� ��������
	 *  ũŰ�� Ŭ ���� ���� ������ �ſ� ������ ��� ������ �ſ� ���� ���� �� �� �ִ�.
	 */
	
	}
}
