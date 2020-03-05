package lab02_P;

public class Course<T> {
	private String courseName;
	private T[] students;

	public Course(String courseName, int capacity) {
		this.courseName = courseName;
		this.students = (T[]) new Object[capacity];
		//타입 파라미터로 배열을 생성하려면 (T[]) new Object[int a]
	}

	public String getCourseName() {
		return courseName;
	}

	public T[] getStudent() {
		return students;
	}
	
	public void add(T t) {
		for(int i = 0; i < students.length; i++) {
			if(students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
}
