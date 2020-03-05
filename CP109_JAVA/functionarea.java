package project;
import java.util.Scanner;
import java.lang.Math;
public class functionarea {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	double cut, area_x =0;
	int loop_time = 0;
	
	System.out.print("등분 간격을 입력하세요 :");
	cut = input.nextDouble();
	
	for(double x = 0; x <= Math.PI ; x += cut)
	{area_x += cut * Math.sin(x);
	loop_time++;
	}
	
	System.out.println("0부터 pi까지의 sin함수의 적분값 :" + area_x);
	System.out.println("루프반복 횟수 :" + loop_time);
	
}
}
