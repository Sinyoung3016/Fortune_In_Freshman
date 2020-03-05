package lab04_lab05;

public class LinkedList<T> implements List<T> {

	private class Node<E> {
		private E data;// �����Ͱ� ����Ǵ� �ʵ�
		private Node<E> next;// ���� ��带 �����ϴ� �ʵ�

		public Node(E input) {
			this.data = input;// ������ ����
			this.next = null;
		}

		public String toString() {
			return String.valueOf(this.data);// ����� �����͸� Ȯ��
		}
	}

	private Node<T> head;// ù��° ��带 ����Ű�� �ʵ�
	private Node<T> tail;// ������ ��带 ����Ű�� �ʵ�
	private int size = 0;// ����Ʈ ������ ����

	public String toString() {
		// ����Ʈ�� ��尡 ������ head�� null
		if (head == null)
			return "[]";
		// head ��带 temp�� ����
		Node<T> temp = head;
		StringBuilder str = new StringBuilder("[");
		while (temp.next != null) {
			// temp�� ���� ��尡 null�� �ƴϸ� while�� ����
			str.append(temp + ", ");
			temp = temp.next;
		}
		// ���� ������ null�� ������� ��忡 �����ʹ� �����Ƿ� ���� ó��
		str.append(temp.data);
		return str.toString() + "]";
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean addFirst(T element) {
		// ���ο� ��� ����
		Node<T> newNode = new Node<>(element);
		// ù��° �ڸ��� ��ġ�ϹǷ� ���� ù��° ����� ��带 next�� ����
		newNode.next = head;
		// head�� newNode�� �ű�
		head = newNode;
		size++;
		// ���� head.next == null�� ���, �� ����Ʈ ���Ұ� �ϳ�
		// ���� ������ ����
		if (head.next == null)
			tail = head;
		return true;
	}

	public boolean addLast(T element) {
		// size == 0�̸� addFirst()�� ȣ��
		if (isEmpty())
			addFirst(element);
		else {
			Node<T> newNode = new Node<>(element);
			tail.next = newNode;
			tail = newNode;
			size++;
		}
		return true;
	}
	
	// LinkedList ���ο����� ����ϱ⿡ private�� ����
	private Node<T> node(int index) {
		Node<T> x = head;
		// ��� ��忡�� index�� next�� ȣ���ϸ�
		// LinkedList�� index node�� �� �� ����
		for (int i = 0; i < index; i++)
			x = x.next;
		return x;
	}

	public boolean add(int index, T element) {
		// �߸��� index�� ���� Exception �߻�
		if (index < 0 || index > size)
			throw new IndexOutOfBoundsException();

		if (index == 0)
			addFirst(element);
		else {
			Node<T> temp1 = node(index - 1);
			Node<T> temp2 = temp1.next;
			Node<T> newNode = new Node<>(element);
			temp1.next = newNode;
			newNode.next = temp2;
			size++;
			// ���� temp1�� ������ ����̸�, �� newNode.next == null�̸�,
			// temp2 == null�̰� newNode�� tail�� ��.
			if (newNode.next == null)
				tail = newNode;

		}
		return true;
	}

	public T removeFirst() {
		Node<T> temp = head;// ����� ����
		head = temp.next;
		T returnData = temp.data;
		temp = null;
		size--;
		return returnData;
	}

	public T removeLast() {
		return remove(size - 1);
	}

	public T remove(int index) {
		if (index < 0 || index >= size)
			throw new IndexOutOfBoundsException();
		if (index == 0)
			return removeFirst();

		Node<T> temp = node(index - 1);
		Node<T> nodeToDelete = temp.next;
		temp.next = temp.next.next;
		T returnData = nodeToDelete.data;
		// ���� ������ ��尡 tail�϶�
		if (nodeToDelete == tail)
			tail = temp;
		nodeToDelete = null;
		size--;
		return returnData;
	}

	public T get(int index) {
		if (index < 0 || index >= size)
			throw new IndexOutOfBoundsException();
		return node(index).data;
	}

	public int indexOf(T element) {
		Node<T> temp = head;
		for (int i = 0; i < size; i++) {
			if (temp.data.equals(element))
				return i;
			temp = temp.next;
		}
		return -1;
	}

	public T set(int index, T element) {
		if (index < 0 || index >= size)
			throw new IndexOutOfBoundsException();

		Node<T> temp = node(index);
		T returnData = temp.data;
		temp.data = element;

		return returnData;
	}

	public Iterator<T> iterator() {
		return new ListIterator();
	}

	public class ListIterator implements Iterator<T> {
		private Node<T> temp;
		private int nextIndex;
		
		private ListIterator() {
			this.temp = head;
			nextIndex = 0;
		}
		
		public boolean hasNext() {
			return nextIndex < size;
		}
		
		public T next() {
			T preData = temp.data;
			temp = temp.next;
			nextIndex++;
			return preData;
		}
	}
}
