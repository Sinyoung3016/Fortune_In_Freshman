package termProject;

public class Order {//신동훈이 만듦
	private Gimbap[] gimbaps;
	private int numberOfGimbap;
	private int totalPrice=0;
	
	public int getTotalPrice() {//김밥 주문한 총 가격 반환
		return totalPrice;
	}

	public int AddTotalPrice(int total_Price) {//총 가격에 더해줌
		this.totalPrice += total_Price;
		return this.totalPrice;
	}


	public Order() {//생성자
		gimbaps=new Gimbap[15];
		numberOfGimbap=0;
	}
	
	public Gimbap getGimbap(int index) {
		return gimbaps[index];
	}
	

	public int getNumberOfGimbap() {//주문한 김밥의 종류의 개수
		return numberOfGimbap;
	}

	public void addGimbap(Gimbap a) {//김밥의 배열에 주문 프로그램에서 생성한 김밥의 주소를 넣어줌
		gimbaps[numberOfGimbap++]=a;
	}
}
