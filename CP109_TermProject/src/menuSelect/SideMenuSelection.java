
package menuSelect;

import java.util.InputMismatchException;

import termProject.SideMenu;

public class SideMenuSelection extends MenuSelection {//복신영이 만듦

	private int sum = 0;//총액

	private SideMenu[] side = new SideMenu[8];

	public SideMenu[] getSide() {
		return side;
	}

	public SideMenuSelection() {

		side[0] = new SideMenu(1, "컵라면", 1000);
		side[1] = new SideMenu(2, "된장국", 1000);
		side[2] = new SideMenu(3, "미역국", 1000);
		side[3] = new SideMenu(4, "콜라(500ml)", 500);
		side[4] = new SideMenu(5, "사이다(500ml)", 500);
		side[5] = new SideMenu(6, "쥬스(오랜지)(500ml)", 500);
		side[6] = new SideMenu(7, "물", 500);
		side[7] = new SideMenu(8, "없음", 0);
	}

	@Override
	public int SelectingMenu() {// 01 메뉴 선택
	
		boolean mS = false;

		while (mS == false) {// 올바른 값이 나올때 까지 반복
			mS = true;
			System.out.println("\n\n※ 원하시는 사이드 메뉴를 선택해 주세요.");
			System.out.println("\n┌─────────〔사이드메뉴〕─────────┐");

			for (int a = 0; a < 7; a++) {
				System.out.println(" " + side[a]);
			} // 메뉴
			System.out.println(" (8) 없음");
			System.out.println("└────────────────────────────┘\n");
			System.out.print("[번호를 입력하세요] : ");

			try {
				IndexOfMenu = input.nextInt();//메뉴의 번호 선택
				if (0 >= IndexOfMenu || IndexOfMenu > 8) {// 범위 밖 입력시
					mS = false;
					System.out.println("※ 잘못 입력하셨습니다. 다시 입력하세요.");
				} else
					mS = true;
			} catch (InputMismatchException e) {// 숫자 외 입력시
				System.out.println("※ 잘못 입력하셨습니다. 다시 입력하세요.");
				mS = false;
				input.nextLine();
			}
		}
		return IndexOfMenu;
	}


	public int howMany(int menuIndex) {// 02 메뉴의 개수 선택
		// 02 개수 선택
		boolean mA = false;

		if (0 < menuIndex && menuIndex < 8) {//사이드 메뉴 필요함
			while (mA == false) {
				mA = true;
				try {
					System.out.println("--------------------------------------------");

					while (true) {
						System.out.print(side[menuIndex - 1].getName() + "을(를) 몇개 고르시겠습니까? : ");
						howMany = input.nextInt();// 개수
						if (howMany <= 0) {// 음수의 개수를 작성시
							System.out.println("\n※ 잘못 입력하셨습니다. 다시 입력해주세요.");
						} else {
							break;
						}
					}
					side[menuIndex - 1].setTotalPriceIn(howMany);
					System.out.println();
					System.out.print(side[menuIndex - 1].getName() + " " + howMany + " 개는 "
							+ (side[menuIndex - 1].getprice()) * howMany + "원 입니다. ");
				} catch (InputMismatchException e) {//숫자 외 입력시
					System.out.println("※ 잘못 입력하셨습니다. 다시 입력해주세요.");
					mA = false;
					input.nextLine();
				}

			}
		} else if (menuIndex == 8) {// 사이드 메뉴가 필요 없음
			howMany = 0;// 메뉴가 없음으로 그냥 0개의 없음을 구매했다고 생각
		}

		return howMany;
	}

	public void printSide() {//내가 구매한 사이드메뉴 전부 보여줘 in 영수증
		for (int a = 0; a < 8; a++) {
			if (side[a].getHowMany() > 0) {
				System.out.printf("   %d. [%s]: 가격: %d, 개수: %d \n", a + 1, side[a].getName(), side[a].getprice(),
						side[a].getHowMany());
			}
		}
	}

	public int Sum() {// 구매한 갯수가 1개 이상인 메뉴만 총합을 더해주세요 = 사이드 메뉴의 총합
		for (int a = 0; a < 8; a++) {
			if (side[a].getHowMany() > 0) {
				sum += side[a].getsideTotalPrice();
			}
		}
		return sum;

	}
}
