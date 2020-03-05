package menuSelect;
import java.util.InputMismatchException;
import java.util.Scanner;

import termProject.Gimbap;
public class MainMenuSelection extends MenuSelection {//�ŵ����� ����

	
	private int price[]= {2500,3500,3500,3500,3500,3500,4000,4000,4000,4000,4000,4000,4500,4500,4500};//��� ���� �����س��� �迭
	private String[] menu = {"�������","��ġ���","���߱��","ġ����","��ġ���","��ä���","���������",
			"��������","������","������","ġŲ�������","������","�����","������̱��","��ġ��ġ���"};//��� �޴� �����س��� �迭
	
	
	public int getNumberOfmMenuArray() {//menu�迭�� ���� ��ȯ
		return menu.length;
	}
	public int getIndexOfMenu() {//������ �޴��� �ε�����+1 ��ȯ
		return IndexOfMenu;
	}
	public String getMenu(int index) {//�޴� �̸� ��ȯ
		return menu[index];
	}
	@Override
	public int SelectingMenu() {//�޴� ����� ���� �޼ҵ�
		System.out.println("��������������������������������������������������������������������������������������������������������������������ǡ�����������������������������������������������������������������������������������������������������������������");
		for (int i = 0; i < menu.length; i++) {
			if (i % 3 != 0)
				System.out.printf("��%d��: %s(%s��)  ", i + 1, menu[i], price[i]);
			else if (i == 0)
				System.out.printf("     ��%d��: %s(%s��)  ", i + 1, menu[i], price[i]);
			else
				System.out.printf("%n     ��%d��: %s(%s��)  ", i + 1, menu[i], price[i]);
		}
		System.out.println("\n��������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������");
		System.out.print("\n[��ȣ�� �Է��ϼ���] : ");

		try {
			IndexOfMenu=input.nextInt();
		}catch(InputMismatchException e) {
			input=new Scanner(System.in);//number_Of_Menu���� 0�� ��.
		}
		
		if (IndexOfMenu > menu.length || IndexOfMenu < 1) {
			System.out.println("�� �߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.");
			SelectingMenu();
		}
		
		return IndexOfMenu;
	}


	public void setGimbapMenuPrice(Gimbap gimbap, int menu_Num) {//gimbap�̶�� ��ü�� ����� �̸��� ������ ��������
		gimbap.setName(menu[menu_Num]);
		gimbap.setPrice(price[menu_Num]);
	}


	public int howMany(int Index) {//��� �ֹ��Ұ��� ���� �޼ҵ�
		while (true) {
			System.out.print("\n��"+menu[Index]+"��(��) �� ���� �ֹ��Ͻðڽ��ϱ�? : ");
		
			try {
				howMany = input.nextInt();
			}catch(InputMismatchException e) {
				input=new Scanner(System.in);
				howMany=0;
			}

			if(howMany<1) {
				System.out.println("���߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.");
			}
			else {
			return howMany;
			}
		}
	}


}
