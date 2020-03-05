package menuSelect;

import java.util.InputMismatchException;
import java.util.Scanner;
public class RemoveIngredientsSelection extends MenuSelection{//신동훈이 만듦
	
	private String[] removeIngredients = {"단무지","오이","햄","맛살","시금치","당근","계란","없음"};
	public int getNumberOfRemove_Ingredients_Array() {//remove_Ingredients배열의 갯수 반환
		return removeIngredients.length;
	}
	public int getIndexOfRemoveIngredients() {//선택한 제거할 속재료의 인덱스값+1 반환
		return IndexOfMenu;
	}
	public String getRemoveIngredients(int index) {
		return removeIngredients[index];
	}
	@Override
	public int SelectingMenu() {
		System.out.println("\n┌──────────────────〔속재료 제거〕───────────────────┐");

		for (int i = 0; i < removeIngredients.length; i++) {
			if (i % 3 != 0)
				System.out.printf("〈%d〉: %s ", i + 1, removeIngredients[i]);
			else if (i == 0)
				System.out.printf("     〈%d〉: %s ", i + 1, removeIngredients[i]);
			else
				System.out.printf("%n     〈%d〉: %s ", i + 1, removeIngredients[i]);
		}
		System.out.println("\n└───────────────────────────────────────────────┘");
		System.out.print("\n[번호를 입력하세요] : " );
		try {
			IndexOfMenu = input.nextInt();
		}catch(InputMismatchException e) {

			input=new Scanner(System.in);
		}
		if (IndexOfMenu < 1 ||IndexOfMenu > removeIngredients.length) {
			System.out.println("※잘못 입력하셨습니다. 다시 입력하세요.");
			SelectingMenu();
		}
		return IndexOfMenu;
	}
	

}
