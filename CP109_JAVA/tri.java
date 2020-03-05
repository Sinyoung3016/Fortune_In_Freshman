package project;
import java.util.Scanner;
public class tri {
	public static void main(String[] args) {
	
	int x, y, z;//변의 길이
	
	Scanner input = new Scanner(System.in);
	System.out.println("삼각형의 첫번째 변의 길이를 입력하세요 :");
	x = input.nextInt();
	System.out.println("삼각형의 두번째 변의 길이를 입력하세요 :");
	y = input.nextInt();
	System.out.println("삼각형의 세번째 변의 길이를 입력하세요 :");
	z = input.nextInt();
	
	if ((x>y)&&(y>z))
		{if (x<y+z)
			System.out.println("삼각형을 만들 수 있습니다.");
		else
			System.out.println("삼각형을 만들 수 없습니다.");}
	
	else if ((x>z)&&(z>y))
		{if (x<y+z)
			System.out.println("삼각형을 만들 수 있습니다.");
		else
			System.out.println("삼각형을 만들 수 없습니다.");}
	
	else if ((y>x)&&(x>z))
		{if (y<x+z)
			System.out.println("삼각형을 만들 수 있습니다.");
		else
			System.out.println("삼각형을 만들 수 없습니다.");}
	
	else if ((y>z)&&(z>x))
		{if (y<x+z)
		System.out.println("삼각형을 만들 수 있습니다.");
		else
		System.out.println("삼각형을 만들 수 없습니다.");}
	
	else if ((z>x)&&(x>y))
		{if (z<x+y)
		System.out.println("삼각형을 만들 수 있습니다.");
		else
		System.out.println("삼각형을 만들 수 없습니다.");}
	
	else if ((z>y)&&(y>x))
		{if (z<x+y)
		System.out.println("삼각형을 만들 수 있습니다.");
		else
		System.out.println("삼각형을 만들 수 없습니다.");}
	
	

}
}
