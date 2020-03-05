package lab02;

public class Triple_Test {
	public static void main(String[] args) {
		Triple<String> fruits = new Triple("사과", "포도", "배");
		System.out.println(fruits);

		Triple<Integer> num = new Triple();
		num.setFirst(10);
		num.setSecond(20);
		num.setThird(30);
		System.out.println(num);
	}
}
