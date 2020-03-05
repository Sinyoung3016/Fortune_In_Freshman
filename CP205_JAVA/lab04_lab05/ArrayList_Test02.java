package lab04_lab05;

public class ArrayList_Test02 {
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>();
		
		long start1 = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++)
			al.addLast(i);
		long end1 = System.currentTimeMillis();
		System.out.println((end1 - start1)/1000.0 + "��");
		//Array�� Linked �� �� ����� �ð��� �ҿ�Ǿ��µ�
		//�̴� size�� tail�� ����� ������ �Ͽ� ������ ���� ���� ã�� �� �־�
		//�������� ���� ���� �� ������, Array�� ��쿡�� array�� �� ������ ���
		//resize()�ؾ��ϱ� ������  �߰����� �ð��� �ҿ�ȴ�. �׷��� �Ѵ� �����
		//�ð��� �ҿ������ Array�� ���� �� ���� �ð��� �䱸�Ѵ�.
		
		long start2 = System.currentTimeMillis();
		for(int i = 0; i < 1000; i++)
			al.add(i*10, i*100);
		long end2 = System.currentTimeMillis();
		System.out.println((end2 - start2)/1000.0 + "��");
		
		long start3 = System.currentTimeMillis();
		for(int i = 0; i < 1000; i++)
			al.get(10*i);
		long end3 = System.currentTimeMillis();
		System.out.println((end3 - start3)/1000.0 + "��");
		//Linked�� �������� get�޼ҵ�� �� �����ٴ� ���� �� �� �ִ�.
		//�̴� Linked�� ��쿡�� get(n)�̸� n����ŭ Ȯ���ϸ� ���� ã�ư���������
		//�ݴ�� Array�� index������ ���� ã�ư��� ���� ������ �����̴�.
		
		long start5 = System.currentTimeMillis();
		for (int i = 1000; i > 0; i--)
			al.get(10 * i);
		long end5 = System.currentTimeMillis();
		System.out.println((end5 - start5) / 1000.0 + "��");
		
		long start4 = System.currentTimeMillis();
		for(int i = 0; i < 1000; i++)
			al.remove(i*10);
		long end4 = System.currentTimeMillis();
		System.out.println((end4 - start4)/1000.0 + "��");

	}
}
