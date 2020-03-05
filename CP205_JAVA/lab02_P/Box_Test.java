package lab02_P;

public class Box_Test  {
	public static void main(String[] args) {
		Box box = new Box();
		box.set("Java");
		String language = (String) box.get();

		box.set(new Integer(10));
		Integer number = (Integer) box.get();

		box.set(true);
		Boolean flag = (Boolean) box.get();

		box.set("Hello would");
		Integer i = (Integer) box.get();

	}
}
