package project02;

class Calc02 {
	
	double average(double... d){
		int count =0;
		double M = 0;
		for(double x : d)
			{count++;
			M += x;}
	return M/count;
		
	}

}
