package termProject;
/*
 ���� ����: ���ſ��� ����� �԰� �ʹٰ� �Ͽ��� ��, ����� ���ϰ� �ֹ��ϱ� ���� ���� �ֹ� �ý����� ������ �ڴٰ� ������
 ���� ���: ȸ������, �α���, ��� �޴�,����,�䷮,������ ����� ����,  ���̵� �޴� ����, ������ ���(�ֹ��� �ð��� �ֹ�����, �Ѿ��� ���)
 ����    : �����Ų �� �϶�� ��� �Է��ϸ� ��.
 ���� �д�: authorization ��Ű���� �α��� ���� ��Ű���� �ŵ����� �������. �ŵ����� ���� ���õ� Ŭ����(Gimbap, Order Ŭ������ ����), ���� �ð��� ������ִ� Today Ŭ������ ����
             ���ſ��� ���̵�޴� ���� Ŭ������ (SideMenu)�� ����. ChoiceYN�� ����.
             �ŵ��ư� ���ſ��� (menuSelect ��Ű���� ����)
             �������� �ŵ��ư� ���ſ��� �ڵ带 ���� ���� �޼ҵ�(OrderProgram)�� �ۼ�, ����ó���� ���.
             
 */
import java.io.IOException;

import menuSelect.MainMenuSelection;
import menuSelect.RemoveIngredientsSelection;
import menuSelect.RiceAmountSelection;
import menuSelect.SideMenuSelection;
public class OrderProgram {//�������� ����
	public static void main(String[] args) throws IOException {
		int totalprice;
		boolean alreadySelectMenu;//�̹� ������ �޴��϶� �ٽ� �������ֱ� ���� doWhile���� ����
		boolean alreadySelectRemoveIngredients;//�̹� ������ ����Ḧ �����Ͽ��� �� �ٽ� �����ϱ� ���� doWhile���� ����
		boolean plusRemoveIngredients;//�� �߰��� ����ᰡ ���� �� �ݺ����ֱ� ���� doWhile���� ����
		boolean plusGimbap;//����� �� �ֹ��� �� �ݺ����ֱ� ���� doWhile���� ����
		boolean properlyChoiceGimbap;//����� �ùٸ��� ���õ��� �ʾ��� �� �ٽ� ���� �ϱ� ���� doWhile���� ����
		
		Order 			order 			= new Order();
		Gimbap 			addGimbap 	= new Gimbap();
		ChoiceYN 		answer 			= new ChoiceYN();
		RiceAmountSelection riceS	        =new RiceAmountSelection();
		MainMenuSelection 		menuS 	= new MainMenuSelection();
		RemoveIngredientsSelection IngredientS=new RemoveIngredientsSelection();
		StartMenu  startP   			= new StartMenu();
		Today 			today             = new Today();
		
		
		if(startP.startProgram()) {

		do {// �� do while���� �������� �ٸ� ��䵵 �ֹ��ϰڴٴ� �Է��� ������ �����.
			plusGimbap=false;
			addGimbap = new Gimbap();// �ݺ��� ������ ���ο� ��ü ��������

			do {// �� do while ���� ��� �ֹ��� ����� ���� ������ �ٽ� ����� ó������ �ֹ��ϰ� ����.
				properlyChoiceGimbap=false;
				do {
					alreadySelectMenu = false;// 1��° do
					menuS.SelectingMenu();

					if (order.getNumberOfGimbap() > 0) {
						for (int i = 0; i < order.getNumberOfGimbap(); i++) {
							if (order.getGimbap(i).getName().equals(menuS.getMenu(menuS.getIndexOfMenu() - 1)) ) {
								System.out.println("\n�� �̹� ������ �޴��Դϴ�. �ٸ� �޴��� �������ּ���.");
								alreadySelectMenu = true;
								break;
							}
						}
					}
				} while (alreadySelectMenu);// 1��° while, �̹� ������ �޴��� ������� �ٽ� ���� ��

				menuS.setGimbapMenuPrice(addGimbap, menuS.getIndexOfMenu() - 1);
				int menuIndex=menuS.getIndexOfMenu() - 1;
				addGimbap.setAmount(menuS.howMany(menuIndex));// addGimbap�� ������ �����ڷ� ����,menu.howMany() �޼ҵ尡 �۵�.
				addGimbap.setRiceAmount(riceS.getRiceAmount(riceS.SelectingMenu()-1));// addGimbap�� �䷮�� �����ڷ� ����

				do {// 2��° do
					plusRemoveIngredients=false;
					do {// 1��° do
						alreadySelectRemoveIngredients = false;
						IngredientS.SelectingMenu();//������ ����� ����ش�.
						if (addGimbap.getRemoveIngredientsSize() > 0) {//addGimbap �� ������ ����ᰡ 1�� �̻� �ִٸ�
							for (int i = 0; i < addGimbap.getRemoveIngredientsSize(); i++) {
								if (addGimbap.getRemoveIngredients(i). equals (IngredientS.getRemoveIngredients(IngredientS.getIndexOfRemoveIngredients() - 1) ) ) {
									//addGimbap���� �����ϰڴٰ� ������ ������ menu.remove_Ingredients()���� �����ϰڴٰ� ������ ����ᰡ �ߺ��Ǵ� ���� �ִٸ� 
									System.out.println("�� �̹� ������ ������Դϴ�. �ٸ� ����Ḧ �������ּ���.");
									alreadySelectRemoveIngredients = true;
									break;
								}
							}
						
						}
					} while (alreadySelectRemoveIngredients);// 1��° while, ������ ����ᰡ �̹� ������ ������� �ٽ� ��ȣ�� �Է¹ް� ��

					if (IngredientS.getIndexOfRemoveIngredients() == 8) {//8���� ������ ����ᰡ ������ ��, �����ٸ� �ٷ� ����
						if(addGimbap.getRemoveIngredientsSize()==0) {//����� ����ᰡ 0���� �� ������ �����ϸ� ������ �߰�. ������ֱ� ����.
							addGimbap.addRemoveIngredients("����");
							}
						
					} // 8�� ������ �ٷ� ����

					else {
						addGimbap.addRemoveIngredients(
								IngredientS.getRemoveIngredients(IngredientS.getIndexOfRemoveIngredients() - 1));// addGimbap��
																										                               // ������ ����� �߰�
						if (addGimbap.getRemoveIngredientsSize()>=IngredientS.getNumberOfRemove_Ingredients_Array()-1) {
							//����Ḧ ���� �����Ͽ��� ��,     -1�� �� �� ������ ������ �� �ִ� ������� ������ �迭�� ����-1��(������ ���ԵǾ� �����Ƿ�)
							System.out.println("�� ��� ����Ḧ �����ϼ̽��ϴ�. ��� ���� â���� �̵��մϴ�.");
							plusRemoveIngredients = false;
						}
						else {
							System.out.println("�� �� �����Ͻ� ����ᰡ �����Ű���? ");
							if (answer.Choice_YesOrNo()) {// ������ ����ᰡ �ִٸ�
								plusRemoveIngredients = true;
							}
						}
					}
				} while (plusRemoveIngredients);// 2��° while

				System.out.println("\n�� �ֹ��Ͻ� ����� ����: ��" + addGimbap + "��");//toString �޼ҵ带 ���� �ֹ��� ����� ���� ���
				System.out.println("\n�� �ùٸ��� �ԷµǾ����ϱ�? �ƴϿ� ���� �� ó������ �ǵ��ư��ϴ�.");
				
				if (answer.Choice_YesOrNo()==false) {
					addGimbap.setNull();// �ùٸ��� �Էµ��� �ʾҴٸ� addGimbap�� ���ݱ��� �����Ų �Ӽ����� �� null������ �ʱ�ȭ. �� �ٽ�
					// ó������
					properlyChoiceGimbap = true;
				} 
					
			} while (properlyChoiceGimbap);// �� ������ �� ĭ �Ʒ� do�� �ɸ�

			order.addGimbap(addGimbap);
			
			order.AddTotalPrice(addGimbap.getPrice()*addGimbap.getAmount());//���� �߰�
			
			if (order.getNumberOfGimbap()>=menuS.getNumberOfmMenuArray()) {
				System.out.println("�� ��� ������ ����� �ֹ��ϼ̽��ϴ�. �ֹ����� â���� �̵��մϴ�.");
			}
			else {
				System.out.println("\n�� �ٸ� ��䵵 �ֹ��Ͻðڽ��ϱ�? ");
				if (answer.Choice_YesOrNo()) {
					plusGimbap = true;
				} 
			}
		} while (plusGimbap);// �� �� do �� �ɸ�.

		System.out.println("\n�����������������������������������������������������ֹ��Ͻ� ��� ���롳��������������������������������������������������");
		
		for (int i = 0; i < order.getNumberOfGimbap(); i++) {
			System.out.println("     ��"+(i + 1)+"��" + ": " + order.getGimbap(i));
		}
		System.out.printf("�������������������������������������������������������� ����: %d����������������������������������������������������",order.getTotalPrice());
		
	
		boolean Y = true;

		///////////////////////////////////////////////////////////////////////////////////////////////////////
		
		SideMenuSelection Menu = new SideMenuSelection();
		ChoiceYN Choice = new ChoiceYN();

		do {
			int MS = Menu.SelectingMenu();
			int MA = Menu.howMany(MS);
			Y = Choice.YesOrNo(Menu.getSide(), MS , MA);
		} while (Y == true);
	
		
		totalprice = order.getTotalPrice() + Menu.Sum();
		
		System.out.println("\n\n********************************************************************");
		if(startP.getIsYourMember()) {
			System.out.println("                                                       "+startP.getLogIn().getID()+" ȸ������ �ֹ� ����");
		}else {
			System.out.println("               		 (��ȸ��)������ �ֹ� ����");
		}
		System.out.println("-------------------------------------------------------------------");
		System.out.printf("   �ֹ�����: %s                                  �ð�: %s\n",today.getTodayDate() ,today.getPresentTime());
		System.out.println("-------------------------------------------------------------------");
		System.out.println("������������������������������������������������������������������䦡��������������������������������������������������������������");
		for (int i = 0; i < order.getNumberOfGimbap(); i++) {
			System.out.println("   " + (i + 1) + ". " + order.getGimbap(i));
		}
		System.out.println("��������������������������������������������������������������������������������������������������������������������������������������");
		System.out.println("���������������������������������������������������������������� ��䦡������������������������������������������������������������");
		
		Menu.printSide();
		System.out.println("��������������������������������������������������������������������������������������������������������������������������������������");
		System.out.println("�����������������������������������������������������������������Ѿצ���������������������������������������������������������������");
		if(startP.getIsYourMember()) {
			System.out.println("     ���� ���̵�޴��� �� ������ : "+ (int)(totalprice*0.9)+"�� �Դϴ�.(10% ���� ����)");
		}else {
			System.out.println("     ���� ���̵�޴��� �� ������ : "+ totalprice+"�� �Դϴ�.");
		}
		System.out.println("��������������������������������������������������������������������������������������������������������������������������������������");
		System.out.println("	              �� ����ſ������� ����������� �湮���ּż� �����մϴ�. ��");
		}//�� ó�� if
		else {
			System.out.println("	              �� ����ſ������� ����������� �湮���ּż� �����մϴ�. ��");
		}
		
		
	}
}
