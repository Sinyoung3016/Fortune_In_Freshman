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
	System.out.println((end1 - start1) / 1000.0 + "초");
	
	long start2 = System.currentTimeMillis();
	System.out.println("recursiveFibonacci : " + recursiveFibonacci(n));
	long end2 = System.currentTimeMillis();
	System.out.println((end2 - start2) / 1000.0 + "초");
	/* 재귀를 사용하면, 먼저 가독성이 좋으며 변수를 적게 사용하는 효과를 얻는다.
	 * 하지만 재귀는 함수를 호출할때마다 새로운 변수, 리턴값 등이 스택에 쌓이며 많은 메모리를 요구한다.
	 * 또한 스택프레임을 구성하고 헤체하는 과정에서 반복문보다 오버헤드가 들어 성능 또한 저하된다.
	 * 피보나치 재귀의 경우에는 함수를 부를때 함수 두개가 동시에 호출되는데 결국 n번 반복할때 
	 * 2^n개의 함수가 추가로 불려와 시간적으로도 반복자를 사용했을 때 보다 느리다.  
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
