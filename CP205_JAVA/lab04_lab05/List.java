package lab04_lab05;

public interface List<E> {	
	public boolean add(int index, E element);
	public boolean addFirst(E element);
	public boolean addLast(E element);
	public E remove(int index);
	public E removeFirst();
	public E removeLast();
	public E get(int index);
	public int indexOf(E element);
	public int size();
	public E set(int index, E element);
	public boolean isEmpty();
	public Iterator<E> iterator();
}
