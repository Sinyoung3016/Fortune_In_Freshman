package lab02_P;

public class CompareGenericMethodTest {
	public static void main(String[] args) {
		Pair <Integer, String> p1 = new OrderedPair(1,"사과");
		Pair <Integer, String> p2 = new OrderedPair(1,"사과");
		Pair <Integer, String> p3 = new OrderedPair(2,"배");
		
		boolean result1 = Utility.compare(p1 ,p2);
		if(result1)
			System.out.println("동등한 객체");
		else
			System.out.println("동등하지 않은 객체");
		
		boolean result2 = Utility.compare(p2, p3);
		if(result2)
			System.out.println("동등한 객체");
		else
			System.out.println("동등하지 않은 객체");
		
	}
}

