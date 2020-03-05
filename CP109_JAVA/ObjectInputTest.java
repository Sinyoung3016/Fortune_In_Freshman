package banking;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class ObjectInputTest {

	public static void main(String[] args) {
		
		ObjectInputStream ois = null;
		FileInputStream fis = null;
		Bank bank = null;
		
		try {
			fis = new FileInputStream(new File("Bank.obj"));
			ois = new ObjectInputStream(fis);
			bank = (Bank) ois.readObject();
			
			System.out.println(bank.getCustomer(0));
			System.out.println(bank.getCustomer(0).getAccount(0).getAcctType() + "���� " 
					+ bank.getCustomer(0).getAccount(0)); 
			
			System.out.println("\n������ ���Ͽ��� ��ü �о���� ����!\n");
		} catch (FileNotFoundException e) {
			System.out.println("�ش� ������ �����ϴ�!");
		} catch (IOException e) {
			System.out.println("����� ���� �߻�!");
		} catch (Exception e) {
			System.out.println("��Ÿ ���� �߻�!");
		} finally {
			// ObjectOutputTest ���α׷������� try-with-resource�� �̿��߱� ������ 
			// ������� ��Ʈ�� ��ü�� �ݾ��ִ� close �޼ҵ带 ȣ���� �ʿ䰡 ��������
			// ���⿡���� try-catch-finally�� ��������Ƿ� ����� �Է� ��Ʈ�� ��ü�� ��������� �ݾ���� �Ѵ�.
			if(ois != null) { // ��Ʈ���� null���� üũ 
				try { 
					ois.close(); // close �ϴٰ� ���ܰ� �߻��� �� �ִ�. 
				} catch (IOException e) { 
					e.printStackTrace(); 
				} 
			}
			if(fis != null) { // ��Ʈ���� null���� üũ 
				try { 
					fis.close(); // close �ϴٰ� ���ܰ� �߻��� �� �ִ�. 
				} catch (IOException e) { 
					e.printStackTrace(); 
				} 
			}
		}
		System.out.println("���α׷��� �����մϴ�.\n");
	}

	
}
