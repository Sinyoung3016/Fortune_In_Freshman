package termProject;
//���ſ��� ����
public class SideMenu {//��ü �ȿ��� �Ŵ��� ������ ������ ��� ���� ���� �޴� ������ �ֹ� ����
	private int number = 0;// ��ȣ
	private int price = 0;// �� �޴��� ����
	private int sidetotalPrice = 0;// �� ���� * ���� = �� �޴��� �Ѱ���
	private int howMany = 0;// � �ֹ�?
	
	private String name = " ";// �޴� �̸�
	
	
	public SideMenu(int number, String name, int price){// �����ڷ� �޴� ��ȣ �̸� ���� ���� 
		this.number = number;
		this.name = name;
		this.price = price;
	}
	
	public void setTotalPriceIn(int howMany) {// �ֹ��� �ٷ� �߰�
		this.howMany += howMany;
		sidetotalPrice += price * howMany;
	}
	
	public void setTotalPriceOut(int howMany) {// �ùٸ� ���� �Էµ��� �ʾ����� , ��� ������ �߰��� ���� �����
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
		return "(" + this.number + ") " + this.name + " : " + this.price+" ��" ;
	}
}
