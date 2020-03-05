package lab06;
import java.util.*;
public class fibo {

public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("n = ");
	int n = input.nextInt();
	long start1 = System.currentTimeMillis();
	System.out.println("loopFibonacci : " + loopFibonacci(n));
	long end1 = System.currentTimeMillis();
	System.out.println((end1 - start1) / 1000.0 + "��");
	
	long start2 = System.currentTimeMillis();
	System.out.println("recursiveFibonacci : " + recursiveFibonacci(n));
	long end2 = System.currentTimeMillis();
	System.out.println((end2 - start2) / 1000.0 + "��");
	/* ��͸� ����ϸ�, ���� �������� ������ ������ ���� ����ϴ� ȿ���� ��´�.
	 * ������ ��ʹ� �Լ��� ȣ���Ҷ����� ���ο� ����, ���ϰ� ���� ���ÿ� ���̸� ���� �޸𸮸� �䱸�Ѵ�.
	 * ���� ������������ �����ϰ� ��ü�ϴ� �������� �ݺ������� ������尡 ��� ���� ���� ���ϵȴ�.
	 * �Ǻ���ġ ����� ��쿡�� �Լ��� �θ��� �Լ� �ΰ��� ���ÿ� ȣ��Ǵµ� �ᱹ n�� �ݺ��Ҷ� 
	 * 2^n���� �Լ��� �߰��� �ҷ��� �ð������ε� �ݺ��ڸ� ������� �� ���� ������.  
	*/
}
	public static int loopFibonacci(int n) {
		int a = 0; int b = 1; int c = 0;
		if (n == 0)
			c = 0;
		else if (n == 1)
			c = 1;
		else {
			for (int i = 1; i < n; i++) {
				c = a + b;
				a = b;
				b = c;
			}
		}
		return c;
	}

	public static int recursiveFibonacci(int n) {
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else {
			return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
		}
	}

}
