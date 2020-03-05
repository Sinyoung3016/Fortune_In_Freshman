package project02;
import java.util.Scanner;
public class CaredictTest {
	public static void main(String[] args) {
		
		Carclass myCar = new Carclass("red");
		
		System.out.println("myCar의 색: " + myCar.getColor());
		System.out.println("차의 최대 속력 : " + Carclass.getMaxSpeed() + "km/h");
		
		System.out.print("첫 번째 speedUp(100.0km/h) : ");
		if(myCar.speedUp(100.0))
			System.out.println("속도변경 가능, 현재 차의 속력 " +myCar.getSpeed() + "km/h");
		else
			System.out.println("속도변경 불가능, 현재 차의 속력 " +myCar.getSpeed() + "km/h");
		
		System.out.print("두 번째 speedUp(90.0km/h) : ");
		if(myCar.speedUp(90.0))
			System.out.println("속도변경 가능, 현재 차의 속력 " +myCar.getSpeed() + "km/h");
		else
			System.out.println("속도변경 불가능, 현재 차의 속력 " +myCar.getSpeed() + "km/h");
		
		
		Carclass yourCar = new Carclass("blue");
		
		System.out.println("\nyourCar의 색: " + yourCar.getColor());
		System.out.println("차의 최대 속력 : " + Carclass.getMaxSpeed() + "km/h");
		
		System.out.print("첫 번째 speedUp(-100.0km/h) : ");
		if(yourCar.speedUp(-100.0))
			System.out.println("속도변경 가능, 현재 차의 속력 " +yourCar.getSpeed() + "km/h");
		else
			System.out.println("속도변경 불가능, 현재 차의 속력 " +yourCar.getSpeed() + "km/h");
		
		System.out.print("두 번째 speedUp(210.0km/h) : ");
		if(yourCar.speedUp(210.0))
			System.out.println("속도변경 가능, 현재 차의 속력 " +yourCar.getSpeed() + "km/h");
		else
			System.out.println("속도변경 불가능, 현재 차의 속력 " +yourCar.getSpeed() + "km/h");
		
	}
}
