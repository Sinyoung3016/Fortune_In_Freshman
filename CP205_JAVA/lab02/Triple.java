package lab02;

public class Triple<T> {
	public T first;
	public T second;
	public T third;

	public Triple(T first, T second, T third) {
		this.first = first;
		this.second = second;
		this.third = third;
	}

	public Triple() {
	}

	public void setFirst(T first) {
		this.first = first;
	}

	public void setSecond(T second) {
		this.second = second;
	}

	public void setThird(T third) {
		this.third = third;
	}
	
	public T getFirst() {
		return first;
	}
	
	public T getSecond() {
		return second;
	}
	
	public T getThird() {
		return third;
	}

	public String toString() {
		return "First : "+ getFirst()+ ", Second : "+ getSecond() + ", Third : " + getThird();
	}
}
