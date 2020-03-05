package lab12_P;

public class ThreadB  extends Thread{
	public void run() {
		System.out.println(getName() + "가 출력함");
		System.out.println(getName() + "가 출력함");
	}
}
