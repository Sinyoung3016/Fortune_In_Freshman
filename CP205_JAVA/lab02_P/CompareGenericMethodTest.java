package lab02_P;

public class CompareGenericMethodTest {
	public static void main(String[] args) {
		Pair <Integer, String> p1 = new OrderedPair(1,"���");
		Pair <Integer, String> p2 = new OrderedPair(1,"���");
		Pair <Integer, String> p3 = new OrderedPair(2,"��");
		
		boolean result1 = Utility.compare(p1 ,p2);
		if(result1)
			System.out.println("������ ��ü");
		else
			System.out.println("�������� ���� ��ü");
		
		boolean result2 = Utility.compare(p2, p3);
		if(result2)
			System.out.println("������ ��ü");
		else
			System.out.println("�������� ���� ��ü");
		
	}
}

