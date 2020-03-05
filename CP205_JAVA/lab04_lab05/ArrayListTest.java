package lab04_lab05;

public class ArrayListTest {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(3);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addFirst(10);
		list.add(1, 15);
		System.out.println(list);
		System.out.println("list.size() : " + list.size());
		System.out.println("list.remove(4) : " + list.remove(4));
		System.out.println("20의 인덱스 : " + list.indexOf(20));
		list.set(0, 5);
		System.out.println("두번째 값 : " + list.get(1));
		System.out.println(list);
	}
}