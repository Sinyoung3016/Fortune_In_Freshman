package project;
import java.util.Scanner;
public class tri02 {
	public static void main(String[] args) {
	
	int x, y, z;//변의 길이
	String tri;
	
	Scanner input = new Scanner(System.in);
	System.out.println("삼각형의 첫번째 변의 길이를 입력하세요 :");
	x = input.nextInt();
	System.out.println("삼각형의 두번째 변의 길이를 입력하세요 :");
	y = input.nextInt();
	System.out.println("삼각형의 세번째 변의 길이를 입력하세요 :");
	z = input.nextInt();

	{if ((x>y)&&(x>z))
		tri = (((x>y)&&(x>z))&&(x<y+z))? "있습니다":"없습니다";
	else if ((y>x)&&(y>z))
		tri = (((y>x)&&(y>z))&&(y<x+z))? "있습니다":"없습니다";
	else
		tri = (((z>y)&&(z>x))&&(z<x+y))? "있습니다":"없습니다";}
	
	System.out.println("삼각형을 만들 수 "+ tri);
		
	
}
}
