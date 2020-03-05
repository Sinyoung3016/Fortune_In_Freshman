package project02;
import java.util.Scanner;
import java.lang.Math;
class circleclass{
	private double radius;
	private double x;
	private double y;
	
	void setradius(double a) {
		if (a>=0)
			radius = a;
		else 
			radius = 0;

	}
	
	double getradius() {
		return radius;
	}
	
	void setx(double b) {
		x = b; 
	}
	
	double getx() {
		return x;
	}
	
	void sety(double c) {
		y = c;
	}
	
	double gety() {
		return y;
	}
	
	double area() {
		return radius*radius*Math.PI;
	}

}
