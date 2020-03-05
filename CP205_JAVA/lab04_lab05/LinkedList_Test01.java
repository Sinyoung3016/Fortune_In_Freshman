package lab04_lab05;

public class LinkedList_Test01 {
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		for(int i = 0;  i < 100000; i++)
			list.addLast(i);
		long start = System.currentTimeMillis();
		//Iterator을 사용하면, 시간복잡도가  n이다.
		Iterator<Integer> it = list.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		//get을 사용하면, n번째를 호출할때 n의 시간복잡도가 걸려서 
		//n개의 get을 호출하면, 시간복잡도가 n^2이므로 느림 
		//for(int i = 0; i  < list.size(); i++)
			//System.out.println(list.get(i));
		long end = System.currentTimeMillis();
		System.out.println((end - start)/1000.0 + "초");
	}
}
