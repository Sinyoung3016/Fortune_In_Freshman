package project02;
import java.util.Scanner;
public class CaredictTest {
	public static void main(String[] args) {
		
		Carclass myCar = new Carclass("red");
		
		System.out.println("myCar�� ��: " + myCar.getColor());
		System.out.println("���� �ִ� �ӷ� : " + Carclass.getMaxSpeed() + "km/h");
		
		System.out.print("ù ��° speedUp(100.0km/h) : ");
		if(myCar.speedUp(100.0))
			System.out.println("�ӵ����� ����, ���� ���� �ӷ� " +myCar.getSpeed() + "km/h");
		else
			System.out.println("�ӵ����� �Ұ���, ���� ���� �ӷ� " +myCar.getSpeed() + "km/h");
		
		System.out.print("�� ��° speedUp(90.0km/h) : ");
		if(myCar.speedUp(90.0))
			System.out.println("�ӵ����� ����, ���� ���� �ӷ� " +myCar.getSpeed() + "km/h");
		else
			System.out.println("�ӵ����� �Ұ���, ���� ���� �ӷ� " +myCar.getSpeed() + "km/h");
		
		
		Carclass yourCar = new Carclass("blue");
		
		System.out.println("\nyourCar�� ��: " + yourCar.getColor());
		System.out.println("���� �ִ� �ӷ� : " + Carclass.getMaxSpeed() + "km/h");
		
		System.out.print("ù ��° speedUp(-100.0km/h) : ");
		if(yourCar.speedUp(-100.0))
			System.out.println("�ӵ����� ����, ���� ���� �ӷ� " +yourCar.getSpeed() + "km/h");
		else
			System.out.println("�ӵ����� �Ұ���, ���� ���� �ӷ� " +yourCar.getSpeed() + "km/h");
		
		System.out.print("�� ��° speedUp(210.0km/h) : ");
		if(yourCar.speedUp(210.0))
			System.out.println("�ӵ����� ����, ���� ���� �ӷ� " +yourCar.getSpeed() + "km/h");
		else
			System.out.println("�ӵ����� �Ұ���, ���� ���� �ӷ� " +yourCar.getSpeed() + "km/h");
		
	}
}
