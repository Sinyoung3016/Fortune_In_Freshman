package lab02_P;

public class GenericBox<T> {
	private T data;

	public T get() {
		return data;
	}

	public void set(T data) {
		this.data = data;
	}
}
