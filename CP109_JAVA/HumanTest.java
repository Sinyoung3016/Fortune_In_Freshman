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
		
		System.out.print("이름 : "+stud.getName()+", ");
		System.out.print("나이 :"+stud.getAge()+", ");
		System.out.print("전공 : "+stud.getMajor()+", ");
	}
}
