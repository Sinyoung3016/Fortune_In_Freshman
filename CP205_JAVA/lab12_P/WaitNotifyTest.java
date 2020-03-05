package lab12_P;

public class WaitNotifyTest {
	public static void main(String[] args) {
		DataBox_String dataBox = new DataBox_String();
		
		Thread producer = new Thread(new Producer(dataBox));
		Thread consumer = new Thread(new Consumer(dataBox));
		
		producer.start();
		consumer.start();
	}
}
