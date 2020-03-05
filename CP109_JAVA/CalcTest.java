package project02;

public class CalcTest {
	public static void main(String[] args) {
	 Calc obj1 = new Calc();
	 
	 System.out.println(obj1.average(2.0, 3.0));
	 System.out.println(obj1.average(1.1, 2.2, 3.3));
	 
	 
	Calc02 obj2 = new Calc02();
	System.out.println(obj2.average(3.0, 5.0, 5.5, 7.7));
	}
}
