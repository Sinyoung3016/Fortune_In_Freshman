package project;
import java.util.Scanner;
public class Dayprint {
	public static void main(String[] args) {
		
		int year, month, day, totaldays = 0;	
		String ����;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		year = input.nextInt();
		System.out.print("���� �Է��ϼ��� : ");
		month = input.nextInt();
		System.out.print("���� �Է��ϼ��� : ");
		day = input.nextInt();
		
		if (year<=0)
			System.out.print("�Է��� �߸� �Ǿ����ϴ�");
		else
			if (year <1900 || year>2100)
				System.out.print("�˰����� ����Ͻ� �� �����ϴ�.");


			else if (year ==1900) {
				if (month <= 2 )
					System.out.print("�˰����� ����Ͻ� �� �����ϴ�.");
			}
			else if (year == 2100) {
				if (month >=1);
				System.out.print("�˰����� ����Ͻ� �� �����ϴ�.");
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
					if ( ((year % 4 == 0) && (year % 100 != 0) ) || (year % 400 == 0)){ //�����̶��
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
			���� ="�Ͽ���";
		else if (totaldays%7 == 1)
			���� ="������";
		else if (totaldays%7 == 2)
			���� ="ȭ����";
		else if (totaldays%7 == 3)
			���� ="������";
		else if (totaldays%7 == 4)
			���� ="�����";
		else if (totaldays%7 == 5) 
			���� ="�ݿ���";
		else
				���� ="�����";
			
	
		if (month>12) {
			System.out.print("�Է��� �߸� �Ǿ����ϴ�.");
		}
		else
			switch(month) {
			case 1: case 3: case 5:  case 7: case 8: case 10: case 12:
				if (day>31)
					System.out.print("�Է��� �߸� �Ǿ����ϴ�.");
				else
					System.out.printf("%d�� %d�� %d���� %s�Դϴ�.",year , month, day, ����);
				break;

			case 4: case 6: case 9: case 11:
				if (day>30)
					System.out.print("�Է��� �߸� �Ǿ����ϴ�.");
				else 
					System.out.printf("%d�� %d�� %d���� %s�Դϴ�.",year , month, day, ����);
				break;
			case 2:
				if (( (year % 4 == 0) && (year % 100 != 0) ) || (year % 400 == 0)){ 
					if (day>29) {
						System.out.print("�Է��� �߸� �Ǿ����ϴ�.");
					}
					else 
						System.out.printf("%d�� %d�� %d���� %s�Դϴ�.",year , month, day, ����);
				}
				else if (day>28)
					System.out.print("�Է��� �߸� �Ǿ����ϴ�.");
				else
					System.out.printf("%d�� %d�� %d���� %s�Դϴ�.",year , month, day, ����);
				break;
			}
			}
	}
}
