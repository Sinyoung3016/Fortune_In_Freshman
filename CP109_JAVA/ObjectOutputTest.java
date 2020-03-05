package banking;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.ObjectOutputStream;

public class ObjectOutputTest {

	public static void main(String[] args) {
		
		Bank bank = new Bank(); // Bank 객체 생성
		Customer tony_stark = new Customer("Tony", "Stark"); // 고객 생성
		CheckingAccount cacc = new CheckingAccount(10000); // 계좌 생성
		tony_stark.addAccount(cacc); // 고객에게 계좌 추가
		bank.addCustomer(tony_stark); // 은행에 고객 추가
		System.out.println(bank.getCustomer(0)); // Bank 객체의 정보 확인
		System.out.println(bank.getCustomer(0).getAccount(0).getAcctType() + " 계좌 " 
				+ bank.getCustomer(0).getAccount(0)); // 계좌 정보 확인
		
		try (FileOutputStream fos = new FileOutputStream("Bank.obj");
				ObjectOutputStream oos = new ObjectOutputStream(fos);){
			oos.writeObject(bank);
			System.out.println("\n데이터 파일로 객체 저장하기 완료!\n");
		} catch (FileNotFoundException e) {
		    // e.printStackTrace();
		    System.out.println("지정된 파일을 찾을 수 없습니다!\n");
	    } catch (IOException e) {
			System.out.println("입출력 예외 발생");
		} catch (Exception e) {
			System.out.println("기타 예외 발생");
		}
		// try-with-resources 문을 사용했기 때문에 finally 블록 불필요!
		
		System.out.println("프로그램을 종료합니다.\n");
	}

}
