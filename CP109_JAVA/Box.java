package project02;
import java.util.Scanner;
class Boxclass {
	int width =0 ;
	int length = 0;
	int height= 0;
	
	int getArea() {
		int Area = 2*(width*length + width*height + height*length);
		return Area;
	}
	
	int getVolume() { 
		int Volume = width*length*height;
		return Volume;
	}
	
	void printBoxInfo() {
	
		System.out.println("가로 : " + width +"cm");
		System.out.println("세로 : " + length +"cm");
		System.out.println("높이 : " + height +"cm");
		System.out.println("겉넓이 : " + getArea() +"cm^2");
		System.out.println("부피 : " + getVolume() +"cm^3");
	}
}

public class Box {
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	Boxclass b1 = new Boxclass();
	
	System.out.print("상자의 가로의 길이(cm) >> ");
	b1.width = input.nextInt(); 
	System.out.print("상자의 세로의 길이(cm) >> ");
	b1.length = input.nextInt(); 
	System.out.print("상자의 높이의 길이(cm) >> ");
	b1.height = input.nextInt(); 
	
	b1.printBoxInfo();
	
	input.close();
	}

}
