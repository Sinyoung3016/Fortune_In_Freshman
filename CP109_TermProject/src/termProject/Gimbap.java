package termProject;

import java.util.ArrayList;

public class Gimbap {//신동훈이 만듦
	private int price;//가격
	private int amount;//개수
	private String name;//김밥 이름
	private String riceAmount;//밥의 양
	private String remove_Ingredients="";//제거할 속재료
	private ArrayList<String>removeIngredients=new ArrayList<String>();//제거할 속재료들, 선택한 속재료가 이미 선택한 속재료일 경우 중복되었다고 출력해주기 위해서 만들었음.

	
	
	public void addRemoveIngredients(String remove_Ingredients) {//제거할 속재료를 추가시켜줌
		this.remove_Ingredients+= remove_Ingredients+" ";
		removeIngredients.add(remove_Ingredients);
	}
	
	public String getRemoveIngredients(int index) {//제거할 속재료를 반환
		return removeIngredients.get(index);
	}
	
	
	public int getRemoveIngredientsSize() {//제거할 속재료의 종류의 개수를 반환
		return removeIngredients.size();
	}
	
	public void setNull() {//김밥을 잘못 만들었을경우 모두 초기화시켜주기 위해 만들었음.
		this.name=null;
		this.riceAmount=null;
		this. price=0;
		this.amount=0;
		this.remove_Ingredients="";
		removeIngredients.clear();
		
	}
	public String getName() {//김밥의 이름을 반환
		return name;
	}
	public void setName(String name) {//김밥의 이름을 설정
		this.name = name;
	}
	public void setRiceAmount(String riceAmount) {//김밥의 밥량을 설정
		this.riceAmount = riceAmount;
	}
	public void setPrice(int price) {//김밥의 가격을 설정
		this.price = price;
	}
	public void setAmount(int amount) {//김밥의 수량을 설정
		this.amount = amount;
	}
	public String toString() {
		return String.format("[%s]: 밥의 양: %s, 가격: %d, 개수: %d, 제거한 속재료: %s", name,riceAmount,price,amount,remove_Ingredients);
	}
	
	public int getPrice() {//김밥의 가격을 반환
		return price;
	}

	public int getAmount() {//김밥의 수량을 반환
		return amount;
	}

	
}
