package project02;
import java.util.Arrays;
public class ShapeTest {
	public static void main(String[] args) {
		
		Shape [] shapes = new Shape[7];
		
		shapes[0] = new Circle(1.0);
		shapes[1] = new Triangle(2.0);
		shapes[2] = new Rectangle(2.0,3.0);
		shapes[3] = new Triangle(3.0);
		shapes[4] = new Rectangle(5.0,2.3);
		shapes[5] = new Circle(2.5);
		shapes[6] = new Circle(1.3);
		
		for(Shape s : shapes)
			System.out.println(s);
		Arrays.sort(shapes);
		System.out.println();
		for(Shape s : shapes)
			System.out.println(s);
	}
}
