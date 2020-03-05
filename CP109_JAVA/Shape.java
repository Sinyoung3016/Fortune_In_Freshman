package project02;

import java.lang.Math;

public abstract class Shape implements Comparable<Shape> {
	public abstract double area();
	public abstract double perimeter();
	
	public int compareTo(Shape a) {
		if(a.area() <= this.area())
			return 1;
		else
			return -1;
	}
}

class Circle extends Shape {
	double radius;

	Circle(double radius) {
		this.radius = radius;
	}

	public double area() {
		return radius * radius * Math.PI;
	}

	public double perimeter() {
		return 2 * radius * Math.PI;
	}

	public String toString() {
		return String.format("도형의 종류 : 원, 둘레 : %.2fcm, 넓이 : %.2fcm^2", perimeter(), area());
	}


}

class Triangle extends Shape {
	double side;

	Triangle(double side) {
		this.side = side;
	}

	public double perimeter() {
		return 3 * side;
	}

	public double area() {
		return side * side * Math.sqrt(3) / 4;
	}

	public String toString() {
		return String.format("도형의 종류 : 삼각형, 둘레 : %.2fcm, 넓이 : %.2fcm^2", perimeter(), area());
	}

}

class Rectangle extends Shape {
	double width;
	double height;

	Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double area() {
		return width * height;
	}

	public double perimeter() {
		return 2 * (width + height);
	}

	public String toString() {
		return String.format("도형의 종류 : 직사각형, 둘레 : %.2fcm, 넓이 : %.2fcm^2", perimeter(), area());
	}
}