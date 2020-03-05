package lab03_P;

import java.util.*;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("0");
		list.add("1");
		list.add("2");
		list.add("3");
		list.set(2, "ตั");
		list.remove(3);
		System.out.println(list);

		Iterator<String> e = list.iterator();
		while (e.hasNext()) {
			String s = e.next();
			System.out.println(s);
		}
	}
}
