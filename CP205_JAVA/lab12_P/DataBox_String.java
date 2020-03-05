package lab12_P;

public class DataBox_String {

	private String data;

	public synchronized String getData() {
		if (this.data == null) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		String returnValue = data;
		System.out.println("Consumer Thread�� ���� ������ : " + returnValue);
		data = null;
		notify();
		return returnValue;
	}

	public synchronized void setData(String data) {
		if (this.data != null) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		this.data = data;
		System.out.println("Producer Thread�� ������ ������ : " + data);
		notify();
	}
}
