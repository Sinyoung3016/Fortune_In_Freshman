package project02;

public class HumanTest {
	public static void main(String[] args) {
	
		Human man = new Human("Steve",30);
		System.out.println(man);
		
		Student stud = new Student("Parker",23,"Physics");
		System.out.println(stud);
		
		stud.setName("Peter");
		stud.setAge(19);
		stud.setMajor("computer science");
		
		System.out.print("�̸� : "+stud.getName()+", ");
		System.out.print("���� :"+stud.getAge()+", ");
		System.out.print("���� : "+stud.getMajor()+", ");
	}
}
