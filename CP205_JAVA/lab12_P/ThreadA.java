package lab12_P;

public class ThreadA extends Thread {

	public ThreadA() {
		setName("ThreadA");
	}
	
	public void run() {
		System.out.println(getName() + "가 출력함");
		System.out.println(getName() + "가 출력함");
	}
}
