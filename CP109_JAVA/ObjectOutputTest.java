package banking;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.ObjectOutputStream;

public class ObjectOutputTest {

	public static void main(String[] args) {
		
		Bank bank = new Bank(); // Bank ��ü ����
		Customer tony_stark = new Customer("Tony", "Stark"); // �� ����
		CheckingAccount cacc = new CheckingAccount(10000); // ���� ����
		tony_stark.addAccount(cacc); // ������ ���� �߰�
		bank.addCustomer(tony_stark); // ���࿡ �� �߰�
		System.out.println(bank.getCustomer(0)); // Bank ��ü�� ���� Ȯ��
		System.out.println(bank.getCustomer(0).getAccount(0).getAcctType() + " ���� " 
				+ bank.getCustomer(0).getAccount(0)); // ���� ���� Ȯ��
		
		try (FileOutputStream fos = new FileOutputStream("Bank.obj");
				ObjectOutputStream oos = new ObjectOutputStream(fos);){
			oos.writeObject(bank);
			System.out.println("\n������ ���Ϸ� ��ü �����ϱ� �Ϸ�!\n");
		} catch (FileNotFoundException e) {
		    // e.printStackTrace();
		    System.out.println("������ ������ ã�� �� �����ϴ�!\n");
	    } catch (IOException e) {
			System.out.println("����� ���� �߻�");
		} catch (Exception e) {
			System.out.println("��Ÿ ���� �߻�");
		}
		// try-with-resources ���� ����߱� ������ finally ��� ���ʿ�!
		
		System.out.println("���α׷��� �����մϴ�.\n");
	}

}
