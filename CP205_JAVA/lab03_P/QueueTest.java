package lab03_P;

import java.util.*;

public class QueueTest {
	public static void main(String[] args) throws InterruptedException {
		
		int time = 10;
		Queue<Integer> queue = new LinkedList<>();
		for(int i = time; i >= 0; i--)
			queue.add(i);
		
		while(!queue.isEmpty()) {
			System.out.println(queue.remove() + " ");
			Thread.sleep(100);
		}
	}
}