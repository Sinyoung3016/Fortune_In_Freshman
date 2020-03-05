package lab02_P;

import java.util.Arrays;

public class WildCardExample {
	public static void printCourse(Course<?> course) {
		System.out.println(course.getCourseName() + 
				", ������" + Arrays.deepToString(course.getStudent()));
	}
	
	public static <T extends Student> void printStudentCourse(Course<T> course) {
		System.out.println(course.getCourseName() + 
				", ������" + Arrays.deepToString(course.getStudent()));
	}
	
	public static void printWorkerCourse(Course<? super Worker> course) {
		System.out.println(course.getCourseName() + 
				", ������" + Arrays.deepToString(course.getStudent()));
	}
	
	public static void main(String [] args) {
		Course <Person> courseForPerson = new Course<>("�Ϲ��ΰ���",4);
		courseForPerson.add(new Person("�Ϲ���"));
		courseForPerson.add(new Worker("������"));
		courseForPerson.add(new Student("�л�"));
		courseForPerson.add(new HighStudent("����л�"));
		Course <Worker> courseForWorker = new Course<>("�����ΰ���",1);
		courseForWorker.add(new Worker("������"));
		Course <Student> courseForStudent = new Course<>("�л�����",1);
		courseForStudent.add(new Student("�л�"));
		Course <HighStudent> courseForHighStudent = new Course<>("����л�����",1);
		courseForHighStudent.add(new HighStudent("����л�"));
		
		printCourse(courseForPerson);
		printCourse(courseForWorker);
		printCourse(courseForStudent);
		printCourse(courseForHighStudent);
		System.out.println();
		
		//printStudentCourse(courseForPerson);
		//printStudentCourse(courseForWorker);
		printStudentCourse(courseForStudent);
		printStudentCourse(courseForHighStudent);
		System.out.println();
		
		printWorkerCourse(courseForPerson);
		printWorkerCourse(courseForWorker);
		//printWorkerCourse(courseForStudent);
		//printWorkerCourse(courseForHighStudent);
		
	}
}
