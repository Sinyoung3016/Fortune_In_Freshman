package termProject;

import java.util.InputMismatchException;
import java.util.Scanner;
public class ChoiceYN {//�������� ��ħ
	private int number;
	private int select = 0;

	Scanner input = new Scanner(System.in);

	public boolean YesOrNo(SideMenu[] side, int menuSelect, int howMany) {//���ſ��� ����

		int YoN = 1;
		while (YoN == 1) {// ���� ������ �ݺ�
			YoN = 1;
			try {
				System.out.println("\n�� �ùٸ��� �ԷµǾ����ϱ�?");
				System.out.print("\n[��ȣ�� �Է��ϼ���] (��1��: ��, ��2��: �ƴϿ� ) : ");
				select = input.nextInt();

				if (select == 1) {// ���� �� �϶�

					System.out.print("\n[��ȣ�� �Է��ϼ���]( <1> : ����, <2> : �߰� ���� ) : ");
					
					int select02 = input.nextInt();
					
					if (select02 == 1)// ����
						return false;
					else if (select02 == 2) {// �߰� ����
						return true;
					} else if (select02 != 2 && select02 != 1) {//������ ���
						YoN = 1;
						System.out.println("�� �߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.");
						return true;
					}

				} else if (select == 2) {// ���� �ƴϿ� �϶�
					side[menuSelect - 1].setTotalPriceOut(howMany);// ���� ���
					return true;
				}
				
				else if (select != 2 && select != 1) {//������ ���
					YoN = 1;
					side[menuSelect - 1].setTotalPriceOut(howMany);// ���� ���
					System.out.println("�� �߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.");
					return true;
				}


			} catch (InputMismatchException e) {
				side[menuSelect - 1].setTotalPriceOut(howMany);
				System.out.println("�� �߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.");
				YoN = 1;
				input.nextLine();
				return true;
			}
		}return false;
	}
	/////////////////////////////////////////////////////
	public int getNumber() {//�� ��ȣ�� ��ȯ
		return number;
	}

	public boolean Choice_YesOrNo() {//�ŵ����� ����
		number=0;
		System.out.print("\n[��ȣ�� �Է��ϼ���] (��1��: ��, ��2��: �ƴϿ�) : ");
		try {
			number = input.nextInt();
			}catch(InputMismatchException e) {
				input=new Scanner(System.in);

			}
		if (number <= 0 || number > 2) {
			System.out.println("�� �߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.");
			return Choice_YesOrNo();
		}
		else if(number==1){//���� ������ true�� ��ȯ
			return true;
		}
		else//�ƴϿ��� ������ false�� ��ȯ
			return false;
	}
	
}
