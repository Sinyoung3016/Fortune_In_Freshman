package project02;

public class BookTest {
	public static void main(String[] args) {
	
		Book book1 = new Novel("Į�� �뷡","����");
		System.out.println("������ȣ " + book1.getnumber()+ "��,"+ book1 +" (������ ��ü�� : " +book1.getLateFee(7)+")");
		Book book2 = new Novel("Į�� �뷡","����");
		System.out.println("������ȣ " + book2.getnumber()+ "��,"+ book2 +" (������ ��ü�� : " +book2.getLateFee(7)+")");
		Book book3 = new Poet("�̻��� ��������","�̻�");
		System.out.println("������ȣ " + book3.getnumber()+ "��,"+ book3 +" (������ ��ü�� : " +book3.getLateFee(7)+")");
		Book book4 = new Poet("�ϴð� �ٶ��� ���� ��","������");
		System.out.println("������ȣ " + book4.getnumber()+ "��,"+ book4 +" (������ ��ü�� : " +book4.getLateFee(7)+")");
		Book book5 = new ScienceFiction("������� ��","�Ƽ� C.Ŭ��ũ");
		System.out.println("������ȣ " + book5.getnumber()+ "��,"+ book5 +" (������ ��ü�� : " +book5.getLateFee(7)+")");
		Book book6 = new ScienceFiction("�����̽� ������","�Ƽ� C.Ŭ��ũ");
		System.out.println("������ȣ " + book6.getnumber()+ "��,"+ book6 +" (������ ��ü�� : " +book6.getLateFee(7)+")");
		System.out.println();
		System.out.println("������ȣ 1���� 2���� ���� å�ΰ�? :"+ book1.equals(book2));
		
		

	}
}
