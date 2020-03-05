package termProject;
/*
 과제 개요: 복신영이 김밥을 먹고 싶다고 하였을 때, 김밥을 편하게 주문하기 위한 무인 주문 시스템을 만들어야 겠다고 생각함
 제공 기능: 회원가입, 로그인, 김밥 메뉴,개수,밥량,제거할 속재료 선택,  사이드 메뉴 선택, 영수증 출력(주문한 시간과 주문내역, 총액을 출력)
 사용법    : 실행시킨 후 하라는 대로 입력하면 됨.
 역할 분담: authorization 패키지는 로그인 관련 패키지로 신동훈이 만들었음. 신동훈이 김밥과 관련된 클래스(Gimbap, Order 클래스를 만듦), 현재 시간을 출력해주는 Today 클래스도 만듦
             복신영은 사이드메뉴 관련 클래스인 (SideMenu)를 만듦. ChoiceYN을 만듦.
             신동훈과 복신영이 (menuSelect 패키지를 만듦)
             김유겸이 신동훈과 복신영의 코드를 합쳐 메인 메소드(OrderProgram)를 작성, 예외처리를 담당.
             
 */
import java.io.IOException;

import menuSelect.MainMenuSelection;
import menuSelect.RemoveIngredientsSelection;
import menuSelect.RiceAmountSelection;
import menuSelect.SideMenuSelection;
public class OrderProgram {//김유겸이 만듦
	public static void main(String[] args) throws IOException {
		int totalprice;
		boolean alreadySelectMenu;//이미 선택한 메뉴일때 다시 선택해주기 위한 doWhile문의 조건
		boolean alreadySelectRemoveIngredients;//이미 제거한 속재료를 선택하였을 때 다시 선택하기 위한 doWhile문의 조건
		boolean plusRemoveIngredients;//더 추가할 속재료가 있을 때 반복해주기 위한 doWhile문의 조건
		boolean plusGimbap;//김밥을 더 주문할 때 반복해주기 위한 doWhile문의 조건
		boolean properlyChoiceGimbap;//김밥이 올바르게 선택되지 않았을 때 다시 고르게 하기 위한 doWhile문의 조건
		
		Order 			order 			= new Order();
		Gimbap 			addGimbap 	= new Gimbap();
		ChoiceYN 		answer 			= new ChoiceYN();
		RiceAmountSelection riceS	        =new RiceAmountSelection();
		MainMenuSelection 		menuS 	= new MainMenuSelection();
		RemoveIngredientsSelection IngredientS=new RemoveIngredientsSelection();
		StartMenu  startP   			= new StartMenu();
		Today 			today             = new Today();
		
		
		if(startP.startProgram()) {

		do {// 이 do while문은 마지막에 다른 김밥도 주문하겠다는 입력을 받으면 실행됨.
			plusGimbap=false;
			addGimbap = new Gimbap();// 반복될 때마다 새로운 객체 생성해줌

			do {// 이 do while 문은 김밥 주문이 제대로 되지 않으면 다시 김밥을 처음부터 주문하게 해줌.
				properlyChoiceGimbap=false;
				do {
					alreadySelectMenu = false;// 1번째 do
					menuS.SelectingMenu();

					if (order.getNumberOfGimbap() > 0) {
						for (int i = 0; i < order.getNumberOfGimbap(); i++) {
							if (order.getGimbap(i).getName().equals(menuS.getMenu(menuS.getIndexOfMenu() - 1)) ) {
								System.out.println("\n※ 이미 선택한 메뉴입니다. 다른 메뉴를 선택해주세요.");
								alreadySelectMenu = true;
								break;
							}
						}
					}
				} while (alreadySelectMenu);// 1번째 while, 이미 선택한 메뉴를 골랐으면 다시 고르게 함

				menuS.setGimbapMenuPrice(addGimbap, menuS.getIndexOfMenu() - 1);
				int menuIndex=menuS.getIndexOfMenu() - 1;
				addGimbap.setAmount(menuS.howMany(menuIndex));// addGimbap의 수량을 설정자로 설정,menu.howMany() 메소드가 작동.
				addGimbap.setRiceAmount(riceS.getRiceAmount(riceS.SelectingMenu()-1));// addGimbap의 밥량을 설정자로 설정

				do {// 2번째 do
					plusRemoveIngredients=false;
					do {// 1번째 do
						alreadySelectRemoveIngredients = false;
						IngredientS.SelectingMenu();//제거할 속재료 골라준다.
						if (addGimbap.getRemoveIngredientsSize() > 0) {//addGimbap 에 제거할 속재료가 1개 이상 있다면
							for (int i = 0; i < addGimbap.getRemoveIngredientsSize(); i++) {
								if (addGimbap.getRemoveIngredients(i). equals (IngredientS.getRemoveIngredients(IngredientS.getIndexOfRemoveIngredients() - 1) ) ) {
									//addGimbap에서 제거하겠다고 저장한 속재료와 menu.remove_Ingredients()에서 제거하겠다고 선택한 속재료가 중복되는 것이 있다면 
									System.out.println("※ 이미 제거한 속재료입니다. 다른 속재료를 선택해주세요.");
									alreadySelectRemoveIngredients = true;
									break;
								}
							}
						
						}
					} while (alreadySelectRemoveIngredients);// 1번째 while, 선택한 속재료가 이미 제거한 속재료라면 다시 번호를 입력받게 함

					if (IngredientS.getIndexOfRemoveIngredients() == 8) {//8번은 제거할 속재료가 없음일 때, 누른다면 바로 종료
						if(addGimbap.getRemoveIngredientsSize()==0) {//재거할 속재료가 0개일 때 없음을 선택하면 없음을 추가. 출력해주기 위함.
							addGimbap.addRemoveIngredients("없음");
							}
						
					} // 8을 누르면 바로 종료

					else {
						addGimbap.addRemoveIngredients(
								IngredientS.getRemoveIngredients(IngredientS.getIndexOfRemoveIngredients() - 1));// addGimbap에
																										                               // 제거할 속재료 추가
						if (addGimbap.getRemoveIngredientsSize()>=IngredientS.getNumberOfRemove_Ingredients_Array()-1) {
							//속재료를 전부 제거하였을 때,     -1를 해 준 이유는 제거할 수 있는 속재료의 개수는 배열의 개수-1개(없음이 포함되어 있으므로)
							System.out.println("※ 모든 속재료를 제거하셨습니다. 김밥 정보 창으로 이동합니다.");
							plusRemoveIngredients = false;
						}
						else {
							System.out.println("※ 또 제거하실 속재료가 있으신가요? ");
							if (answer.Choice_YesOrNo()) {// 제거할 속재료가 있다면
								plusRemoveIngredients = true;
							}
						}
					}
				} while (plusRemoveIngredients);// 2번째 while

				System.out.println("\n※ 주문하신 김밥의 내용: 『" + addGimbap + "』");//toString 메소드를 통해 주문한 김밥의 정보 출력
				System.out.println("\n※ 올바르게 입력되었습니까? 아니오 선택 시 처음으로 되돌아갑니다.");
				
				if (answer.Choice_YesOrNo()==false) {
					addGimbap.setNull();// 올바르게 입력되지 않았다면 addGimbap에 지금까지 저장시킨 속성들을 다 null값으로 초기화. 후 다시
					// 처음부터
					properlyChoiceGimbap = true;
				} 
					
			} while (properlyChoiceGimbap);// 맨 위에서 한 칸 아래 do에 걸림

			order.addGimbap(addGimbap);
			
			order.AddTotalPrice(addGimbap.getPrice()*addGimbap.getAmount());//가격 추가
			
			if (order.getNumberOfGimbap()>=menuS.getNumberOfmMenuArray()) {
				System.out.println("※ 모든 종류의 김밥을 주문하셨습니다. 주문정보 창으로 이동합니다.");
			}
			else {
				System.out.println("\n※ 다른 김밥도 주문하시겠습니까? ");
				if (answer.Choice_YesOrNo()) {
					plusGimbap = true;
				} 
			}
		} while (plusGimbap);// 맨 위 do 에 걸림.

		System.out.println("\n┌────────────────────────〔주문하신 김밥 내용〕────────────────────────┐");
		
		for (int i = 0; i < order.getNumberOfGimbap(); i++) {
			System.out.println("     〈"+(i + 1)+"〉" + ": " + order.getGimbap(i));
		}
		System.out.printf("└─────────────────────────《총 가격: %d원》───────────────────────┘",order.getTotalPrice());
		
	
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
			System.out.println("                                                       "+startP.getLogIn().getID()+" 회원님의 주문 내역");
		}else {
			System.out.println("               		 (비회원)고객님의 주문 내역");
		}
		System.out.println("-------------------------------------------------------------------");
		System.out.printf("   주문일자: %s                                  시간: %s\n",today.getTodayDate() ,today.getPresentTime());
		System.out.println("-------------------------------------------------------------------");
		System.out.println("┌───────────────────────────────김밥───────────────────────────────┐");
		for (int i = 0; i < order.getNumberOfGimbap(); i++) {
			System.out.println("   " + (i + 1) + ". " + order.getGimbap(i));
		}
		System.out.println("└─────────────────────────────────────────────────────────────────┘");
		System.out.println("┌──────────────────────────────안 김밥──────────────────────────────┐");
		
		Menu.printSide();
		System.out.println("└─────────────────────────────────────────────────────────────────┘");
		System.out.println("┌───────────────────────────────총액───────────────────────────────┐");
		if(startP.getIsYourMember()) {
			System.out.println("     김밥과 사이드메뉴의 총 가격은 : "+ (int)(totalprice*0.9)+"원 입니다.(10% 할인 적용)");
		}else {
			System.out.println("     김밥과 사이드메뉴의 총 가격은 : "+ totalprice+"원 입니다.");
		}
		System.out.println("└─────────────────────────────────────────────────────────────────┘");
		System.out.println("	              ★ 유겸신영동훈의 김밥전문점에 방문해주셔서 감사합니다. ★");
		}//맨 처음 if
		else {
			System.out.println("	              ★ 유겸신영동훈의 김밥전문점에 방문해주셔서 감사합니다. ★");
		}
		
		
	}
}
