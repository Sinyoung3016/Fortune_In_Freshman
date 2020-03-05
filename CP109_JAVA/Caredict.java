package project02;

class Carclass{
	private double speed;
	private static final double MAXSPEED = 125.0;
	private String color;
	
	public Carclass(String color) {
		this.color = color;
		this.speed = 0.0;
	}
	
	public static double getMaxSpeed(){
		return MileToKillo(MAXSPEED);
	}
	
	public String getColor() {
		return color;
	}
	
	public double getSpeed() {
		return MileToKillo(speed);
	}
	
	public boolean speedUp(double speed) {
		
		speed = killoToMile(speed);
		
		double total = this.speed + speed;
		
		if ((total >= 0)&&(total <= MAXSPEED))
			{this.speed += speed;
			return true;}
		else 
			return false;
	}

	private static double killoToMile(double distance) {
		return distance/1.6;
	}
	private static double MileToKillo(double distance) {
		return distance*1.6;
	}
	
}

