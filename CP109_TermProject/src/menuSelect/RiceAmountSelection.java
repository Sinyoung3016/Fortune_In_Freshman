package menuSelect;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RiceAmountSelection extends MenuSelection {//�ŵ����� ����

	private String[] riceAmount = { "30%", "50%", "75%", "99%" };
	
	public String getRiceAmount(int index) {
		return riceAmount[index];
	}

	@Override
	public int SelectingMenu() {
		System.out.println("\n�����������������������������������������������䷮����������������������������������������������������");
		System.out.print("      ");
		for (int i = 0; i < riceAmount.length; i++)
			System.out.printf("   ��%d��: %s ", i + 1, riceAmount[i]);

		System.out.println("\n��������������������������������������������������������������������������������������������������������");
		System.out.print("\n[��ȣ�� �Է��ϼ���] : ");
		try {
			IndexOfMenu = input.nextInt();
		}catch(InputMismatchException e) {
			input=new Scanner(System.in);
			IndexOfMenu=0;
		}//�Ʒ� number_Of_RiceAmount < 1�� �ɸ�, input�� 0�� �Ǳ� ����

		if (IndexOfMenu > riceAmount.length || IndexOfMenu < 1) {
			System.out.println("��  �߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.");
			SelectingMenu();
		}
		return IndexOfMenu;
		//riceAmount[IndexOfMenu-1];
	}


	

	
}
