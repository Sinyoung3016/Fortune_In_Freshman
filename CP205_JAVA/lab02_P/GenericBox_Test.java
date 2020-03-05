package lab02_P;

public class GenericBox_Test {
	public static void main(String[] args) {
		GenericBox<String> box1 = new GenericBox();
		box1.set("Java");
		String language = box1.get();

		GenericBox<Integer> box2 = new GenericBox();
		box2.set(new Integer(10));
		int number = box2.get();

		GenericBox<Boolean> box3 = new GenericBox();		
		box3.set(true);
		Boolean flag = box3.get();
	}
}