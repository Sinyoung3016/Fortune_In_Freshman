package lab12_P;

public class Worker extends Thread{
	private DataBox dataBox;
	private int workerData;
	
	public Worker(String workerName, int workerData) {
		this.workerData = workerData;
		this.setName(workerName);
	}
	
	public void setDataBox(DataBox databox) {
		this.dataBox = databox;
	}
	
	public void run() {
		dataBox.setData(workerData);
	}
}
