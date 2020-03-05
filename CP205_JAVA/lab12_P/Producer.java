package lab12_P;

public class Producer implements Runnable {

	private DataBox_String dataBox;

	public Producer(DataBox_String dataBox) {
		this.dataBox = dataBox;
	}

	@Override
	public void run() {
		for (int i = 1; i < 4; i++) {
			String data = "Data-" + i;
			dataBox.setData(data);
		}
	}
}
