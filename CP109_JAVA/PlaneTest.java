package project02;

public class PlaneTest {
	public static void main(String[]args) {
		Plane plane1 = new Plane("����","���� 747", 450);
		System.out.println("������ : " + plane1.getManufacturer());
		System.out.println("�𵨸� : " + plane1.getModel());
		System.out.println("�ִ� �°��� : " + plane1.getMaxNumOfPassenger() + "\n" );
		
		Plane plane2 = new Plane("����","���� 777", 500);
		System.out.println("������ : " + plane2.getManufacturer());
		System.out.println("�𵨸� : " + plane2.getModel());
		System.out.println("�ִ� �°��� : " + plane2.getMaxNumOfPassenger() + "\n" );
		
		plane2.setManufacturer("������ ��ƾ");
		plane2.setModel("F-22");
		plane2.setMaxNumOfPassenger(-10);
		
		System.out.println("������ : " + plane2.getManufacturer());
		System.out.println("�𵨸� : " + plane2.getModel());
		System.out.println("�ִ� �°��� : " + plane2.getMaxNumOfPassenger() + "\n" );

		System.out.println("����� ����� �� : " + Plane.getNumOfPlanes());
		
	}

}
