package project02;

public class PlaneTest {
	public static void main(String[]args) {
		Plane plane1 = new Plane("º¸À×","º¸À× 747", 450);
		System.out.println("Á¦Á¶»ç : " + plane1.getManufacturer());
		System.out.println("¸ðµ¨¸í : " + plane1.getModel());
		System.out.println("ÃÖ´ë ½Â°´¼ö : " + plane1.getMaxNumOfPassenger() + "\n" );
		
		Plane plane2 = new Plane("º¸À×","º¸À× 777", 500);
		System.out.println("Á¦Á¶»ç : " + plane2.getManufacturer());
		System.out.println("¸ðµ¨¸í : " + plane2.getModel());
		System.out.println("ÃÖ´ë ½Â°´¼ö : " + plane2.getMaxNumOfPassenger() + "\n" );
		
		plane2.setManufacturer("·ÏÈ÷µå ¸¶Æ¾");
		plane2.setModel("F-22");
		plane2.setMaxNumOfPassenger(-10);
		
		System.out.println("Á¦Á¶»ç : " + plane2.getManufacturer());
		System.out.println("¸ðµ¨¸í : " + plane2.getModel());
		System.out.println("ÃÖ´ë ½Â°´¼ö : " + plane2.getMaxNumOfPassenger() + "\n" );

		System.out.println("»ý»êµÈ ºñÇà±â ¼ö : " + Plane.getNumOfPlanes());
		
	}

}
