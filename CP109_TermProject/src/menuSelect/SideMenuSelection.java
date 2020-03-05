
package menuSelect;

import java.util.InputMismatchException;

import termProject.SideMenu;

public class SideMenuSelection extends MenuSelection {//���ſ��� ����

	private int sum = 0;//�Ѿ�

	private SideMenu[] side = new SideMenu[8];

	public SideMenu[] getSide() {
		return side;
	}

	public SideMenuSelection() {

		side[0] = new SideMenu(1, "�Ŷ��", 1000);
		side[1] = new SideMenu(2, "���屹", 1000);
		side[2] = new SideMenu(3, "�̿���", 1000);
		side[3] = new SideMenu(4, "�ݶ�(500ml)", 500);
		side[4] = new SideMenu(5, "���̴�(500ml)", 500);
		side[5] = new SideMenu(6, "�꽺(������)(500ml)", 500);
		side[6] = new SideMenu(7, "��", 500);
		side[7] = new SideMenu(8, "����", 0);
	}

	@Override
	public int SelectingMenu() {// 01 �޴� ����
	
		boolean mS = false;

		while (mS == false) {// �ùٸ� ���� ���ö� ���� �ݺ�
			mS = true;
			System.out.println("\n\n�� ���Ͻô� ���̵� �޴��� ������ �ּ���.");
			System.out.println("\n�������������������������̵�޴�����������������������");

			for (int a = 0; a < 7; a++) {
				System.out.println(" " + side[a]);
			} // �޴�
			System.out.println(" (8) ����");
			System.out.println("������������������������������������������������������������\n");
			System.out.print("[��ȣ�� �Է��ϼ���] : ");

			try {
				IndexOfMenu = input.nextInt();//�޴��� ��ȣ ����
				if (0 >= IndexOfMenu || IndexOfMenu > 8) {// ���� �� �Է½�
					mS = false;
					System.out.println("�� �߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.");
				} else
					mS = true;
			} catch (InputMismatchException e) {// ���� �� �Է½�
				System.out.println("�� �߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.");
				mS = false;
				input.nextLine();
			}
		}
		return IndexOfMenu;
	}


	public int howMany(int menuIndex) {// 02 �޴��� ���� ����
		// 02 ���� ����
		boolean mA = false;

		if (0 < menuIndex && menuIndex < 8) {//���̵� �޴� �ʿ���
			while (mA == false) {
				mA = true;
				try {
					System.out.println("--------------------------------------------");

					while (true) {
						System.out.print(side[menuIndex - 1].getName() + "��(��) � ���ðڽ��ϱ�? : ");
						howMany = input.nextInt();// ����
						if (howMany <= 0) {// ������ ������ �ۼ���
							System.out.println("\n�� �߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
						} else {
							break;
						}
					}
					side[menuIndex - 1].setTotalPriceIn(howMany);
					System.out.println();
					System.out.print(side[menuIndex - 1].getName() + " " + howMany + " ���� "
							+ (side[menuIndex - 1].getprice()) * howMany + "�� �Դϴ�. ");
				} catch (InputMismatchException e) {//���� �� �Է½�
					System.out.println("�� �߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
					mA = false;
					input.nextLine();
				}

			}
		} else if (menuIndex == 8) {// ���̵� �޴��� �ʿ� ����
			howMany = 0;// �޴��� �������� �׳� 0���� ������ �����ߴٰ� ����
		}

		return howMany;
	}

	public void printSide() {//���� ������ ���̵�޴� ���� ������ in ������
		for (int a = 0; a < 8; a++) {
			if (side[a].getHowMany() > 0) {
				System.out.printf("   %d. [%s]: ����: %d, ����: %d \n", a + 1, side[a].getName(), side[a].getprice(),
						side[a].getHowMany());
			}
		}
	}

	public int Sum() {// ������ ������ 1�� �̻��� �޴��� ������ �����ּ��� = ���̵� �޴��� ����
		for (int a = 0; a < 8; a++) {
			if (side[a].getHowMany() > 0) {
				sum += side[a].getsideTotalPrice();
			}
		}
		return sum;

	}
}
