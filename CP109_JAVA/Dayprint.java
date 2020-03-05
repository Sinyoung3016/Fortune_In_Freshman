package project;
import java.util.Scanner;
public class Dayprint {
	public static void main(String[] args) {
		
		int year, month, day, totaldays = 0;	
		String 요일;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("연도를 입력하세요 : ");
		year = input.nextInt();
		System.out.print("월을 입력하세요 : ");
		month = input.nextInt();
		System.out.print("일을 입력하세요 : ");
		day = input.nextInt();
		
		if (year<=0)
			System.out.print("입력이 잘못 되었습니다");
		else
			if (year <1900 || year>2100)
				System.out.print("알고리즘을 사용하실 수 없습니다.");


			else if (year ==1900) {
				if (month <= 2 )
					System.out.print("알고리즘을 사용하실 수 없습니다.");
			}
			else if (year == 2100) {
				if (month >=1);
				System.out.print("알고리즘을 사용하실 수 없습니다.");
			}

			else { 

				totaldays=(year-1900)*365;

				totaldays+=(year-1900)/4;
				if (((year%4==0)&&(year%100!=0))||(year%400==0)){ 
					if (month<=2)
						totaldays = totaldays-1;
				}
		 
				switch(month) {
				case 1:
					totaldays += day;
					break;
				case 2:
					totaldays += 31 + day;
					break;
				case 3:
					if ( ((year % 4 == 0) && (year % 100 != 0) ) || (year % 400 == 0)){ //윤년이라면
						totaldays += 31+29+ day;
					}
					else 
						totaldays +=31+28+day;
					break;
				case 4:
					totaldays += 31+28+31 +day;
					break;
				case 5:
					totaldays += 31+28+31 +30+ day;
					break;
				case 6:
					totaldays += 31+28+31 +30+31+ day;
					break;
				case 7:
					totaldays += 31+28+31 +30+31+30+ day;
					break;
				case 8:
					totaldays += 31+28+31 +30+31+30+31+ day;
					break;
				case 9:
					totaldays +=31+28+31 +30+31+30+31+30+ day;
					break;
				case 10:
					totaldays += 31+28+31 +30+31+30+31+30+31+ day;
					break;
				case 11:
					totaldays += 31+28+31 +30+31+30+31+31+30+31+ day;
					break;
				case 12:
					totaldays += 31+28+31 +30+31+30+31+31+30+31+30+ day;
					break;
				}
				
		if (totaldays%7 == 0) 
			요일 ="일요일";
		else if (totaldays%7 == 1)
			요일 ="월요일";
		else if (totaldays%7 == 2)
			요일 ="화요일";
		else if (totaldays%7 == 3)
			요일 ="수요일";
		else if (totaldays%7 == 4)
			요일 ="목요일";
		else if (totaldays%7 == 5) 
			요일 ="금요일";
		else
				요일 ="토요일";
			
	
		if (month>12) {
			System.out.print("입력이 잘못 되었습니다.");
		}
		else
			switch(month) {
			case 1: case 3: case 5:  case 7: case 8: case 10: case 12:
				if (day>31)
					System.out.print("입력이 잘못 되었습니다.");
				else
					System.out.printf("%d년 %d월 %d일은 %s입니다.",year , month, day, 요일);
				break;

			case 4: case 6: case 9: case 11:
				if (day>30)
					System.out.print("입력이 잘못 되었습니다.");
				else 
					System.out.printf("%d년 %d월 %d일은 %s입니다.",year , month, day, 요일);
				break;
			case 2:
				if (( (year % 4 == 0) && (year % 100 != 0) ) || (year % 400 == 0)){ 
					if (day>29) {
						System.out.print("입력이 잘못 되었습니다.");
					}
					else 
						System.out.printf("%d년 %d월 %d일은 %s입니다.",year , month, day, 요일);
				}
				else if (day>28)
					System.out.print("입력이 잘못 되었습니다.");
				else
					System.out.printf("%d년 %d월 %d일은 %s입니다.",year , month, day, 요일);
				break;
			}
			}
	}
}
