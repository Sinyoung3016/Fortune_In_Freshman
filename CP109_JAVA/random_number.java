package project;
import java.util.Scanner;
import java.lang.Math;
public class random_number {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int random_num = (int)(100 * Math.random() + 1);
	int x;
	int count = 0;
	
	do {
		System.out.println("1부터 100 사이의 정수 중 하나를 선택하세요 : ");
		x = input.nextInt();
		
		if(random_num > x)
			System.out.println("정답은 더 큰 수 입니다.");
		
		else if(random_num < x)
			System.out.println("정답은 더 작은 수 입니다.");
		
		count++;
		}while(random_num != x);
	
		
	System.out.println("정답입니다.");
	System.out.println("게임을 종료합니다. :" + count);
	
	
			
}
}
