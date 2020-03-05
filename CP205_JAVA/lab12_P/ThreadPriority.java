package lab12_P;

public class ThreadPriority extends Thread{
	public ThreadPriority(String name) {
		setName(name);
	}
	
	public void run() {
		try {
			sleep(2000);
			System.out.println(getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
