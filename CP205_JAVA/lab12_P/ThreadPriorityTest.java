package lab12_P;

public class ThreadPriorityTest {
	public static void main(String[] args) {
		for (int i = 1; i < 11; i++) {
			Thread thread = new ThreadPriority("thread" + i);
			if (i != 10)
				thread.setPriority(Thread.MIN_PRIORITY);
			else
				thread.setPriority(Thread.MAX_PRIORITY);

			thread.start();
		}
	}
}