package project;
import java.util.Arrays;
import java.util.Scanner;
public class theaterbook {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		char answer;
		int [] seat = {0,0,0,0,0,0,0,0,0,0};
		
		do {System.out.print("좌석을 예약하시겠습니까?(y/n) : ");
			answer = input.next().charAt(0);
		
			if (answer == 'y')
				{	System.out.println("현재 예약 상황(0:빈좌석, 1:예약된 좌석)");
					System.out.println("*******************************");
					System.out.println("좌석 번호 : 1 2 3 4 5 6 7 8 9 10");
					System.out.println("*******************************");
					System.out.println("예약 상태 : " + Arrays.toString(seat));
					System.out.print("몇 번째 좌석을 예약하시겠습니까?(1~10) :");
					int num = input.nextInt();
					 
						if ((num<1)||(num>10))
							{System.out.println("유효하지 않은 좌석번호 입니다. ");
							System.out.print("다시 입력해주세요.\n");
							continue;}
						
						else
							{if (seat[num - 1] == 1)
								{System.out.println("이미 예약된 좌석입니다.");
								continue;}
							else
								seat[num-1] = 1;}
						
					System.out.printf("%d번 좌석이 예약되었습니다.\n",num); 
					
					}
			
		}while( answer !='n');
			System.out.println("프로그램을 종료합니다.");
				
					
	}
}
