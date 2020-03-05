package lab04_lab05;

public class LinkedList_Test02 {
	public static void main(String[] args) {
		List<Integer> al = new LinkedList<>();

		long start1 = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++)
			al.addLast(i);
		long end1 = System.currentTimeMillis();
		System.out.println((end1 - start1) / 1000.0 + "초");

		long start2 = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++)
			al.add(i * 10, i * 100);
		long end2 = System.currentTimeMillis();
		System.out.println((end2 - start2) / 1000.0 + "초");
		//Array랑 비교했을때 add 메소드는 더 빠르다는 것을 알 수 있다.
		//add(i,v)일때, Array의 경우 값을 중간에 넣기 위해 i+1부터 끝까지 미루어야 하고 
		//최악인 경우에는 i가 0이면 처음부터 끝까지 전부 미루어야 하거나 
		//array가 전부 채워져있다면 resize()해야한다.
		//대신 Linked를 사용하면 어떠한 상황이든 참조만 바꾸어주면 되기 때문에 시간이 짧게 소요된다.
		
		long start3 = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++)
			al.get(10 * i);
		long end3 = System.currentTimeMillis();
		System.out.println((end3 - start3) / 1000.0 + "초");
		
		long start5 = System.currentTimeMillis();
		for (int i = 1000; i > 0; i--)
			al.get(10 * i);
		long end5 = System.currentTimeMillis();
		System.out.println((end5 - start5) / 1000.0 + "초");

		long start4 = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++)
			al.remove(i * 10);
		long end4 = System.currentTimeMillis();
		System.out.println((end4 - start4) / 1000.0 + "초");
		//Array랑 비교했을때 remove메소드는 더 빠르다는 것을 알 수 있다.
		//add와 같은 이유로 중간의 값을 remove한다면 그 이후의 인덱스와 array를 
		//전부 앞으로 끌어와야 한다. Linked의 경우에는 역시참조만 바꾸어주면 되기 
		//때문에 시간이 적게 소요된다.
	
	}

}
