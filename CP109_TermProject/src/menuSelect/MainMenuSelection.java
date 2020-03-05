package menuSelect;
import java.util.InputMismatchException;
import java.util.Scanner;

import termProject.Gimbap;
public class MainMenuSelection extends MenuSelection {//褐翕�ぜ� 虜虛

	
	private int price[]= {2500,3500,3500,3500,3500,3500,4000,4000,4000,4000,4000,4000,4500,4500,4500};//梯嫣 陛問 盪濰п場擎 寡翮
	private String[] menu = {"錳褻梯嫣","霤纂梯嫣","堅蹺梯嫣","纂鍔梯嫣","梯纂梯嫣","撿瓣梯嫣","絲陛蝶梯嫣",
			"僵楝萄梯嫣","潸堅晦梯嫣","援萄梯嫣","纂鑑陛蝶梯嫣","億辦梯嫣","賅蛟梯嫣","啗塢蜓檜梯嫣","霤纂梯纂梯嫣"};//梯嫣 詭景 盪濰п場擎 寡翮
	
	
	public int getNumberOfmMenuArray() {//menu寡翮曖 偎熱 奩��
		return menu.length;
	}
	public int getIndexOfMenu() {//摹鷗и 詭景曖 檣策蝶高+1 虜��
		return IndexOfMenu;
	}
	public String getMenu(int index) {//詭景 檜葷 奩��
		return menu[index];
	}
	@Override
	public int SelectingMenu() {//詭景 轎溘�� 堅腦朝 詭模萄
		System.out.println("忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式〃梯嫣っ○式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖");
		for (int i = 0; i < menu.length; i++) {
			if (i % 3 != 0)
				System.out.printf("●%d△: %s(%s錳)  ", i + 1, menu[i], price[i]);
			else if (i == 0)
				System.out.printf("     ●%d△: %s(%s錳)  ", i + 1, menu[i], price[i]);
			else
				System.out.printf("%n     ●%d△: %s(%s錳)  ", i + 1, menu[i], price[i]);
		}
		System.out.println("\n戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎");
		System.out.print("\n[廓�ㄧ� 殮溘ж撮蹂] : ");

		try {
			IndexOfMenu=input.nextInt();
		}catch(InputMismatchException e) {
			input=new Scanner(System.in);//number_Of_Menu高檜 0檜 脾.
		}
		
		if (IndexOfMenu > menu.length || IndexOfMenu < 1) {
			System.out.println("≦ 澀跤 殮溘ж樟蝗棲棻. 棻衛 殮溘ж撮蹂.");
			SelectingMenu();
		}
		
		return IndexOfMenu;
	}


	public void setGimbapMenuPrice(Gimbap gimbap, int menu_Num) {//gimbap檜塭朝 偌羹縑 梯嫣曖 檜葷婁 陛問擊 盪濰п邀
		gimbap.setName(menu[menu_Num]);
		gimbap.setPrice(price[menu_Num]);
	}


	public int howMany(int Index) {//賃偃蒂 輿僥й勒雖 堅腦朝 詭模萄
		while (true) {
			System.out.print("\n≦"+menu[Index]+"擊(蒂) 賃 偃蒂 輿僥ж衛啊蝗棲梱? : ");
		
			try {
				howMany = input.nextInt();
			}catch(InputMismatchException e) {
				input=new Scanner(System.in);
				howMany=0;
			}

			if(howMany<1) {
				System.out.println("≦澀跤 殮溘ж樟蝗棲棻. 棻衛 殮溘ж撮蹂.");
			}
			else {
			return howMany;
			}
		}
	}


}
