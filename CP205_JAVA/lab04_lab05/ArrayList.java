package lab04_lab05;

public class ArrayList<E> implements List<E> {
	private Object[] elementData;
	private int size = 0;

	public ArrayList() {
		this.elementData = new Object[10];
	}

	public ArrayList(int size) {
		this.elementData = new Object[size];
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder("[");
		for (int i = 0; i < size; i++) {
			str.append(elementData[i]);
			if (i < size - 1)
				str.append(", ");
		}
		str.append("]");
		return str.toString();
	}

	public void resize() {
		Object[] copyElementData = new Object[size * 2];
		System.arraycopy(elementData, 0, copyElementData, 0, size);
		this.elementData = copyElementData;
	}

	@Override
	public boolean addLast(E element) {
		if (size == elementData.length)
			resize();
		this.elementData[size] = element;
		size++;
		return true;
	}

	@Override
	public boolean addFirst(E element) {
		if (size == elementData.length)
			resize();
		return add(0, element);
	}

	@Override
	public boolean add(int index, E element) {
		if (size == elementData.length)
			resize();
		if (index <= size) {
			for (int i = size - 1; i >= index; i--)
				elementData[i + 1] = elementData[i];

			this.elementData[index] = element;
			size++;
		} else
			return false;
		return true;
	}

	@Override
	public E remove(int index) {
		Object obj = this.elementData[index];
		if (this.elementData[index] == null)
			throw new IndexOutOfBoundsException();
		else {
			for (int i = index + 1; i <= size - 1; i++)
				this.elementData[i - 1] = this.elementData[i];

			size--;
			elementData[size] = null;
		}
		return (E) obj;
	}

	@Override
	public E removeFirst() {
		return this.remove(0);
	}

	@Override
	public E removeLast() {
		return this.remove(size - 1);
	}

	@Override
	public E get(int index) {
		return (E) this.elementData[index];
	}

	@Override
	public int size() {
		return this.size;
	}

	@Override
	public int indexOf(E element) {
		for (int i = 0; i < size; i++)
			if (element.equals(this.elementData[i]))
				return i;
		return -1;
	}

	public boolean isEmpty() {
		if (this.size == 0)
			return true;
		return false;
	}

	public E set(int index, E element) {
		Object obj = this.elementData[index];
		if (this.elementData[index] == null)
			throw new IndexOutOfBoundsException();
		else {
			this.elementData[index] = element;

		}
		return (E) obj;
	}

	public Iterator<E> iterator() {
		return new ListIterator();
	}

	public class ListIterator<E> implements Iterator<E> {
		private int nextIndex;

		private ListIterator() {
			this.nextIndex = 0;
		}

		public boolean hasNext() {
			return nextIndex < size();
		}

		public E next() {
			return (E) elementData[nextIndex++];
		}
	}
}
