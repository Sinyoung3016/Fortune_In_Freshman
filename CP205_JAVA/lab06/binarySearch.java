package lab06;

import java.util.*;

public class binarySearch {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 100; i++)
			list.add(2 * i);

		System.out.println("���� Ž������ 150Ž�� : " + binarySearch(list, 150, 0, list.size() - 1));
		System.out.println("list.get(75) : " + list.get(75));
		System.out.println("���� Ž������ 111Ž�� : " + binarySearch(list, 111, 0, list.size() - 1));
	}

	public static <T> int binarySearch(ArrayList<? extends Comparable<T>> list, T target, int begin, int end) {

		if (begin > end)
			return -1;
		int mid = (begin + end) / 2;
		
		if (list.get(mid).equals(target))
			return mid;
		else if ((list.get(mid)).compareTo(target) < 0)
			return binarySearch(list, target, mid + 1, end);
		else
			return binarySearch(list, target, begin, mid - 1);

	}
/*
	public static <T> int binarySearch(ArrayList<? extends Comparable<T>> list, T target, int begin, int end) {
		int mid;
		while(begin <= end) {
			mid = (begin + end) / 2;
			if(list.get(mid).equals(target))
				return mid;
			else if ((list.get(mid)).compareTo(target) < 0)
				begin = mid + 1;
			else
				end = mid - 1;
		}
		return -1;
	}*/
}