package lab03_P;
import java.util.*;
public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("milk");
		list.add("bread");
		list.add("butter");
		list.add(1, "apple");
		list.set(2, "grape");
		
		for(int i = 0; i < list.size(); i++) 
			System.out.println(list.get(i));
	}
}
