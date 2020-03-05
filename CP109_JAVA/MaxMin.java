package project;
import java.util.Scanner;
import java.lang.Math;
import java.lang.reflect.Array;
public class MaxMin {
	
public static int minValue(int[] array) {
	 int min =0;
	 
	for(int a = 0; a < array.length; a++) {
		if(array[a] > min)
			min = array[a];
	}
	return min;
	
}

public static int maxValue(int[] array) {
	int max =0;
	for(int a = 0; a < array.length; a++) {
		if(array[a] < max)
			max = array[a];
	}
	return max;
}

public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int[] array = {1,2,3,10,20,50,-10,333,-2345,-8859,100,5,111};
	System.out.println("최소값 :" + minValue(array));
	System.out.println("최대값 :" + maxValue(array));
}
}
