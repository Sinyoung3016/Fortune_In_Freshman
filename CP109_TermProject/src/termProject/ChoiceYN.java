package termProject;

import java.util.InputMismatchException;
import java.util.Scanner;
public class ChoiceYN {//김유겸이 합침
	private int number;
	private int select = 0;

	Scanner input = new Scanner(System.in);

	public boolean YesOrNo(SideMenu[] side, int menuSelect, int howMany) {//복신영이 만듦

		int YoN = 1;
		while (YoN == 1) {// 맞을 때까지 반복
			YoN = 1;
			try {
				System.out.println("\n※ 올바르게 입력되었습니까?");
				System.out.print("\n[번호를 입력하세요] (〈1〉: 예, 〈2〉: 아니오 ) : ");
				select = input.nextInt();

				if (select == 1) {// 만약 예 일때

					System.out.print("\n[번호를 입력하세요]( <1> : 결제, <2> : 추가 선택 ) : ");
					
					int select02 = input.nextInt();
					
					if (select02 == 1)// 결제
						return false;
					else if (select02 == 2) {// 추가 선택
						return true;
					} else if (select02 != 2 && select02 != 1) {//범위를 벗어남
						YoN = 1;
						System.out.println("※ 잘못 입력하셨습니다. 다시 입력하세요.");
						return true;
					}

				} else if (select == 2) {// 만약 아니오 일때
					side[menuSelect - 1].setTotalPriceOut(howMany);// 선택 취소
					return true;
				}
				
				else if (select != 2 && select != 1) {//범위를 벗어남
					YoN = 1;
					side[menuSelect - 1].setTotalPriceOut(howMany);// 선택 취소
					System.out.println("※ 잘못 입력하셨습니다. 다시 입력하세요.");
					return true;
				}


			} catch (InputMismatchException e) {
				side[menuSelect - 1].setTotalPriceOut(howMany);
				System.out.println("※ 잘못 입력하셨습니다. 다시 입력하세요.");
				YoN = 1;
				input.nextLine();
				return true;
			}
		}return false;
	}
	/////////////////////////////////////////////////////
	public int getNumber() {//고른 번호를 반환
		return number;
	}

	public boolean Choice_YesOrNo() {//신동훈이 만듦
		number=0;
		System.out.print("\n[번호를 입력하세요] (〈1〉: 예, 〈2〉: 아니오) : ");
		try {
			number = input.nextInt();
			}catch(InputMismatchException e) {
				input=new Scanner(System.in);

			}
		if (number <= 0 || number > 2) {
			System.out.println("※ 잘못 입력하셨습니다. 다시 입력하세요.");
			return Choice_YesOrNo();
		}
		else if(number==1){//예를 누르면 true를 반환
			return true;
		}
		else//아니오를 누르면 false를 반환
			return false;
	}
	
}
