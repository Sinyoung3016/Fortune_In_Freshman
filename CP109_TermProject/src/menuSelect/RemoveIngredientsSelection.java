package menuSelect;

import java.util.InputMismatchException;
import java.util.Scanner;
public class RemoveIngredientsSelection extends MenuSelection{//�ŵ����� ����
	
	private String[] removeIngredients = {"�ܹ���","����","��","����","�ñ�ġ","���","���","����"};
	public int getNumberOfRemove_Ingredients_Array() {//remove_Ingredients�迭�� ���� ��ȯ
		return removeIngredients.length;
	}
	public int getIndexOfRemoveIngredients() {//������ ������ ������� �ε�����+1 ��ȯ
		return IndexOfMenu;
	}
	public String getRemoveIngredients(int index) {
		return removeIngredients[index];
	}
	@Override
	public int SelectingMenu() {
		System.out.println("\n��������������������������������������������� ���š�����������������������������������������");

		for (int i = 0; i < removeIngredients.length; i++) {
			if (i % 3 != 0)
				System.out.printf("��%d��: %s ", i + 1, removeIngredients[i]);
			else if (i == 0)
				System.out.printf("     ��%d��: %s ", i + 1, removeIngredients[i]);
			else
				System.out.printf("%n     ��%d��: %s ", i + 1, removeIngredients[i]);
		}
		System.out.println("\n��������������������������������������������������������������������������������������������������");
		System.out.print("\n[��ȣ�� �Է��ϼ���] : " );
		try {
			IndexOfMenu = input.nextInt();
		}catch(InputMismatchException e) {

			input=new Scanner(System.in);
		}
		if (IndexOfMenu < 1 ||IndexOfMenu > removeIngredients.length) {
			System.out.println("���߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.");
			SelectingMenu();
		}
		return IndexOfMenu;
	}
	

}
