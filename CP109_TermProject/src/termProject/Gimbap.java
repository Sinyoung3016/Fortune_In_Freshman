package termProject;

import java.util.ArrayList;

public class Gimbap {//�ŵ����� ����
	private int price;//����
	private int amount;//����
	private String name;//��� �̸�
	private String riceAmount;//���� ��
	private String remove_Ingredients="";//������ �����
	private ArrayList<String>removeIngredients=new ArrayList<String>();//������ ������, ������ ����ᰡ �̹� ������ ������� ��� �ߺ��Ǿ��ٰ� ������ֱ� ���ؼ� �������.

	
	
	public void addRemoveIngredients(String remove_Ingredients) {//������ ����Ḧ �߰�������
		this.remove_Ingredients+= remove_Ingredients+" ";
		removeIngredients.add(remove_Ingredients);
	}
	
	public String getRemoveIngredients(int index) {//������ ����Ḧ ��ȯ
		return removeIngredients.get(index);
	}
	
	
	public int getRemoveIngredientsSize() {//������ ������� ������ ������ ��ȯ
		return removeIngredients.size();
	}
	
	public void setNull() {//����� �߸� ���������� ��� �ʱ�ȭ�����ֱ� ���� �������.
		this.name=null;
		this.riceAmount=null;
		this. price=0;
		this.amount=0;
		this.remove_Ingredients="";
		removeIngredients.clear();
		
	}
	public String getName() {//����� �̸��� ��ȯ
		return name;
	}
	public void setName(String name) {//����� �̸��� ����
		this.name = name;
	}
	public void setRiceAmount(String riceAmount) {//����� �䷮�� ����
		this.riceAmount = riceAmount;
	}
	public void setPrice(int price) {//����� ������ ����
		this.price = price;
	}
	public void setAmount(int amount) {//����� ������ ����
		this.amount = amount;
	}
	public String toString() {
		return String.format("[%s]: ���� ��: %s, ����: %d, ����: %d, ������ �����: %s", name,riceAmount,price,amount,remove_Ingredients);
	}
	
	public int getPrice() {//����� ������ ��ȯ
		return price;
	}

	public int getAmount() {//����� ������ ��ȯ
		return amount;
	}

	
}
