package lab12_P;

public class Consumer implements Runnable {

	private DataBox_String dataBox;

	public Consumer(DataBox_String dataBox) {
		this.dataBox = dataBox;
	}

	@Override
	public void run() {
		for (int i = 1; i < 4; i++) {
			String data = dataBox.getData();
		}
	}
}
