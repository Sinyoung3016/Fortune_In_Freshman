package project;
import java.util.Arrays;
import java.util.Scanner;
public class theaterbook {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		char answer;
		int [] seat = {0,0,0,0,0,0,0,0,0,0};
		
		do {System.out.print("�¼��� �����Ͻðڽ��ϱ�?(y/n) : ");
			answer = input.next().charAt(0);
		
			if (answer == 'y')
				{	System.out.println("���� ���� ��Ȳ(0:���¼�, 1:����� �¼�)");
					System.out.println("*******************************");
					System.out.println("�¼� ��ȣ : 1 2 3 4 5 6 7 8 9 10");
					System.out.println("*******************************");
					System.out.println("���� ���� : " + Arrays.toString(seat));
					System.out.print("�� ��° �¼��� �����Ͻðڽ��ϱ�?(1~10) :");
					int num = input.nextInt();
					 
						if ((num<1)||(num>10))
							{System.out.println("��ȿ���� ���� �¼���ȣ �Դϴ�. ");
							System.out.print("�ٽ� �Է����ּ���.\n");
							continue;}
						
						else
							{if (seat[num - 1] == 1)
								{System.out.println("�̹� ����� �¼��Դϴ�.");
								continue;}
							else
								seat[num-1] = 1;}
						
					System.out.printf("%d�� �¼��� ����Ǿ����ϴ�.\n",num); 
					
					}
			
		}while( answer !='n');
			System.out.println("���α׷��� �����մϴ�.");
				
					
	}
}
