package project02;

class Time {
	
	private int hour;
	private int minute;
	private int second;
	
	public Time(){
		int hour = 0;
		int minute = 0;
		int second = 0; 
	 }
	
	public Time(int h, int m, int s) {
		this.hour = (0<=h)&&(h<60) ? h : 0 ;
		this.minute = (0<=m)&&(m<60) ? m : 0 ;
		this.second = (0<=s)&&(s<60) ? s : 0 ;
	}
	
	public String toString() {
		return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
	}

}
