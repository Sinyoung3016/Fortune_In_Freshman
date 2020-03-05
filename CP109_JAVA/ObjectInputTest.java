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
			System.out.println(bank.getCustomer(0).getAccount(0).getAcctType() + "계좌 " 
					+ bank.getCustomer(0).getAccount(0)); 
			
			System.out.println("\n데이터 파일에서 객체 읽어오기 성공!\n");
		} catch (FileNotFoundException e) {
			System.out.println("해당 파일이 없습니다!");
		} catch (IOException e) {
			System.out.println("입출력 예외 발생!");
		} catch (Exception e) {
			System.out.println("기타 예외 발생!");
		} finally {
			// ObjectOutputTest 프로그램에서는 try-with-resource를 이용했기 때문에 
			// 만들었던 스트림 객체를 닫아주는 close 메소드를 호출할 필요가 없었지만
			// 여기에서는 try-catch-finally를 사용했으므로 사용한 입력 스트림 객체를 명시적으로 닫아줘야 한다.
			if(ois != null) { // 스트림이 null인지 체크 
				try { 
					ois.close(); // close 하다가 예외가 발생할 수 있다. 
				} catch (IOException e) { 
					e.printStackTrace(); 
				} 
			}
			if(fis != null) { // 스트림이 null인지 체크 
				try { 
					fis.close(); // close 하다가 예외가 발생할 수 있다. 
				} catch (IOException e) { 
					e.printStackTrace(); 
				} 
			}
		}
		System.out.println("프로그램을 종료합니다.\n");
	}

	
}
