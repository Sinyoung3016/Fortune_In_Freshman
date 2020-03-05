package lab04_lab05;

public class LinkedList_Test02 {
	public static void main(String[] args) {
		List<Integer> al = new LinkedList<>();

		long start1 = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++)
			al.addLast(i);
		long end1 = System.currentTimeMillis();
		System.out.println((end1 - start1) / 1000.0 + "��");

		long start2 = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++)
			al.add(i * 10, i * 100);
		long end2 = System.currentTimeMillis();
		System.out.println((end2 - start2) / 1000.0 + "��");
		//Array�� �������� add �޼ҵ�� �� �����ٴ� ���� �� �� �ִ�.
		//add(i,v)�϶�, Array�� ��� ���� �߰��� �ֱ� ���� i+1���� ������ �̷��� �ϰ� 
		//�־��� ��쿡�� i�� 0�̸� ó������ ������ ���� �̷��� �ϰų� 
		//array�� ���� ä�����ִٸ� resize()�ؾ��Ѵ�.
		//��� Linked�� ����ϸ� ��� ��Ȳ�̵� ������ �ٲپ��ָ� �Ǳ� ������ �ð��� ª�� �ҿ�ȴ�.
		
		long start3 = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++)
			al.get(10 * i);
		long end3 = System.currentTimeMillis();
		System.out.println((end3 - start3) / 1000.0 + "��");
		
		long start5 = System.currentTimeMillis();
		for (int i = 1000; i > 0; i--)
			al.get(10 * i);
		long end5 = System.currentTimeMillis();
		System.out.println((end5 - start5) / 1000.0 + "��");

		long start4 = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++)
			al.remove(i * 10);
		long end4 = System.currentTimeMillis();
		System.out.println((end4 - start4) / 1000.0 + "��");
		//Array�� �������� remove�޼ҵ�� �� �����ٴ� ���� �� �� �ִ�.
		//add�� ���� ������ �߰��� ���� remove�Ѵٸ� �� ������ �ε����� array�� 
		//���� ������ ����;� �Ѵ�. Linked�� ��쿡�� ���������� �ٲپ��ָ� �Ǳ� 
		//������ �ð��� ���� �ҿ�ȴ�.
	
	}

}
