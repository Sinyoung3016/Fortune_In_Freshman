package lab12_P;

public class ThreadA extends Thread {

	public ThreadA() {
		setName("ThreadA");
	}
	
	public void run() {
		System.out.println(getName() + "�� �����");
		System.out.println(getName() + "�� �����");
	}
}
