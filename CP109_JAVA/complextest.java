package project02;

public class complextest {

	public static void main(String[] args) {
	
	Complexclass num1 = new Complexclass();
	num1.real = 1.0;
	num1.imag = 1.0;
	System.out.print("num1 : ");
	num1.printComplex();
	
	Complexclass num2 = new Complexclass();
	num2.real = 2.5;
	num2.imag = -2.0;
	System.out.print("num2 : ");
	num2.printComplex();
	
	System.out.print("num1 + num2 = ");
	Complexclass num3 = num1.add(num2);
	num3.printComplex();
	
	System.out.print("num1 - num2 = ");
	Complexclass num4 = num1.minus(num2);
	num4.printComplex();
	
	System.out.print("num1 * num2 = ");
	Complexclass num5 = num1.multiply(num2);
	num5.printComplex();
	
	System.out.print("num2 / num1 = ");
	Complexclass num6 = num1.divide(num2);
	num6.printComplex();
	
	}
}