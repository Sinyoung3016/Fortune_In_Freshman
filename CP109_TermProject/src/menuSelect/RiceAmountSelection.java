package menuSelect;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RiceAmountSelection extends MenuSelection {//신동훈이 만듦

	private String[] riceAmount = { "30%", "50%", "75%", "99%" };
	
	public String getRiceAmount(int index) {
		return riceAmount[index];
	}

	@Override
	public int SelectingMenu() {
		System.out.println("\n┌─────────────────────〔밥량〕────────────────────────┐");
		System.out.print("      ");
		for (int i = 0; i < riceAmount.length; i++)
			System.out.printf("   〈%d〉: %s ", i + 1, riceAmount[i]);

		System.out.println("\n└──────────────────────────────────────────────────┘");
		System.out.print("\n[번호를 입력하세요] : ");
		try {
			IndexOfMenu = input.nextInt();
		}catch(InputMismatchException e) {
			input=new Scanner(System.in);
			IndexOfMenu=0;
		}//아래 number_Of_RiceAmount < 1에 걸림, input이 0이 되기 때문

		if (IndexOfMenu > riceAmount.length || IndexOfMenu < 1) {
			System.out.println("※  잘못 입력하셨습니다. 다시 입력하세요.");
			SelectingMenu();
		}
		return IndexOfMenu;
		//riceAmount[IndexOfMenu-1];
	}


	

	
}
