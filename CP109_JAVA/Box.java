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
	
		System.out.println("���� : " + width +"cm");
		System.out.println("���� : " + length +"cm");
		System.out.println("���� : " + height +"cm");
		System.out.println("�ѳ��� : " + getArea() +"cm^2");
		System.out.println("���� : " + getVolume() +"cm^3");
	}
}

public class Box {
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	Boxclass b1 = new Boxclass();
	
	System.out.print("������ ������ ����(cm) >> ");
	b1.width = input.nextInt(); 
	System.out.print("������ ������ ����(cm) >> ");
	b1.length = input.nextInt(); 
	System.out.print("������ ������ ����(cm) >> ");
	b1.height = input.nextInt(); 
	
	b1.printBoxInfo();
	
	input.close();
	}

}
