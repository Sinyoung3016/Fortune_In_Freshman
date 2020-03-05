package termProject;
//복신영이 만듦
public class SideMenu {//객체 안에서 매뉴의 갯수와 가격을 계산 따라서 같은 메뉴 여러번 주문 가능
	private int number = 0;// 번호
	private int price = 0;// 이 메뉴의 가격
	private int sidetotalPrice = 0;// 총 개수 * 가격 = 이 메뉴의 총가격
	private int howMany = 0;// 몇개 주문?
	
	private String name = " ";// 메뉴 이름
	
	
	public SideMenu(int number, String name, int price){// 생성자로 메뉴 번호 이름 가격 설정 
		this.number = number;
		this.name = name;
		this.price = price;
	}
	
	public void setTotalPriceIn(int howMany) {// 주문시 바로 추가
		this.howMany += howMany;
		sidetotalPrice += price * howMany;
	}
	
	public void setTotalPriceOut(int howMany) {// 올바른 값이 입력되지 않았을때 , 취소 누르면 추가한 내역 지우기
		this.howMany -= howMany;
		sidetotalPrice -= price * howMany;
	}
	
	public int getHowMany() {
		return this.howMany;
	}
	
	public int getprice() {
		return this.price;
	}

	
	public int getsideTotalPrice() {
		return sidetotalPrice;
	}
	
	public String getName() {
		return name;
	}
	
	
	
	public String toString() {
		return "(" + this.number + ") " + this.name + " : " + this.price+" 원" ;
	}
}
