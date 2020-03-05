package project02;
import myutil.MyArrays;

class Person implements Comparable {
	private double height;
	private String name;

	public Person(String name, double height) {
		this.height = height;
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public double getHeight() {
		return height;
	}

	public static String getTallest(Person[] people) {
		return people[MyArrays.getMaximum(people)].getName();
	}

	@Override
	public int compareTo(Object o) {
		Person other = (Person) o;
		if (other.height == this.height)
			return 0;
		else if (other.height > this.height)
			return -1;
		else
			return 1;
	}
}
