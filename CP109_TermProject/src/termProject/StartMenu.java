package termProject;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import authorization.LogIn;
import authorization.SignUp;

public class StartMenu {//�ŵ����� ����
	Scanner input = new Scanner(System.in);
	private SignUp signMember = new SignUp();
	private LogIn logIn = new LogIn();
	private boolean FisrtOutBool;
	private boolean IdBool;
	private boolean PwBool;
	private int number;
	
	public LogIn getLogIn() {
		return logIn;
	}

	private boolean isYourMember;
	
	
	public boolean getIsYourMember() {
		return isYourMember;
	}

	public boolean startProgram() throws IOException {

		do {
			FisrtOutBool = false;
			while (true) {
				try {
					System.out.println("\n�ϵ��� ��� ��õ �� �׸��� �ְ�� ������ LUXURY & GORGEOUS COLLABORATION");
					System.out.println("	              �� ����ſ������� ����������� ���� ���� ȯ���մϴ� ��");
					System.out.println("������������������������������������������������������������������������������������������������������������������");
					System.out.println("   ��1��: �α���   ��2��: ��ȸ�� �ֹ�   ��3��: ȸ������   ��4��: ���α׷� ����");
					System.out.println("������������������������������������������������������������������������������������������������������������������");
					System.out.println("�� ���� ������ TAKE OUT ������ �Դϴ�.");

					System.out.print("\n[��ȣ�� �Է��ϼ���] : ");
					number = input.nextInt();
					input.nextLine();
				} catch (InputMismatchException e) {
					input = new Scanner(System.in);
					System.out.println("�� �߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.\n");
					continue;
				}
				if (number < 1 || number > 4) {
					System.out.println("�� �߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.\n");
					continue;
				}
				break;
			}
			switch (number) {
			case 1:
				do {
					IdBool = false;
					if (logIn .CheckID()) {// ���̵� �Է��� ����
						do {
							PwBool = false;
							if (logIn.CheckingPassWord(logIn.getLoadID().getID_PW_Line())) {// ��� �Էµ� ����
								System.out.println("\n-------------------------------["+logIn.getID()+"]�� �ݰ����ϴ�!-------------------------------\n");
								isYourMember=true;
								return true;
							
							} else {// ��� �Է� ����
								while (true) {
									try {
										System.out.println("��������������������������������������������������������������������������������������������������������");
										System.out.println("   ��1��: ���̵� ���Է�   ��2��: ��й�ȣ ���Է�   ��3��: ó�� ȭ������");
										System.out.println("��������������������������������������������������������������������������������������������������������");
										System.out.print("\n[��ȣ�� �Է��ϼ���] : ");
										number = input.nextInt();
										input.nextLine();
									} catch (InputMismatchException e) {
										input = new Scanner(System.in);
										System.out.println("���߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.\n");
										continue;
									}
									if (number < 1 || number > 3) {
										System.out.println("���߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.\n");
										continue;
									}
									break;
								}
								if (number == 1) {
									PwBool = false;// ��й�ȣ ���Է� ����������
									IdBool = true;// ���̵�� ���Է���
								} else if (number == 2) {
									PwBool = true;// ��� ���Է�
								} else if (number == 3) {
									PwBool = false;// ��� ���Է� x
									IdBool = false;// ���̵� ���Է� x
									FisrtOutBool = true;// ó��ȭ��
								}
							}
						} while (PwBool);
					} else {// ���̵� �Է� ����
						while (true) {
							try {
								System.out.println("������������������������������������������������������������������");
								System.out.println("��1��: ���̵� ���Է�	��2��: ó�� ȭ������	");
								System.out.println("������������������������������������������������������������������");
								System.out.print("\n[��ȣ�� �Է��ϼ���] : ");
								number = input.nextInt();
								input.nextLine();
							} catch (InputMismatchException e) {
								input = new Scanner(System.in);
								System.out.println("�� �߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.\n");
								continue;
							}
							if (number < 1 || number > 2) {
								System.out.println("�� �߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.\n");
								continue;
							}
							break;
						}
						if (number == 1) {
							IdBool = true;
						} else if (number == 2) {
							IdBool = false;
							FisrtOutBool = true;
						}
					}

				} while (IdBool);
				break;// case 1: ����

			case 2:
				isYourMember=false;
				// ��ȸ���ֹ� �޼ҵ� ����
				FisrtOutBool = false;
				return true;

			case 3:
				signMember.SignUp_Program();
				System.out.println("�� ȸ������ �Ϸ� ��");
				System.out.println("�� ó�� ȭ������ �ǵ��ư��ϴ�.\n");
				FisrtOutBool = true;
				break;

			case 4:
				FisrtOutBool = false;
				
			}
		} while (FisrtOutBool);
		return false;
	}
}
