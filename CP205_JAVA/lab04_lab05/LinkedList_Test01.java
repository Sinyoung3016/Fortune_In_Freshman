package lab04_lab05;

public class LinkedList_Test01 {
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		for(int i = 0;  i < 100000; i++)
			list.addLast(i);
		long start = System.currentTimeMillis();
		//Iterator�� ����ϸ�, �ð����⵵��  n�̴�.
		Iterator<Integer> it = list.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		//get�� ����ϸ�, n��°�� ȣ���Ҷ� n�� �ð����⵵�� �ɷ��� 
		//n���� get�� ȣ���ϸ�, �ð����⵵�� n^2�̹Ƿ� ���� 
		//for(int i = 0; i  < list.size(); i++)
			//System.out.println(list.get(i));
		long end = System.currentTimeMillis();
		System.out.println((end - start)/1000.0 + "��");
	}
}
