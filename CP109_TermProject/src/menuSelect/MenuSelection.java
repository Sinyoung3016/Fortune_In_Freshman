package menuSelect;

import java.util.Scanner;

public abstract class MenuSelection {//�ŵ����� ����

	Scanner input = new Scanner(System.in);
	protected int IndexOfMenu;
	protected int howMany;
	public abstract int SelectingMenu();
}
