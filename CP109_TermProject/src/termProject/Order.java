package termProject;

public class Order {//�ŵ����� ����
	private Gimbap[] gimbaps;
	private int numberOfGimbap;
	private int totalPrice=0;
	
	public int getTotalPrice() {//��� �ֹ��� �� ���� ��ȯ
		return totalPrice;
	}

	public int AddTotalPrice(int total_Price) {//�� ���ݿ� ������
		this.totalPrice += total_Price;
		return this.totalPrice;
	}


	public Order() {//������
		gimbaps=new Gimbap[15];
		numberOfGimbap=0;
	}
	
	public Gimbap getGimbap(int index) {
		return gimbaps[index];
	}
	

	public int getNumberOfGimbap() {//�ֹ��� ����� ������ ����
		return numberOfGimbap;
	}

	public void addGimbap(Gimbap a) {//����� �迭�� �ֹ� ���α׷����� ������ ����� �ּҸ� �־���
		gimbaps[numberOfGimbap++]=a;
	}
}
