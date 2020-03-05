package menuSelect;
import java.util.InputMismatchException;
import java.util.Scanner;

import termProject.Gimbap;
public class MainMenuSelection extends MenuSelection {//½Åµ¿ÈÆÀÌ ¸¸µê

	
	private int price[]= {2500,3500,3500,3500,3500,3500,4000,4000,4000,4000,4000,4000,4500,4500,4500};//±è¹ä °¡°Ý ÀúÀåÇØ³õÀº ¹è¿­
	private String[] menu = {"¿øÁ¶±è¹ä","ÂüÄ¡±è¹ä","°íÃß±è¹ä","Ä¡Áî±è¹ä","±èÄ¡±è¹ä","¾ßÃ¤±è¹ä","µ·°¡½º±è¹ä",
			"»ø·¯µå±è¹ä","¼è°í±â±è¹ä","´©µå±è¹ä","Ä¡Å²°¡½º±è¹ä","»õ¿ì±è¹ä","¸ðµë±è¹ä","°è¶õ¸»ÀÌ±è¹ä","ÂüÄ¡±èÄ¡±è¹ä"};//±è¹ä ¸Þ´º ÀúÀåÇØ³õÀº ¹è¿­
	
	
	public int getNumberOfmMenuArray() {//menu¹è¿­ÀÇ °¹¼ö ¹ÝÈ¯
		return menu.length;
	}
	public int getIndexOfMenu() {//¼±ÅÃÇÑ ¸Þ´ºÀÇ ÀÎµ¦½º°ª+1 ¸¸È¯
		return IndexOfMenu;
	}
	public String getMenu(int index) {//¸Þ´º ÀÌ¸§ ¹ÝÈ¯
		return menu[index];
	}
	@Override
	public int SelectingMenu() {//¸Þ´º Ãâ·ÂÈÄ °í¸£´Â ¸Þ¼Òµå
		System.out.println("¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¡²±è¹äÆÇ¡³¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤");
		for (int i = 0; i < menu.length; i++) {
			if (i % 3 != 0)
				System.out.printf("¡´%d¡µ: %s(%s¿ø)  ", i + 1, menu[i], price[i]);
			else if (i == 0)
				System.out.printf("     ¡´%d¡µ: %s(%s¿ø)  ", i + 1, menu[i], price[i]);
			else
				System.out.printf("%n     ¡´%d¡µ: %s(%s¿ø)  ", i + 1, menu[i], price[i]);
		}
		System.out.println("\n¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥");
		System.out.print("\n[¹øÈ£¸¦ ÀÔ·ÂÇÏ¼¼¿ä] : ");

		try {
			IndexOfMenu=input.nextInt();
		}catch(InputMismatchException e) {
			input=new Scanner(System.in);//number_Of_Menu°ªÀÌ 0ÀÌ µÊ.
		}
		
		if (IndexOfMenu > menu.length || IndexOfMenu < 1) {
			System.out.println("¡Ø Àß¸ø ÀÔ·ÂÇÏ¼Ì½À´Ï´Ù. ´Ù½Ã ÀÔ·ÂÇÏ¼¼¿ä.");
			SelectingMenu();
		}
		
		return IndexOfMenu;
	}


	public void setGimbapMenuPrice(Gimbap gimbap, int menu_Num) {//gimbapÀÌ¶ó´Â °´Ã¼¿¡ ±è¹äÀÇ ÀÌ¸§°ú °¡°ÝÀ» ÀúÀåÇØÁÜ
		gimbap.setName(menu[menu_Num]);
		gimbap.setPrice(price[menu_Num]);
	}


	public int howMany(int Index) {//¸î°³¸¦ ÁÖ¹®ÇÒ°ÇÁö °í¸£´Â ¸Þ¼Òµå
		while (true) {
			System.out.print("\n¡Ø"+menu[Index]+"À»(¸¦) ¸î °³¸¦ ÁÖ¹®ÇÏ½Ã°Ú½À´Ï±î? : ");
		
			try {
				howMany = input.nextInt();
			}catch(InputMismatchException e) {
				input=new Scanner(System.in);
				howMany=0;
			}

			if(howMany<1) {
				System.out.println("¡ØÀß¸ø ÀÔ·ÂÇÏ¼Ì½À´Ï´Ù. ´Ù½Ã ÀÔ·ÂÇÏ¼¼¿ä.");
			}
			else {
			return howMany;
			}
		}
	}


}
