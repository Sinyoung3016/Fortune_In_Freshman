package lab04_lab05;

public class LinkedList<T> implements List<T> {

	private class Node<E> {
		private E data;// 데이터가 저장되는 필드
		private Node<E> next;// 다음 노드를 참조하는 필드

		public Node(E input) {
			this.data = input;// 데이터 저장
			this.next = null;
		}

		public String toString() {
			return String.valueOf(this.data);// 노드의 데이터를 확인
		}
	}

	private Node<T> head;// 첫번째 노드를 가르키는 필드
	private Node<T> tail;// 마지막 노드를 가르키는 필드
	private int size = 0;// 리스트 원소의 개수

	public String toString() {
		// 리스트에 노드가 없으면 head가 null
		if (head == null)
			return "[]";
		// head 노드를 temp로 참조
		Node<T> temp = head;
		StringBuilder str = new StringBuilder("[");
		while (temp.next != null) {
			// temp의 다음 노드가 null이 아니면 while문 실행
			str.append(temp + ", ");
			temp = temp.next;
		}
		// 다음 연결이 null인 노드지만 노드에 데이터는 있으므로 따로 처리
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
		// 새로운 노드 생성
		Node<T> newNode = new Node<>(element);
		// 첫번째 자리에 위치하므로 가장 첫번째 노드인 헤드를 next로 만듬
		newNode.next = head;
		// head를 newNode로 옮김
		head = newNode;
		size++;
		// 만약 head.next == null인 경우, 즉 리스트 원소가 하나
		// 헤드와 테일은 같음
		if (head.next == null)
			tail = head;
		return true;
	}

	public boolean addLast(T element) {
		// size == 0이면 addFirst()를 호출
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
	
	// LinkedList 내부에서만 사용하기에 private로 선언
	private Node<T> node(int index) {
		Node<T> x = head;
		// 헤드 노드에서 index번 next를 호출하면
		// LinkedList의 index node를 알 수 있음
		for (int i = 0; i < index; i++)
			x = x.next;
		return x;
	}

	public boolean add(int index, T element) {
		// 잘못된 index가 오면 Exception 발생
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
			// 만약 temp1이 마지막 노드이면, 즉 newNode.next == null이면,
			// temp2 == null이고 newNode가 tail이 됨.
			if (newNode.next == null)
				tail = newNode;

		}
		return true;
	}

	public T removeFirst() {
		Node<T> temp = head;// 헤드노드 참조
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
		// 만약 삭제할 노드가 tail일때
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
