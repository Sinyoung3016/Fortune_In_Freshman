package project02;

public class Plane {
	private String manufacturer;
	private String model;
	private int maxNumOfPassenger;
	private static int numOfPlanes = 0;
	
	public Plane() {
		this.manufacturer = null;
		this.model = null;
		this.maxNumOfPassenger = 0;
		numOfPlanes++;
	}
	
	public Plane(String ma, String mo, int num){
		this.manufacturer = ma;
		this.model = mo;
		this.maxNumOfPassenger = num;
		numOfPlanes++;
	}
	
	public static int getNumOfPlanes() {
		return numOfPlanes;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getMaxNumOfPassenger() {
		return maxNumOfPassenger;
	}
	
	public void setMaxNumOfPassenger(int maxNumOfPassenger) {
		if (maxNumOfPassenger > 0)
			this.maxNumOfPassenger = maxNumOfPassenger;
		else
			this.maxNumOfPassenger = 0;
	}
	
	
}
