package project02;

public class BookTest {
	public static void main(String[] args) {
	
		Book book1 = new Novel("칼의 노래","김훈");
		System.out.println("관리번호 " + book1.getnumber()+ "번,"+ book1 +" (일주일 연체료 : " +book1.getLateFee(7)+")");
		Book book2 = new Novel("칼의 노래","김훈");
		System.out.println("관리번호 " + book2.getnumber()+ "번,"+ book2 +" (일주일 연체료 : " +book2.getLateFee(7)+")");
		Book book3 = new Poet("이상한 가역반응","이상");
		System.out.println("관리번호 " + book3.getnumber()+ "번,"+ book3 +" (일주일 연체료 : " +book3.getLateFee(7)+")");
		Book book4 = new Poet("하늘과 바람과 별과 시","윤동주");
		System.out.println("관리번호 " + book4.getnumber()+ "번,"+ book4 +" (일주일 연체료 : " +book4.getLateFee(7)+")");
		Book book5 = new ScienceFiction("유년기의 끝","아서 C.클라크");
		System.out.println("관리번호 " + book5.getnumber()+ "번,"+ book5 +" (일주일 연체료 : " +book5.getLateFee(7)+")");
		Book book6 = new ScienceFiction("스페이스 오디세이","아서 C.클라크");
		System.out.println("관리번호 " + book6.getnumber()+ "번,"+ book6 +" (일주일 연체료 : " +book6.getLateFee(7)+")");
		System.out.println();
		System.out.println("관리번호 1번과 2번은 같은 책인가? :"+ book1.equals(book2));
		
		

	}
}
