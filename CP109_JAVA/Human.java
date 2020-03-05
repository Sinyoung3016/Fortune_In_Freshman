package project02;

class Human {
	private String name;
	private int age;
	
	public Human(String a, int b) {
		this.name = a;
		this.age = b;
	}
	
	public void setName(String a) {
		name = a;
	}
	
	public void setAge(int a) {
		age = a;
	}

	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return "이름 : "+name+", 나이 : "+ age;
	}
}

class Student extends Human{
	String major;
	
	public Student(String a, int b, String c) {
		super(a,b);
		this.major = c;
	}
	public void setName(String a) {
		super.setName(a);
	}
	
	
	public void setMajor(String a) {
		major = a;
	}
	
	public String getMajor() {
		return major; 
	}
	
	@Override
	public String toString() {
		return super.toString()+ ", 전공 : "+ major;
	}
}


