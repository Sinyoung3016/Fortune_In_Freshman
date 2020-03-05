package project02;

class Complexclass{
	
	double real;
	double imag;
	
	void printComplex(){
		if (imag > 0)
			System.out.println(real+"+"+imag+"i"); 
		else if (imag < 0)
			System.out.println(real+""+imag+"i"); 
	}
	
	public Complexclass() {
		this.real = real;
		this.imag = imag;
	}
	
	public Complexclass(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}
	
	Complexclass add(Complexclass x){
		double re = real + x.real;
		double im = imag + x.imag;
		Complexclass result = new Complexclass(re, im);
		return result;
	}
	
	Complexclass minus(Complexclass x){
		double re = real - x.real;
		double im = imag - x.imag;
		Complexclass result = new Complexclass(re, im);
		return result;
	}
	
	Complexclass multiply(Complexclass x){
		double re = real * x.real;
		re -= imag * x.imag;
		double im = real * x.imag + x.real * imag;
		Complexclass result = new Complexclass(re, im);
		return result;	
	}
	
	Complexclass divide(Complexclass x){
		double re;
		double im;
		re = (x.real*real + x.imag*imag)/(real*real + imag*imag);
		im = (x.imag*real - x.real*imag)/(real*real + imag*imag);
		Complexclass result = new Complexclass(re, im);
		return result;
	}
}
