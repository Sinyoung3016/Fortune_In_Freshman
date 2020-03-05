package lab03_P;
import java.util.*;

class Student implements Comparable<Student>{
	private int number;
	private String name;
	
	public Student(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
	
	public int compareTo(Student s) {
		return number - s.number;
	}
	
}

class MapTest {
	public static void main(String[] args) {
		Map<String, Student> st = new HashMap<>();
	
		st.put("1", new Student(1, "a"));
		st.put("2", new Student(2, "b"));
		st.put("3", new Student(3, "c"));
		
		System.out.println(st);
		st.remove("2");
		st.put("3", new Student(3, "d"));
		
		for(Map.Entry<String, Student> s : st.entrySet()) {
			String key = s.getKey();
			Student value = s.getValue();
			System.out.println("key = " + key + ", value = " + value);	
		}
	}
}
